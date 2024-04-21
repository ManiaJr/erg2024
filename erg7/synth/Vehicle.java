package erg7.synth;

public class Vehicle{

    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieythynsis sysdief;
    private Mihani eng;


    public Vehicle() {
    }

    public Vehicle(int etosKat, SystimaDieythynsis sysdief, Mihani eng) {
        this.etosKat = etosKat;
        this.sysdief = sysdief;
        this.eng = eng;
    }


    public String getIdioktitis() {
        return this.idioktitis;
    }

    public void setIdioktitis(String idioktitis) {
        this.idioktitis = idioktitis;
    }

    public String getArKykloforias() {
        return this.arKykloforias;
    }

    public void setArKykloforias(String arKykloforias) {
        this.arKykloforias = arKykloforias;
    }

    public int getEtosKat() {
        return this.etosKat;
    }

    public void setEtosKat(int etosKat) {
        this.etosKat = etosKat;
    }

    public SystimaDieythynsis getSysdief() {
        return this.sysdief;
    }

    public void setSysdief(SystimaDieythynsis sysdief) {
        this.sysdief = sysdief;
    }

    public Mihani getEng() {
        return this.eng;
    }

    public void setEng(Mihani eng) {
        this.eng = eng;
    }


    @Override
    public String toString() {
        return "idioktitis= " + getIdioktitis() +", arKykloforias= " + getArKykloforias() +", etosKat= " + getEtosKat() +", sysdief='exw'" +", eng='[ kyvismos= "+ eng.getKyvismos()+" ippodynami= " + eng.getIppodynami() + "]'";
    }
    

}