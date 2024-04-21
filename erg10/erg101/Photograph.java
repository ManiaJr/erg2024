package erg10.erg101;

public class Photograph implements ProsPolisi {

    private String perigraphh;
    private double timh;
    private boolean color;


    public Photograph() {
    }

    public Photograph(String perigraphh, double timh, boolean color) {
        this.perigraphh = perigraphh;
        this.timh = timh;
        this.color = color;
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

    public boolean isColor() {
        return this.color;
    }

    public boolean getColor() {
        return this.color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "perigraphh='" + getPerigraphh() + "'" +", timh='" + getTimh() + "'" +", color='" + isColor() + "'" ;
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
