package erg7.klironomikotita;

public class Oromisthios extends Ypallilos {
    private int wresErg;


    public Oromisthios(int wresErg, String name, short am, String eidikothta, String address) {
        super(name,am,eidikothta,address);
        this.wresErg = wresErg;
    }


    public int getWresErg() {
        return this.wresErg;
    }

    public void setWresErg(int wresErg) {
        this.wresErg = wresErg;
    }

    @Override
    public String toString() {
        return "name="+getName()+", am="+getAm()+", eidikothta="+getEidikothta()+", address="+getAddress()+", wres ergasias="+getWresErg()+", salary="+(getWresErg()*7+0.6*getWresErg());
    }

}
