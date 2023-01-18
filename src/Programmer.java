public class Programmer extends Person{
    private String company;
    public Programmer(String name, String dasignation,String company) {
        super(name, dasignation);
        this.company=company;

    }
    public void codding(){
        System.out.println(getName()+" is codding");
    }
    public void lean(){
        super.lean();
    }
    public void work(){
        super.wolk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
