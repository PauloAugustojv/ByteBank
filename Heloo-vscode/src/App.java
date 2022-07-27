public class App {
    
    public void m1(int a) {
        System.out.println(a);
        m2();
        System.out.println(a);
    }

 public void m2(String nome){

 }
 public static void main(String[] args){
     App t = new App();
     t.m1(2);
     t.m2("paulo");


 }

}

