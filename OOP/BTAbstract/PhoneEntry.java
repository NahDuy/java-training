package BTAbstract;

public class PhoneEntry {
    private String name;
    private String phone;

    public PhoneEntry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}
