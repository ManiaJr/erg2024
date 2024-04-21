package erg4;

public class Foititis {
    
    private String onoma;
    private String lastname;
    private short AM;
    private short ee;


    public Foititis() {
    }

    public Foititis(String onoma, String lastname, short AM, short ee) {
        this.onoma = onoma;
        this.lastname = lastname;
        this.AM = AM;
        this.ee = ee;
    }

    public String getOnoma() {
        return this.onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public short getAM() {
        return this.AM;
    }

    public void setAM(short AM) {
        this.AM = AM;
    }

    public short getEe() {
        return this.ee;
    }

    public void setEe(short ee) {
        this.ee = ee;
    }

    @Override
    public String toString() {
        return " onoma='" + getOnoma() + "'" +
            ", lastname='" + getLastname() + "'" +
            ", AM='" + getAM() + "'" +
            ", ee='" + getEe() ;
    }

}
