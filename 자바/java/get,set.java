
class Employee{
    private String name;
    private int age;
    private int salary;
    
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

    public static void Salary_upgrade(Employee A, Employee B) {
        //user1의 참조값이 A에 대입되어서 A와 user1은 값은 객체를 참조하는 상태가 됩니다.
        //따라서 A.setSalary의 값이 변하는 것은 user1.setSalary()를 사용하는 것과 똑같은 행위 입니다.
        if (A.getSalary() < B.getSalary()) { //결국 접근자를 활용해서 user1,user2에 대한 Salary의 값을 비교해서 값을 증가시켜줍니다.
            B.setSalary(B.getSalary() * 2); // 겂을 증가시키는 것은 설정자인 set을 활용해서 진행하게 됩니다.
        } else {
            A.setSalary(A.getSalary() * 2);
        }
        System.out.println("UPGRADE!!!");
        System.out.println(A.toString());
        System.out.println(B.toString());
    }
    public String toString(){ //String형으로 반환할것이기 때문에 반환타입에 String을 넣어주고 toString()을 통해서 객체의 값을 호출할수 있게 된다.
        return name+","+age+","+salary;   
    }

}

public class get,set {
    public static void main(String[] args) {
        Employee user1 = new Employee(); // Employee클래스에 대한 user1 객체변수를 생성해준다.
        user1.setAge(30); // 설정자를 통해서 user1에 대한 값을 입력한다.(변수들로 바로 하지못하는 이유는 접근지정자가 private로 설정되어있기 때문이다. )
        user1.setName("Lee");
        user1.setSalary(10000000);
        System.out.println(user1.toString()); //override한 toString을 통해서 객체의 변수값들을 호출해준다.
        //같은 방법으로 user2도 생성해준다.
        Employee user2 = new Employee();
        user2.setAge(20);
        user2.setName("Joo");
        user2.setSalary(1000000);
        System.out.println(user2.toString());
        
        Employee.Salary_upgrade(user1,user2); 
        //  int나 String뿐만 아니라 객체변수도 매개변수로 사용할수 있다.


        
    
    }

}
