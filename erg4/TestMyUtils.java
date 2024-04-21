package erg4;
import java.util.Scanner;
public class TestMyUtils {
    
    public static void main(String[] args){
        Foititis[] foit=new Foititis[3];
        Scanner scrEp=new Scanner(System.in);
        for(int i=0;i<foit.length;i++){
            System.out.print("Dwse epwnymo foititi: ");
            foit[i]=new Foititis();
            foit[i].setLastname(scrEp.nextLine());
        }
        System.out.print("Dwse epwnymo foititi gia anazitisi: ");
        System.out.println(MyUtils.anazitisiMeEpwnymo(foit,scrEp.nextLine()));
    }
}
