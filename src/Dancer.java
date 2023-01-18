public class Dancer extends Person {
    private String groupName;
    public Dancer(String name, String dasignation,String groupName) {
        super(name, dasignation);
        this.groupName=groupName;
    }
    public void dancing(){
        System.out.println(getName()+" is dancing");
    }
    public void lean(){
        super.lean();
    }
    public void walk(){
        super.wolk();
    }
    public void eat(){
        super.eat();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
