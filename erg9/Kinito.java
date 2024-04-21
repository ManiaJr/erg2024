package erg9;
import java.util.Scanner;
public class Kinito extends Tilefono {


    public Kinito() {
        String s="6";
        for(int i=0;i<9;i++)
            s+=(int)(Math.random()*10);
        setNumber(s);
    }
    
    public Kinito(String number) {
        super(number);
    }

    public Kinito(int ProsStathero, int ProsKinito) {
        super(ProsStathero, ProsKinito);
    }

    public Kinito(String number,int ProsStathero, int ProsKinito) {
        super(number, ProsStathero, ProsKinito);
    }

    @Override
    void dial(String Pros) {
        if(Pros.charAt(0)=='6'){
            System.out.println("Klhsh spo to kinito thlefwno "+getNumber()+" pros to kinito me arithmo "+Pros);
            setProsKinito(getProsKinito()+(int)(Math.random()*1000));
        }       
        else{
            System.out.println("Klhsh spo to kinito thlefwno "+getNumber()+" pros to stathero me arithmo "+Pros);
            setProsStathero(getProsStathero()+(int)(Math.random()*1000));
        }     
    }

    @Override
    double costs(int i) {
        if(i==1){
            return 0.07*getProsKinito();
        }else if(i==2){
            return 0.06*getProsStathero();
        }else{
            System.out.println("Lathos");
            return 0;
        }
    }
    
}
