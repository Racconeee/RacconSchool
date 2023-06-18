class Airplane {
 public void land() {
 System.out.println("착륙");
 }
 public void fly() {
 System.out.println("일반비행모드");
 }
 public void takeOff() {
 System.out.println("이륙");
 }
}
class SupersonicAirplane extends Airplane {
 public static final int NORMAL =1;
 public static final int SUPERSONIC =2;
 public int flyMode = NORMAL;
 public void fly() {
 if (flyMode == SUPERSONIC) {
 System.out.println("초음속비행모드");
 }
 else {
 super.fly(); // (b)
 }
 }
}
public class SupersonicAirplaneExample {
 public static void main(String args[]) {
 SupersonicAirplane sa = new SupersonicAirplane();
 // (a)
 sa.takeOff();
 sa.fly();
 sa.flyMode = SupersonicAirplane.SUPERSONIC;
 sa.fly();
 sa.flyMode = SupersonicAirplane.NORMAL;
 sa.fly();
 sa.land();
 }
}