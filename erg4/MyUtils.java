package erg4;

public class MyUtils {
    
    public static int anazitisiMeEpwnymo(Foititis[] f,String lastname){
        int thesi=-1;
        for(int i=0;i<f.length;i++){
            if(lastname.equals(f[i].getLastname())){
                thesi=i;
                break;
            }
        }
        return thesi;
    }
}
