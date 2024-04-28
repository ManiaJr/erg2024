package erg12;

public class Outer {

    private String inString = "Outer inString";
    private String outString = "Outer outString";

    public static void main(String[] args) {
        
        Outer out=new Outer();
        Outer.Inner inn=out.new Inner();

        System.out.println(inn.getInString());//Inner String
        System.out.println(inn.getOutString());//Outer outString

        Outer.StaticMan sm=new Outer.StaticMan();
        sm.method1();
        sm.method2();
        sm.method3();
        sm.method4();
        System.out.println(sm.getOutString());
    }

    public Outer(){

        class ConInner {
            public void method() {
                System.out.println( "ConInner: " + outString );
                System.out.println( "ConInner: " + inString );
            }
        }
        ConInner ci=new ConInner();
        ci.method();

        Printable p=new Printable() {
            @Override public void print(){
                System.out.println("Giorgos Maniatakos");
            }
        };

        p.print();

        
    }

    public interface Printable {
        public void print();
    }

    public class Inner {
        private String inString = "Inner inString";
        public String getInString() { return this.inString; }
        public String getOutString() { return outString; }
    }

    public static class StaticMan {
        public void method1() {}
        void method2() {}
        private void method3() {}
        protected void method4() {}
        public String getOutString() {
            String result = "";
            //result = outString;
            return result;
        }
    }

    
}
