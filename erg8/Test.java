package erg8;
import java.util.Scanner;
public class Test {
    
    public static void main(String[] args) {
        Scanner scrInt=new Scanner(System.in);
        System.out.print("Dwse arithmo oximatwn: ");
        int N=scrInt.nextInt();
        Vehicle[] oximata=new Vehicle[N];
        int thesi;

        SystimaDieythynsis s=new SystimaDieythynsis();
        SystimaDieythynsis s2=new SystimaDieythynsis();
        
        Mihani mihani=new Mihani(1400,80);
        Mihani mihani2=new Mihani(3799,485);
        
        for(int i=0;i<(int)(0.7*oximata.length);i++){
            do{
                thesi=(int)(Math.random()*N);
            }while(oximata[thesi]!=null);
            oximata[thesi]=new Car("Kwsras","AAA1234",2013,s,mihani2,4);
        }

        for(int i=(int)(0.7*oximata.length);i<(int)(0.85*oximata.length);i++){
            do{
                thesi=(int)(Math.random()*N);
            }while(oximata[thesi]!=null);
            oximata[thesi]=new Truck("Maria","ABC1111",2019,s,mihani,5);
        }

        for(int i=(int)(0.85*oximata.length);i<oximata.length;i++){
            do{
                thesi=(int)(Math.random()*N);
            }while(oximata[thesi]!=null);
            oximata[thesi]=new Motorcycle("Anna","CBA4321",2021,s2,mihani2,true);
        }

        for(int i=0;i<oximata.length;i++)
            System.out.println(oximata[i]);
    }
}
