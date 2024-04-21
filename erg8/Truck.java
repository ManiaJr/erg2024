package erg8;

public class Truck extends Vehicle {

    private int axes;

    public Truck() {
    }

    public Truck(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng,int axes) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.axes = axes;
    }

    public int getAxes() {
        return this.axes;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    }

    @Override
    public String toString() {
        return super.toString()+" number of axes= "+getAxes();
    }

    @Override
    public void drive() {
        System.out.println("You must be a professional driver. This is a "+getAxes()+" axels truck Mr."+getIdioktitis());
    }
    
}
