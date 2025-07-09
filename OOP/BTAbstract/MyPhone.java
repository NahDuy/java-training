package BTAbstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPhone extends Phone {

    private List<PhoneEntry> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                if (!entry.getPhone().contains(phone)) {
                    entry.setPhone(entry.getPhone() + " : " + phone);
                    System.out.println("Số điện thoại được cập nhật thêm.");
                } else {
                    System.out.println("Tên và số điện thoại đã tồn tại.");
                }
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
                System.out.println("Đã cập nhật số cho " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy " + name);
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneEntry entry : phoneList) {
            if (entry.getName().equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy: " + entry);
                return;
            }
        }
        System.out.println("Không tìm thấy " + name);
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, Comparator.comparing(PhoneEntry::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Đã sắp xếp danh bạ theo tên:");
        for (PhoneEntry entry : phoneList) {
            System.out.println(entry);
        }
    }
}
