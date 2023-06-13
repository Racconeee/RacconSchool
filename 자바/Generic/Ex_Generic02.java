//제네릭 클래스 Person에게는 2개의 제네릭 타입 T,S가 있는데 Wrapper클래스만 오는것이 아닌 객체도 제레닉으로 활용할 수 있다는 것을 알 수 있는 예제이다.
//



class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){this.rank = rank;}
}
class Person<T,S>{
    public T info;
    public S id;
    Person(T info, S id){
        this.info =info;
        this.id = id;
    }
}
public class Ex_Generic02 {
    public static void main(String[] args) {
        Person<EmployeeInfo , Integer> p1 = new Person<EmployeeInfo, Integer> (new EmployeeInfo(10),1);
    System.out.println(p1.info.rank+"  ,  "+p1.id);
    System.out.println(p1.info);
    }
}
