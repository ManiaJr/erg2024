package erg8;

public class Mihani {
    
    private int kyvismos;
    private int ippodynami;


    public Mihani() {
    }


    public Mihani(int kyvismos, int ippodynami) {
        this.kyvismos = kyvismos;
        this.ippodynami = ippodynami;
    }


    public void leitoyrgia(){
        System.out.println("leitoyrgia");
    }
    public void kinisi(){
        System.out.println("kinisi");
    }
    public void svysimo(){
        System.out.println("svysimo");
    }

    public int getKyvismos() {
        return this.kyvismos;
    }

    public void setKyvismos(int kyvismos) {
        this.kyvismos = kyvismos;
    }

    public int getIppodynami() {
        return this.ippodynami;
    }

    public void setIppodynami(int ippodynami) {
        this.ippodynami = ippodynami;
    }

}
