package erg10.erg101;

public class Painting implements ProsPolisi {
    
    private String perigraphh;
    private double timh;
    private String texnotropia;


    public Painting() {
    }

    public Painting(String perigraphh, double timh, String texnotropia) {
        this.perigraphh = perigraphh;
        this.timh = timh;
        this.texnotropia = texnotropia;
    }

    public String getPerigraphh() {
        return this.perigraphh;
    }

    public void setPerigraphh(String perigraphh) {
        this.perigraphh = perigraphh;
    }

    public double getTimh() {
        return this.timh;
    }

    public void setTimh(double timh) {
        this.timh = timh;
    }

    public String getTexnotropia() {
        return this.texnotropia;
    }

    public void setTexnotropia(String texnotropia) {
        this.texnotropia = texnotropia;
    }

    @Override
    public String toString() {
        return "perigraphh='" + getPerigraphh() + "'" +", timh='" + getTimh() + "'" +", texnotropia='" + getTexnotropia() + "'";
    }

    @Override
    public String perigraphh() {
        return perigraphh;
    }

    @Override
    public double timi() {
        return timh*100;
    }

    @Override
    public double MinTimi(double pososto) {
        return timh*pososto/100;
    }


}
