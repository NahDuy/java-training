// 1. Enum là gì?
//    👉 Là kiểu dữ liệu đại diện cho một tập giá trị cố định.

enum TrangThaiDonHang {
    CHO_XU_LY,
    DANG_XU_LY,
    DA_GIAO,
    DA_HUY
}

public class Enum {
    public static void main(String[] args) {

        // 3. Enum dùng như nào?
        //    👉 Khai báo, gán giá trị, dùng trong switch-case.
        TrangThaiDonHang trangThai = TrangThaiDonHang.DANG_XU_LY;

        System.out.println("Trạng thái: " + trangThai);

        switch (trangThai) {
            case CHO_XU_LY:
                System.out.println("Đơn hàng đang chờ xử lý");
                break;
            case DANG_XU_LY:
                System.out.println("Đơn hàng đang được xử lý");
                break;
            case DA_GIAO:
                System.out.println("Đơn hàng đã giao");
                break;
            case DA_HUY:
                System.out.println("Đơn hàng đã bị hủy");
                break;
        }

        // 2. Enum để làm gì?
        //    👉 Giúp tránh dùng string rời rạc, sai chính tả.
        System.out.println("\nTất cả trạng thái:");
        for (TrangThaiDonHang tt : TrangThaiDonHang.values()) {
            System.out.println("- " + tt);
        }
    }
}
