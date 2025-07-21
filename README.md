
---

## 🔐 **Authentication – Xác thực**

### 1. **Nó là gì?**

Là quá trình **xác minh danh tính** người dùng.

> Bạn là ai?

---

### 2. **Dùng để làm gì?**

* Kiểm tra xem người dùng có hợp lệ không
* Cho phép đăng nhập, cấp token hoặc session
* Bắt đầu một phiên làm việc bảo mật

---

### 3. **Dùng như thế nào?**

* Nhập **username + password**
* Xác minh **OTP**, vân tay, Google login...
* Tạo và trả về **JWT** hoặc session

---

## 🛂 **Authorization – Phân quyền**

### 1. **Nó là gì?**

Là quá trình **kiểm tra quyền hạn** sau khi người dùng đã xác thực.

> Bạn được phép làm gì?

---

### 2. **Dùng để làm gì?**

* Xác định xem người dùng **có quyền thực hiện hành động nào**
* Bảo vệ tài nguyên quan trọng
* Giới hạn chức năng theo vai trò hoặc quyền

---

### 3. **Dùng như thế nào?**

* Gán **role** (`admin`, `editor`, `user`)
* Gán **permission** (`create:user`, `delete:post`)
* Kiểm tra quyền trước khi cho phép hành động

---

### 📌 **Ví dụ 1 – Kiểm tra bằng Role (Annotation)**

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin/users")
public List<User> getAllUsers() {
    return userService.findAll();
}
```

### 📌 Ví dụ 2 – Kiểm tra quyền ở tầng Filter với `nimbus-jose-jwt`

```java
// Lấy token từ header Authorization
String token = request.getHeader("Authorization").substring(7);

// Parse JWT bằng thư viện nimbus
SignedJWT signedJWT = SignedJWT.parse(token);

// Trích xuất danh sách role từ claim "roles"
List<String> roles = (List<String>) signedJWT.getJWTClaimsSet().getClaim("roles");

// Nếu request truy cập đường dẫn /admin nhưng không có role ADMIN → chặn lại
if (request.getRequestURI().startsWith("/admin") && !roles.contains("ADMIN")) {
    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
    return;
}
```

---

## 🔒 **Secure API – Bảo mật API**

### 1. **Nó là gì?**

Là quá trình **bảo vệ các API khỏi truy cập trái phép, lộ dữ liệu, và các tấn công mạng**.

> Làm sao để API chỉ phục vụ đúng người, đúng quyền, đúng cách?

---

### 2. **Dùng để làm gì?**

* Ngăn chặn **truy cập trái phép**
* Bảo vệ dữ liệu và tài nguyên khỏi tấn công
* Giữ cho hệ thống **ổn định và an toàn**

---

### 3. **Dùng như thế nào?**

* ✅ **Xác thực & Phân quyền**: dùng JWT, OAuth2, API key
* ✅ **HTTPS**: mã hóa toàn bộ luồng truyền
* ✅ **Rate Limiting**: hạn chế số lượng request theo IP/token
* ✅ **Input Validation**: kiểm tra kỹ dữ liệu đầu vào
* ✅ **Ẩn thông tin nội bộ**: không trả lỗi chi tiết ra ngoài
* ✅ **CORS**: cấu hình cho phép domain cụ thể gọi API
* ✅ **Token Expiry & Refresh**: giới hạn thời gian sống của JWT
* ✅ **Logging & Monitoring**: ghi log và phát hiện hành vi bất thường

---

### 📌 **Ví dụ – Cấu hình CORS trong Spring Boot**

```java
@Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**")
                    .allowedOrigins("https://.......")
                    .allowedMethods("GET", "POST", "PUT", "DELETE")
                    .allowedHeaders("*");
        }
    };
}
```

---

