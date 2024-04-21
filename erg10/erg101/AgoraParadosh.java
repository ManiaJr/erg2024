package erg10.erg101;

public class AgoraParadosh implements Asfalismeno {

    private String ProsParadErgo;
    private boolean efthrafsto;
    private double posoAsfalishs;
    private int ogkos;
    private double timh;
    private int varos;


    public AgoraParadosh() {
    }

    public AgoraParadosh(String ProsParadErgo, boolean efthrafsto, double posoAsfalishs, int ogkos) {
        this.ProsParadErgo = ProsParadErgo;
        this.efthrafsto = efthrafsto;
        this.posoAsfalishs = posoAsfalishs;
        this.ogkos = ogkos;
    }
    

    public String getProsParadErgo() {
        return this.ProsParadErgo;
    }

    public void setProsParadErgo(String ProsParadErgo) {
        this.ProsParadErgo = ProsParadErgo;
    }

    public boolean isEfthrafsto() {
        return this.efthrafsto;
    }

    public boolean getEfthrafsto() {
        return this.efthrafsto;
    }

    public void setEfthrafsto(boolean efthrafsto) {
        this.efthrafsto = efthrafsto;
    }

    public double getPosoAsfalishs() {
        return this.posoAsfalishs;
    }

    public void setPosoAsfalishs(double posoAsfalishs) {
        this.posoAsfalishs = posoAsfalishs;
    }

    public int getOgkos() {
        return this.ogkos;
    }

    public void setOgkos(int ogkos) {
        this.ogkos = ogkos;
    }

    public double getTimh() {
        return this.timh;
    }

    public void setTimh(double timh) {
        this.timh = timh;
    }

    public int getVaros() {
        return this.varos;
    }

    public void setVaros(int varos) {
        this.varos = varos;
    }



    @Override
    public int varos() {
        return varos*1000;
    }

    @Override
    public boolean efthrafsto() {
        return efthrafsto;
    }

    @Override
    public double posoAsfalishs() {
        return timh*0.1;
    }

    @Override
    public String perigraphh() {
        return perigraphh();
    }

    @Override
    public double timi() {
        return timh*100;
    }

    @Override
    public double MinTimi(double pososto) {
        return timh*pososto/100;
    }


    @Override
    public String toString() {
        return " ProsParadErgo='" + getProsParadErgo() + "'" +", efthrafsto='" + isEfthrafsto() + "'" +", posoAsfalishs='" + getPosoAsfalishs() + "'" +", ogkos='" + getOgkos() + "'" +", timh='" + getTimh() + "'" +", varos='" + getVaros() + "'" ;
    }

    
}
