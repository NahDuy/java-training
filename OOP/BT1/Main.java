package BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB q = new QLCB();
        sc.nextLine(); // Đọc dòng thừa do nextInt()

        while (true) {
            System.out.println("\n=== QUẢN LÝ CÁN BỘ ===");
            System.out.println("1 : Thêm Cán Bộ");
            System.out.println("2 : Tìm Cán Bộ theo tên");
            System.out.println("3 : Hiển thị toàn bộ Cán Bộ");
            System.out.println("4 : Thoát chương trình");
            System.out.print("Lựa chọn: ");
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("a : Thêm Công Nhân");
                    System.out.println("b : Thêm Kỹ Sư");
                    System.out.println("c : Thêm Nhân Viên");
                    String type = sc.nextLine();

                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Giới tính: ");
                    String sex = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String address = sc.nextLine();

                    switch (type) {
                        case "a":
                            System.out.print("Bậc: ");
                            int level = Integer.parseInt(sc.nextLine());
                            q.addCanBo(new CongNhan(name, age, sex, address, level));
                            break;
                        case "b":
                            System.out.print("Ngành đào tạo: ");
                            String taskKySu = sc.nextLine();
                            q.addCanBo(new KySu(name, age, sex, address, taskKySu));
                            break;
                        case "c":
                            System.out.print("Công việc: ");
                            String taskNhanVien = sc.nextLine();
                            q.addCanBo(new NhanVien(name, age, sex, address, taskNhanVien));
                            break;
                        default:
                            System.out.println("Loại không hợp lệ.");
                            break;
                    }
                    break;

                case "2":
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = sc.nextLine();
                    q.searchCanBo(searchName).forEach(cb -> System.out.println(cb.toString()));
                    break;

                case "3":
                    q.getAllCanBo();
                    break;

                case "4":
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
