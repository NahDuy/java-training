package BTAbstract;

public abstract class Phone {

    // Thêm danh bạ
    public abstract void insertPhone(String name, String phone);

    // Xóa khỏi danh bạ
    public abstract void removePhone(String name);

    // Cập nhật số điện thoại
    public abstract void updatePhone(String name, String newPhone);

    // Tìm kiếm theo tên
    public abstract void searchPhone(String name);

    // Sắp xếp danh bạ
    public abstract void sort();
}
