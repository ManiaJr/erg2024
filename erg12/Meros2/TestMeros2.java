package erg12.Meros2;

public class TestMeros2 {
    public static void main(String[] args) throws ArrayOverFlow{
        
        //2
        String[] scs=new String[4];
        String[] scs2=new String[4];
        Integer[] sci=new Integer[4];

        SetClass StringPin=new SetClass(scs);
        SetClass intPin=new SetClass(sci);

        System.out.println("String");
        StringPin.insert("ena");
        StringPin.insert("dyo");
        StringPin.insert("tria");
        StringPin.insert("tessera");
        StringPin.insert("pente");
        System.out.println(StringPin);
        

        StringPin.delete("dyo");
        System.out.println(StringPin);
        System.out.println(StringPin.find("tessera"));

        

        System.out.println("Integer");
        intPin.insert(1);
        intPin.insert(2);
        intPin.insert(3);
        intPin.insert(4);
        intPin.insert("null");

        intPin.delete(2);
        System.out.println(intPin);

        System.out.println(intPin.find(4));


        //4
        scs[0]=null;
        scs[1]="2";
        scs[2]="3";
        scs[3]="10";

        scs2[0]=null;
        scs2[1]="2";
        scs2[2]="3";
        scs2[3]="10";

        if(equals(scs, scs2))
            System.out.println("Einai");
        else
            System.out.println("Den einai");
    }

    //4
    public static <T> boolean equals(T[] first, T[] second){
        if(first.length!=second.length){
            return false;
        }else{
            for(int i=0;i<first.length;i++){
                if(first[i]!=null){
                    if(second[i]!=null){
                        if(!first[i].equals(second[i]))
                            return false;
                    }else{
                        return false;
                    }
                }else{
                    if(second[i]!=null){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
