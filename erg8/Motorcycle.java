package erg8;

public class Motorcycle extends Vehicle{

    private boolean sidecar;

    public Motorcycle() {
    }

    public Motorcycle(String idioktitis, String arKykloforias, int etosKat, SystimaDieythynsis sysdief, Mihani eng,boolean sidecar) {
        super(idioktitis, arKykloforias, etosKat, sysdief, eng);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return this.sidecar;
    }

    public boolean getSidecar() {
        return this.sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

    @Override
    public String toString() {

        if(sidecar)
            return super.toString()+" and has a sidecar";
        else
            return super.toString()+" and does not has a sidecar ";
    }

    @Override
    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear "+getIdioktitis());
    }
    
}
