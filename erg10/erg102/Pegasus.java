package erg10.erg102;

public class Pegasus extends Horse implements iBird {

    public Pegasus() {
    }
    
    public Pegasus(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void chirp() {
        System.out.println("chirp...");
    }
}
