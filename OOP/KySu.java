 class CanBo {
    protected String name;
    protected int age;
    protected String sex;
    protected String address;

    public CanBo(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

class KySu extends CanBo  {
    private String branch;
    public KySu(String name, int age, String sex, String address, String branch) {
        super(name, age, sex, address); 
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
   
}
class CongNhan extends CanBo{
    private int level;
    public CongNhan(String name, int age, String sex, String address, int level) {
        super(name, age, sex, address); 
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
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
