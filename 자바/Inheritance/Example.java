interface IVehicle {
  // 기본 tuneUp 비용값 반환
  public double tuneUpCost();

  // 차량이 주어진 수의 승객이 탑승 가능한지에 대한 논리값 반환
  public boolean canCarry(int numPassengers);

}

class Car implements IVehicle {
  int mileage;
  int year;
  int numDoors;
  double cost = 0; // 새롭게 cost라는 변수를 생성해서 자동차값을 설정함

  Car(int mileage, int year, int numDoors) {
    this.mileage = mileage;
    this.year = 2023 - year; // 현재 년도에 비례해서 가격을 생성함
    this.numDoors = numDoors;
  }

  // constructor goes here
  public double tuneUpCost() {
    double cost = this.mileage * 10 + this.year * 100 + this.numDoors * 100;
    // mileage * 5000 ,year * 10000 ,numDoors * 100 모두 속성당 가격을 부과해서 총 가격을 생성해서 출력과
    // 리턴을 해줌.
    System.out.println("자동차의 비용은 : " + cost + "원입니다.");
    return cost;
  }

  public boolean canCarry(int numPassengers) {
    if (numPassengers < 7) {
      System.out.println(numPassengers + "명은 탑승이 가능합니다."); // 자동차가 6명까지 탈수 있어서 탈수 있다는 true반환
      return true;
    }
    System.out.println(numPassengers + "명은 탑승이 불가능합니다."); // 탈수 없다면 false를 반환하게 된다.
    return false;
  }

  // 차량이 주어진 년도 이전에 만들어진 것인지 반환
  boolean builtBefore(int otherYear) {
    System.out.println("1");
    return this.year < otherYear;
  }
}

class Bicycle implements IVehicle {
  int mileage;
  int numGears;
  int cost = 0;

  Bicycle(int mileage, int numGears) {
    this.mileage = mileage;
    this.numGears = numGears;
  }

  public double tuneUpCost() {
    double cost = this.mileage * 200 + this.numGears * 1000;
    System.out.println("오토바이의 비용은 : " + cost + "원입니다.");
    return cost;
  }

  public boolean canCarry(int numPassengers) {
    if (numPassengers < 3) {
      System.out.println(numPassengers + "명은 탑승이 가능합니다.");
      return true;
    }
    System.out.println(numPassengers + "명은 탑승이 불가능합니다.");
    return false;
  }

}

public class Example {
  public static void main(String[] args) {

    System.out.println("newKidsBike 의 정보");
    IVehicle newKidsBike = new Bicycle(1000, 8);
    newKidsBike.tuneUpCost();
    newKidsBike.canCarry(1);

    System.out.println("");
    System.out.println("oldCar1 의 정보");
    IVehicle oldCar1 = new Car(200000, 1995, 2);
    oldCar1.tuneUpCost();
    oldCar1.canCarry(3);
    // oldCar1.builtBefore(1) IVehicle에서는 접근이 안됨

    System.out.println("");
    System.out.println("oldCar 의 정보");
    Car oldCar = new Car(30000, 1995, 2);
    oldCar.tuneUpCost();
    oldCar.canCarry(6); // 6명 탑승하는 차
    oldCar.builtBefore(7);
  }
}