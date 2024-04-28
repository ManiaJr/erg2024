package erg12.Meros2;

public class SetClass <T extends Comparable> {
    
    //2
    private T[] pin;

    public SetClass() {
    }

    public SetClass(T[] pin) {
        this.pin=pin;
    }

    public SetClass(int N) {
        pin=(T[]) new Object[N];
    }

    //2.a
    public void insert(T elem) throws ArrayOverFlow{
        boolean check=true;
        for(int i=0;i<pin.length;i++){
            if(pin[i]==null){
                pin[i]=elem;
                check=false;
                break;
            }
        }
        //3
        try{
            if(check) throw new ArrayOverFlow();
        }catch(ArrayOverFlow e){
            System.out.println("Array over flow");
        }
    }

    //2.b
    public void delete(T elem){
        for(int i=0;i<pin.length;i++){
            if(pin[i].equals(elem))
                pin[i]=null;
        }
    }

    //2.c
    public int find(T elem){
        int thesi=-1;
        for(int i=0;i<pin.length;i++){
            if(pin[i]!=null){
                if(pin[i].equals(elem)){
                    thesi=i;
                    break;
                }
            }
        }
        return thesi;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<pin.length;i++){
                s+=pin[i]+", ";
        }
        return s;
    }

}
