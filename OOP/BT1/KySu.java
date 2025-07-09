package BT1;



class KySu extends CanBo  {
    private String task;
    public KySu(String name, int age, String sex, String address, String task) {
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

