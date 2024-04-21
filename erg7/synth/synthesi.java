package erg7.synth;
import java.util.Scanner;
public class synthesi {
    
    public static void main(String[] args) {
        Scanner scrStr=new Scanner(System.in);
        Scanner scrInt=new Scanner(System.in);
        
        //2.1
        Vehicle[] cars=new Vehicle[3];

        SystimaDieythynsis s=new SystimaDieythynsis();
        SystimaDieythynsis s2=new SystimaDieythynsis();
        
        Mihani mihani=new Mihani(1400,80);
        Mihani mihani2=new Mihani(3799,485);
        
        cars[0]=new Vehicle(2001,s,mihani);
        cars[1]=new Vehicle(2024,s2,mihani2);
        cars[2]=new Vehicle(2013,s2,mihani);
        
        // 2.2
        for(int i=0;i<cars.length;i++){
            System.out.print("Dwse Arithmo Kykloforias toy IX: ");
            cars[i].setArKykloforias(scrStr.nextLine());
            System.out.print("Dwse to Onoma toy Idioktiti toy IX: ");
            cars[i].setIdioktitis(scrStr.nextLine());
        }

        //2.3
        int thesi;

        //1)
        System.out.print("Ti kyvismo exei to aytokinhto sthn thesh: ");
        thesi=scrInt.nextInt();
        System.out.println(cars[thesi].getEng().getKyvismos());
        cars[thesi].getEng().kinisi();

        //2)
        System.out.print("Ti ippodynami exei to aytokinhto sthn thesh: ");
        thesi=scrInt.nextInt();
        System.out.println(cars[thesi].getEng().getIppodynami());
        cars[thesi].getSysdief().striveiAristera();

        //3)
        System.out.print("Poios einai o idioktitis toy aytokinhtoy , kai to etos kataskeyeis toy: ");
        thesi=scrInt.nextInt();
        System.out.println(cars[thesi].getIdioktitis()+" "+cars[thesi].getEtosKat());
        cars[thesi].getEng().svysimo();
        
        // System.out.println(cars[0]);
    }
}
