package Inheritance;
class Shape{
    String kk = "kiki";
    public void hi(){
        System.out.println(this.kk);
    }
}
class Ractangle extends Shape{
    String kk = "kaka";
    @Override
    public void hi(){
        System.out.println(this.kk);
    }
}

class Circle extends Shape{

}

public class Inheritance_ex1 {
    static void casting(Shape s) {
        s.hi();
        Circle c = (Circle) s;
    }
    public static void main(String[] args) {
        Shape mo = new Shape();
        Ractangle rt = new Ractangle();
        System.out.println("rt를 통한 hi\n");
        mo.hi();
        rt.hi();
        

        Ractangle r = new Ractangle();
        try{
            casting(r); //r -> s
            // System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("문자열을 숫자로 변경할 수 없습니다.");
        }catch(ClassCastException e){
            System.out.println("classCastException 예외입니다..");
        }catch(Exception e){
            System.out.println("zz");
        }
    }
}
