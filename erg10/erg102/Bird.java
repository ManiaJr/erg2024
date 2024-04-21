package erg10.erg102;

public class Bird implements iBird {
    
    private int age;
    private int weight;


    public Bird() {
    }

    public Bird(int age, int weight) {
        if(age>0 && weight>0){
            this.age = age;
        this.weight = weight;
        }else{
            System.out.println("Prepei kai ta dyo na exoyn thetiki timh");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age>0)
            this.age = age;
        else
            System.out.println("H hlikia prepei na exei thetiki timh");
        
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if(weight>0)
            this.weight = weight;
        else
            System.out.println("To baros prepei na exei thetiki timh");
    }

    @Override
    public String toString() {
        return "age= " + getAge()+", weight= " + getWeight();
    }

    public void chirp(){
        System.out.println("chirp...");
    }

    public void fly(){
        System.out.println("fly high");
    }

}
