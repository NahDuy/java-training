package BTAbstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhoneBook extends Phone {

    private List<PhoneEntry> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                // Đã tồn tại người dùng → kiểm tra số điện thoại
                String[] phones = entry.getPhone().split(" : ");
                for (String p : phones) {
                    if (p.equals(phone)) {
                        System.out.println("Số điện thoại đã tồn tại.");
                        return;
                    }
                }
                entry.setPhone(entry.getPhone() + " : " + phone);
                System.out.println("Đã thêm số mới cho " + name);
                return;
            }
        }
        phoneList.add(new PhoneEntry(name, phone));
        System.out.println("Đã thêm " + name + " vào danh bạ.");
    }

    @Override
    public void removePhone(String name) {
        boolean removed = phoneList.removeIf(entry -> entry.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Đã xóa " + name + " khỏi danh bạ.");
        } else {
            System.out.println("Không tìm thấy " + name + " trong danh bạ.");
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                entry.setPhone(newPhone);
                System.out.println("Đã cập nhật số mới cho " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy " + name + " để cập nhật.");
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy: " + entry);
                return;
            }
        }
        System.out.println("Không tìm thấy " + name + " trong danh bạ.");
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, Comparator.comparing(PhoneEntry::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Danh bạ sau khi sắp xếp:");
        for (PhoneEntry entry : phoneList) {
            System.out.println(entry);
        }
    }
}
