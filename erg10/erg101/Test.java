package erg10.erg101;
import java.util.Scanner;
public class Test {
    
    public static void main(String[] args) {

        Scanner scrInt=new Scanner(System.in);
        Scanner scrStr=new Scanner(System.in);
        
        ProsPolisi[] ErgaProsPolisi=new ProsPolisi[10];
        ProsMetafora[] ErgaProsMetafora=new ProsMetafora[10];

        int epilogh;
        
        do{
            do{
                System.out.println("\t\tMenu\n\n 1.\tEnter work of art\n 2.\tPrepare work of art for delivery\n 3.\tDeliver work of art"+
                "\n 4.\tDisplay all availabe photographs\n 5.\tDisplay all availabe paintings\n 6.\tDisplay all availabe work of arts"+
                "\n 7.\tDisplay all work of arts to be delivered\n 8.\tEnd program");
                System.out.print("\n\tEnter selection (1-8) : ");
                epilogh=scrInt.nextInt();
            }while(epilogh<1 || epilogh>8);
    
            switch (epilogh) {
                case 1:
                    System.out.print("Photograph or Painting? : ");
                    String PhotoOrPaint=scrStr.nextLine();
                    String[] insert;
                    if(PhotoOrPaint.equals("Photograph")){
                        int thesi=-1;
                        for(int i=0;i<ErgaProsPolisi.length;i++){
                            if(ErgaProsPolisi[i]==null){
                                thesi=i;
                                break;
                            }
                        }

                        if(thesi==-1){
                            System.out.print("O pinakas einai gematos");
                            break;
                        }else{
                            System.out.print("Dwse perigraphh, timi kai ean exei color(me ', '): ");

                            insert=scrStr.nextLine().split(", ");

                            ErgaProsPolisi[thesi]=new Photograph(insert[0], Integer.parseInt(insert[1]), Boolean.valueOf(insert[2]));
                        }

                    }else if(PhotoOrPaint.equals("Painting")){

                        int thesi=-1;
                        for(int i=0;i<ErgaProsPolisi.length;i++){
                            if(ErgaProsPolisi[i]==null){
                                thesi=i;
                                break;
                            }
                        }

                        if(thesi==-1){
                            System.out.print("O pinakas einai gematos");
                            break;
                        }else{
                            System.out.print("Dwse perigraphh, timi kai texnotropia(me ', '): ");

                            insert=scrStr.nextLine().split(", ");

                            ErgaProsPolisi[thesi]=new Painting(insert[0], Integer.parseInt(insert[1]), insert[2]);
                        }
                    }else{
                        System.out.println("Wrong choise or typo");
                    }
                    break;
                case 2:
                    int counter=-1;
                    System.out.println("\t\tDiathesima erga texnhs");
                    for(int i=0;i<ErgaProsPolisi.length;i++){
                        if(ErgaProsPolisi[i]!=null){
                            System.out.println("thesi "+i+". "+ErgaProsPolisi[i]);
                            counter=i;
                        }
                            
                    }
                    if(counter==-1){
                        System.out.println("Den yparxoyn diathesima erga texnhs");
                        break;
                    }
                    System.out.print("Enter selection(0-"+counter+")");
                    int selection=scrInt.nextInt();
                    ErgaProsPolisi[selection]=null;
                    int thesi=-1;
                    for(int i=0;i<ErgaProsMetafora.length;i++){
                        if(ErgaProsPolisi[i]==null){
                            thesi=i;
                            break;
                        }
                    }
                    if(thesi==-1){
                        System.out.print("O pinakas einai gematos");
                        break;
                    }else{
                        System.out.print("Dwse pros paradwsh ergo texnhs, efthrafsto, poso asfalishs, ogko(me ', '): ");

                        insert=scrStr.nextLine().split(", ");

                        ErgaProsMetafora[thesi]=new AgoraParadosh(insert[0], Boolean.valueOf(insert[1]), Double.parseDouble(insert[2]), Integer.parseInt(insert[3]));
                    }

                    break;
                case 3:
                    
                    int counter3=-1;
                    System.out.println("\t\tDiathesima erga texnhs");
                    for(int i=0;i<ErgaProsMetafora.length;i++){
                        if(ErgaProsMetafora[i]!=null){
                            System.out.println("thesi "+i+". "+ErgaProsMetafora[i]);
                            counter3=i;
                        }
                            
                    }
                    if(counter3==-1){
                        System.out.println("Den yparxoyn diathesima erga texnhs pros metafora");
                        break;
                    }
                    System.out.print("Enter selection(0-"+counter3+")");
                    ErgaProsMetafora[scrInt.nextInt()]=null;

                    break;
                case 4:
                    boolean empty=true;
                    for(int i=0;i<ErgaProsPolisi.length;i++){
                        if(ErgaProsPolisi[i]!=null){
                            if(ErgaProsPolisi[i] instanceof Photograph){
                                System.out.println(ErgaProsPolisi[i]);
                                empty=false;
                            }
                        }              
                    }
                    if(empty)
                        System.out.println("Den yparxoyn diathesima erga texnhs typou Photograph");

                    break;
                case 5:
                    empty=true;
                    for(int i=0;i<ErgaProsPolisi.length;i++){
                        if(ErgaProsPolisi[i]!=null){
                            if(ErgaProsPolisi[i] instanceof Painting){
                                System.out.println(ErgaProsPolisi[i]);
                                empty=false;
                            } 
                        }              
                    }
                    if(empty)
                    System.out.println("Den yparxoyn diathesima erga texnhs typou Paints");
                    
                    break;
                case 6:
                    empty=true;
                    for(int i=0;i<ErgaProsPolisi.length;i++){
                        if(ErgaProsPolisi[i]!=null){
                            System.out.println(ErgaProsPolisi[i]);
                            empty=false;
                        }
                    }
                    if(empty)
                    System.out.println("Den yparxoyn diathesima erga texnhs");

                    break;
                case 7:
                    empty=true;
                    for(int i=0;i<ErgaProsMetafora.length;i++){
                        if(ErgaProsMetafora[i]!=null){
                            System.out.println(ErgaProsMetafora[i]);
                            empty=false;
                        }
                            
                    }
                    if(empty)
                    System.out.println("Den yparxoyn erga texnhs pros metafora");

                    break;
            
                default:
                    break;
            }
        }while(epilogh!=8);
    }
}
