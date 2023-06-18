
class Shape {
   double areaCircle(double r) {
      System.out.println("오버라이딩전");
      return 0;
}
}
class circle extends Shape {

   @Override
   double areaCircle(double r) {
   System.out.println("class 객체의 areaCircle() 실행");
   return Math.PI*r*r;
   }

}
public class override_Ex {
   public static void main(String args[]) {
      int r =10;
      Shape user = new Shape();
      System.out.println("area :"+user.areaCircle(r));
      System.out.println();
      circle user1 = new circle();
      System.out.println("area :"+user1.areaCircle(r));
   }
}