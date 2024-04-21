package erg3;
import java.util.Scanner;
public class erg3{
    //3
    static int rev;
    static String Strrev="";
    static boolean apotelesma=false;
    public static void main(String[] args){
        Scanner scrInt=new Scanner(System.in);

        //2.a
        System.out.print("Eyresh paragontiko apo: ");
        int N=scrInt.nextInt();
        System.out.println("To paragontiko toy einai= "+paragontiko(N));

        //2.b
        System.out.print("Plythos apo arithmous ths akoloythias Fibonacci: ");
        int counter=scrInt.nextInt();
        Fibonacci(counter,1,1);
        System.out.println();

        //3
        int pali;
        counter=1;

        do{
            rev=0;
            do{

                System.out.print("Ypologismos palindromoy arithmoy(int)(exete akoma "+(11-counter)+" fores)"+": ");
                pali=scrInt.nextInt();

            }while(pali<1 || pali>99999);

            if(palindromos(pali)==pali)
                System.out.println("einai");
            else
                System.out.println("den einai");

            counter+=1;
        }while(counter<11);
        
        //3 parallagh
        Scanner scrStr=new Scanner(System.in);
        String Strpali;
        counter=1;

        do{

            Strrev="";
            do{

                System.out.print("Ypologismos palindromoy arithmoy(String)(exete akoma "+(11-counter)+" fores)"+": ");
                Strpali=scrStr.nextLine();

            }while(Strpali.length()<1 || Strpali.length()>99999);

            if(Strpalindoromos(Strpali).equals(Strpali))
                System.out.println("einai");
            else
                System.out.println("den einai");
            
            counter+=1;
        }while(counter<11);

        //4
        counter=1;
        do{
            apotelesma=false;
            if(ElegxosPrwtos(2,counter))
                System.out.println("o arithmos: "+counter+" einai");
            else
                System.out.println("o arithmos: "+counter+" den einai");
            ++counter;
        }while(counter<=10000);
        

        //5 Hanoi
        System.out.print("Give number of disks: ");
        int disks=scrInt.nextInt();
        Hanoi(disks,'A','C','B');
    }

    //2.a
    public static int paragontiko(int N){
        if(N==0)
            return 1;
        return N*paragontiko(N-1);
    }

    //2.b
    public static void Fibonacci(int counter, int prwtos, int deyteros){
        if(counter==0)
            return;
        System.out.print(prwtos+", ");
        Fibonacci(counter-1, deyteros, prwtos+deyteros);
    }

    //3
    public static int palindromos(int pali){
        if(pali>0){
            rev=rev*10+pali%10;
            palindromos(pali/10);
        }      
        return rev;
    }

    //3 parallagh
    public static String Strpalindoromos(String Strpali){
        if(Strpali.length()>0){
            Strrev+=Strpali.substring(Strpali.length()-1);
            Strpalindoromos(Strpali.substring(0,Strpali.length()-1));
        }
        return Strrev;
    }

    //4
    public static boolean ElegxosPrwtos(int counter, int elegxos){
        if(counter>=elegxos)
            return true;
        if(elegxos%counter==0)
            return false;
        return ElegxosPrwtos(counter+1, elegxos);
    }

    //5
    public static void Hanoi(int disks,char A,char C,char B){
        if(disks==1){
            System.out.println("disk "+disks+" "+A+"->"+C);
            return;
        }
        Hanoi(disks-1,A,B,C);
        System.out.println("disk "+disks+" "+A+"->"+C);
        Hanoi(disks-1,B,C,A);
    }
}