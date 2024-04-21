package erg9;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner scrInt=new Scanner(System.in);
        System.out.print("Plythos thlefwnwn: ");
        int N=scrInt.nextInt();
        Tilefono[] tilefona=new Tilefono[N];
        int StSynolo=0;
        int KiSynolo=0;
        double StKostos=0;
        double KiKostos=0;
        double SynoloProsSt=0;
        double SynoloProsKi=0;

        for(int i=0;i<(int)(0.6*tilefona.length);i++)
            tilefona[i]=new Stathero();
        for(int i=(int)(0.6*N);i<N;i++)
            tilefona[i]=new Kinito();

        int X=(int)(Math.random()*2000)+100;
        int counter=1;
        while(counter<=X){
            Tilefono pros;
            int thesi=(int)(Math.random()*N);
            if((int)(Math.random()*2)+1==1){
                pros=new Kinito();
                tilefona[thesi].setProsKinito((int)(Math.random()*600)+5);
            }
            else{
                pros=new Stathero();
                tilefona[thesi].setProsStathero((int)(Math.random()*600)+5);
            }
            tilefona[thesi].dial(pros.getNumber());
            counter+=1;
        }
        
        for(int i=0;i<tilefona.length;i++){
            //i
            System.out.println(tilefona[i].getNumber()+" "+String.format("%.2f", tilefona[i].costs(1)+tilefona[i].costs(2)));
            //ii & iii
            if(tilefona[i].getNumber().charAt(0)=='2'){
                StSynolo+=tilefona[i].getProsKinito()+tilefona[i].getProsStathero();
                StKostos+=tilefona[i].costs(1)+tilefona[i].costs(2);
            }
            else{
                KiSynolo+=tilefona[i].getProsKinito()+tilefona[i].getProsStathero();
                KiKostos+=tilefona[i].costs(1)+tilefona[i].costs(2);
            }
            //iv
            SynoloProsSt+=tilefona[i].costs(1);
            //v
            SynoloProsKi+=tilefona[i].costs(2);
        }
        //ii & iiix
        System.out.println("Sthathera: synolo deyteroleptwn: "+StSynolo+", kostos: "+String.format("%.2f",StKostos));
        System.out.println("Sthathera: synolo deyteroleptwn: "+KiSynolo+", kostos: "+String.format("%.2f",KiKostos));

        // iv & v & vi
        System.out.println("Kostos klhsewn pros stathera: "+String.format("%.2f", SynoloProsSt));
        System.out.println("Kostso klhsewn pros kinita: "+String.format("%.2f", SynoloProsKi));
        System.out.println("Synoliko kostsos: "+String.format("%.2f", SynoloProsKi+SynoloProsSt));
    }
}
