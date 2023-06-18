
class B {
    // protected int aaa =23;
    public B(){
        System.out.println("B 상속 받았습니다."); 
    }
    public B(int a){
        System.out.println("현재는 B클래스");
    }
    protected int AA(){
        return 13123;
    }
}
class C extends B{
    public C(){
        System.out.println("C 상속 받았습니다.");
    }
    public C(int a){
        System.out.println("현재는 C클래스");
    }
}

class D extends C{
    public D(){
        System.out.println("D 상속 받았습니다.");
    }
    public D(int a){
        System.out.println("현재는 D클래스");
    }
}
class E extends C{
    public E(){
        System.out.println("D 상속 받았습니다.");
    }
    public E(int a){
        System.out.println("현재는 E클래스");
    }
    public String number(){
        return "100";
    }
    // @Override
    // public int AA(){
    //     return 0;
    // }
    
}
public class constructor_Ex {
    public static void main(String[] args) {
        D user = new D(1);
        System.out.println("");
        
        B user1 = new E(1);
        System.out.println("");
        
        B user2 = new E(1);
        // System.out.println(user2());
        // System.out.println(user2());
        // System.out.println(user2.number()); 
        System.out.println("");
        
        E user3 = new E(1);
        System.out.println(user3.number()); 
        System.out.println(user3.AA());
        
    }
}
