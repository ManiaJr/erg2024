package erg7.klironomikotita;

public class Misthotos extends Ypallilos {
    private int arTeknwn;
    private int proi;

    public Misthotos() {
    }

    public Misthotos(int arTeknwn, int proi,String name, short am, String eidikothta, String address) {
        super(name,am,eidikothta,address);
        this.arTeknwn = arTeknwn;
        this.proi = proi;
    }

    public int getArTeknwn() {
        return this.arTeknwn;
    }

    public void setArTeknwn(int arTeknwn) {
        this.arTeknwn = arTeknwn;
    }

    public int getProi() {
        return this.proi;
    }

    public void setProi(int proi) {
        this.proi = proi;
    }

    @Override
    public String toString() {
        return "name="+getName()+", am="+getAm()+", eidikothta="+getEidikothta()+", address="+getAddress()+", arithmos teknwn="+getArTeknwn()+", wres proipiresia="+getProi()+", salary="+(700+(0.5*getArTeknwn())*700+((getProi()%3)*0.1)*700);
    }
}
