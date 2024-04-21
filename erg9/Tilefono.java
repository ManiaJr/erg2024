package erg9;

abstract class Tilefono {
    
    private String number;
    private int ProsStathero;
    private int ProsKinito;


    public Tilefono() {
    }

    public Tilefono(String number) {
        this.number = number;
    }

    public Tilefono(int ProsStathero, int ProsKinito) {
        this.ProsStathero = ProsStathero;
        this.ProsKinito = ProsKinito;
    }

    public Tilefono(String number, int ProsStathero, int ProsKinito) {
        this.number = number;
        this.ProsStathero = ProsStathero;
        this.ProsKinito = ProsKinito;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getProsStathero() {
        return this.ProsStathero;
    }

    public void setProsStathero(int ProsStathero) {
        this.ProsStathero = ProsStathero;
    }

    public int getProsKinito() {
        return this.ProsKinito;
    }

    public void setProsKinito(int ProsKinito) {
        this.ProsKinito = ProsKinito;
    }

    abstract void dial(String Pros);

    abstract double costs(int i);

}
