// class Cup<T>{
//     private T beverage;

//     public T getBeverage(){
//         return beverage;
//     }
//     public void setBeverage(T beverage){
//         this.beverage = beverage;
//     }
// }
// class Beer{
//     public String toString(){
//         return "Beer";
//     }
    
// }
// class Boricha{
//     public String toString(){
//         return "Boricha";
//     }
    
// }

// public class aaa{

//     //제네릭 클래스의 이름 Cup
//     // 일반 클래스 aaa,Beer,Boricha
//     public static void main(String[] args) {
//         Cup<Boricha> c = new Cup<>();
//         // Cup<Beer> = new Cup<>();

//         c.setBeverage(new Boricha()); // Boricha 자료형에 Boricha 객체를 넣어준다  제네릭 클래스의 객체변수는 Boricha클래스이다.
//         //제네릭 클래스에 정의되어있는 것처럼 setBeverage의 입력 매개변수는 T Beverage이다.
//         //제네릭 클래스의 객체변수 c의 데이터 타입이 보리차여서 생성한 new Boricha가 인수로 전돨되는 것이다.

//         // Beer b = c.getBeverage();
//         //현재 c의 자료형의 값은 Boricha이고 beverage안에 들어있는 값은 보리차 클래스의 객체이다.
//         //이 객체를 아무상관없는 Beer자료형 b에 넣으려고하면 오류가 발생하게 된다.
        
//         Boricha a = c.getBeverage();
//         //객체 변수 a의 역활은 객체변수 c에 있는 Beverage값을 getBeverage()을 통해서 가져온 값을 저장하는 것이다.
//         //객체변수 b가 보리차의 객체인 이유는 제네릭  클래스의 객체변수 c의 타입 T는 보리차 클래스의 객체이기 때문이다.
//         // 따라서 이에 대한 반환값을 boricha 자료형안에 저장해야하기에 이러한 코드의 모습을 보인다
//         //즉, a는 boricha에 대한객체 변수이다.

//         System.out.println(a);

//         // c.setBeverage(new Beer());
//         // 객체 변수 c는 타입파라미터 T가 Beer class이다.
//         //제네릭 클래스에 정의 되어있는거같이 값을 설정하는 설정자인데
//         //반환값 타입 T는 Beer()클래스이다.

//         // Beer bb = c.getBeverage();
        
//         Cup<Beer> d = new Cup<>();

//         d.setBeverage(new Beer());
//         Beer V = d.getBeverage();

//         System.out.println(V);



//     }
// }