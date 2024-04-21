package erg10.erg102;

public class Horse {
    
    private int age;
    private int weight;


    public Horse() {
    }

    public Horse(int age, int weight) {
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
        return " age= " + getAge()+", weight= " + getWeight();
    }

    public void whinny(){
        System.out.println("whinny...");
    }

    public void gallop(){
        System.out.println("travel fast");
    }
}
