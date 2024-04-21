package erg7.klironomikotita;

public class Ypallilos {
    private String name;
    private short am;
    private String eidikothta;
    private String address;

    public Ypallilos() {
    }


    public Ypallilos(String name, short am, String eidikothta, String address) {
        this.name = name;
        this.am = am;
        this.eidikothta = eidikothta;
        this.address = address;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAm() {
        return this.am;
    }

    public void setAm(short am) {
        this.am = am;
    }

    public String getEidikothta() {
        return this.eidikothta;
    }

    public void setEidikothta(String eidikothta) {
        this.eidikothta = eidikothta;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
