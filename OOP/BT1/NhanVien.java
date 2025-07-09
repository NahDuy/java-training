package BT1;

class NhanVien extends CanBo{
    private String task;
    public NhanVien(String name, int age, String sex, String address, String task) {
        super(name, age, sex, address);
        this.task = task;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

}