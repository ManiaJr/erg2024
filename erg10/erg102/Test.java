package erg10.erg102;

public class Test {

    public static void main(String[] args) {
        Horse[] Ranch=new Horse[10];
        iBird[] Aviary=new iBird[10];

        for(int i=0;i<(int)(0.5*Ranch.length);i++){
            Ranch[i]=new Horse((int)(Math.random()*70)+50, (int)(Math.random()*70)+50);
            System.out.println("\tHorse");
            System.out.println(Ranch[i]);
            Ranch[i].whinny();
            Ranch[i].gallop();
        }

        for(int i=(int)(0.5*Ranch.length);i<Ranch.length;i++){
            Ranch[i]=new Pegasus((int)(Math.random()*200)+70, (int)(Math.random()*100)+70);
            System.out.println("\tPegasus");
            System.out.println(Ranch[i]);
            Ranch[i].whinny();
            Ranch[i].gallop();
            ((Pegasus)Ranch[i]).fly();
        }

        for(int i=0;i<(int)(0.5*Aviary.length);i++){
            Aviary[i]=new Bird((int)(Math.random()*15)+1, (int)(Math.random()*6)+1);
            System.out.println("\tBird");
            System.out.println(Aviary[i]);
            Aviary[i].chirp();
            Aviary[i].fly();
        }

        for(int i=(int)(0.5*Aviary.length);i<Aviary.length;i++){
            Aviary[i]=new Pegasus((int)(Math.random()*200)+1, (int)(Math.random()*100)+1);
            System.out.println("\tPegasus");
            System.out.println(Aviary[i]);
            ((Pegasus)Aviary[i]).whinny();
            ((Pegasus)Aviary[i]).gallop();
            ((Pegasus)Ranch[i]).fly();
        }
    }
}
