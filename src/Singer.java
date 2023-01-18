public class Singer extends Person {
    private String bandName;

    public Singer(String name, String dasignation, String bandName) {
        super(name, dasignation);
        this.bandName = bandName;
    }
    public void sing (){
        System.out.println(getName()+" is sing");
    }
    public void lean (){
        super.lean();
    }
    public void wolk (){
        super.wolk();
    }
    public void eat (){
        super.eat();
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
