package erg7.klironomikotita;

public class Main {

    public static void main(String[] args){
        Ypallilos[] ergaz=new Ypallilos[6];
        ergaz[0]=new Oromisthios(50, "Alex", (short)101, "DevOps", "Example 1");
        ergaz[1]=new Oromisthios(50, "Marry", (short)102, "IoT", "Example 2");
        ergaz[2]=new Misthotos(2, 6, "James", (short)201, "Cyber Security", "Example 3");
        ergaz[3]=new Misthotos(2, 6, "Antony", (short)202, "Cyber Security Engineer", "Example 4");
        ergaz[4]=new Proistamenos(4, 16, "Daves", (short)301, "Back end dev", "Example 5");
        ergaz[5]=new Proistamenos(4, 16, "Jordan", (short)302, "Full stack dev", "Example 6");
        
        for(int i=0;i<ergaz.length;i++)
            System.out.println("Ypallilos "+(i+1)+": "+ergaz[i]+"\n");
    }
}
