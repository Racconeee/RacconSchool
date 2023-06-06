/*
 * 문제: 모든 데이터 유형의 값 쌍을 나타내는 일반 Pair 클래스를 구현합니다. Pair 클래스에는 다음과 같은 기능이 있어야 합니다.


값 쌍을 저장하려면 두 개의 개인 필드가 있어야 합니다.
값 쌍을 초기화하기 위해 두 개의 인수를 사용하는 생성자가 있어야 합니다.
쌍의 첫 번째 값과 두 번째 값을 검색하는 getter 메서드가 있어야 합니다.
"(value1, value2)" 형식으로 쌍의 문자열 표현을 반환하는 toString() 메서드가 있어야 합니다.

 */
class Pair<I, S>{
    private I first;
    private S second;

    public Pair( I first, S second){
        this.first = first;
        this.second = second;
    }
    public I getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }
    public String toString(){
        return  "("+first+" , "+ second+")";
    }
}
public class Ex_Generic01 {
    public static void main(String[] args) {
     
        Pair< Integer , String > pair1 = new Pair<>(10, "Hello");
        System.out.println("pair1의 값");
        System.out.println(pair1.getFirst()); // Output: 10
        System.out.println(pair1.getSecond()); // Output: "Hello"
        System.out.println(pair1); // Output: (10, Hello)
        System.out.println();
        
        Pair< Double , Character > pair2 = new Pair<>(3.14, 'A');
        System.out.println("pair2의 값");
        System.out.println(pair2.getFirst()); // Output: 3.14
        System.out.println(pair2.getSecond()); // Output: 'A'
        System.out.println(pair2); // Output: (3.14, A)
    }
}
