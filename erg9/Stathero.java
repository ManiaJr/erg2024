package erg9;
import java.util.Scanner;
public class Stathero extends Tilefono {

    public Stathero() {
        String s="2";
        for(int i=0;i<9;i++)
            s+=(int)(Math.random()*10);
        setNumber(s);
    }

    public Stathero(String number) {
        super(number);
    }

    public Stathero(int ProsStathero, int ProsKinito) {
        super(ProsStathero, ProsKinito);
    }

    public Stathero(String number,int ProsStathero, int ProsKinito) {
        super(number, ProsStathero, ProsKinito);
    }

    @Override
    void dial(String Pros) {
        if(Pros.charAt(0)=='6'){
            System.out.println("Klhsh spo to stathero thlefwno "+getNumber()+" pros to kinito me arithmo "+Pros);
            setProsKinito(getProsKinito()+(int)(Math.random()*1000));
        }       
        else{
            System.out.println("Klhsh spo to stathero thlefwno "+getNumber()+" pros to stathero me arithmo "+Pros);
            setProsStathero(getProsStathero()+(int)(Math.random()*1000));
        }
    }

    @Override
    double costs(int i){
        if(i==1){
            return 0.05*getProsKinito();
        }else if(i==2){
            return 0.02*getProsStathero();
        }else{
            System.out.println("Lathos");
            return 0;
        }
    }
    
}
