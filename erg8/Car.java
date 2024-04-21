package erg8;

public class Car extends Vehicle {

    private int doors;

    public Car() {
    }

    public Car(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng,int doors) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.doors = doors;
    }
    
    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return super.toString()+" number of doors= "+getDoors();
    }

    @Override
    public void drive() {
        System.out.println("You need a car driving license dear"+getIdioktitis());
    }
    
}
