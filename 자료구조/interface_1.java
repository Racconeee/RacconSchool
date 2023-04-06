interface Controllable { // Controllable은 함수형 인터페이스이다.
    // 함수형 인터페이스는 여러개의 디폴트 메서드 , static메소드가 여러개 존재해도 상관없다.
    // 하지만 함수형 인터페이스는 추상 메소드가 하나여야만 한다.
    default void repair(String type) {
        System.out.println(type + "를 수리한다.");
    }

    static void reset(String type) {
        System.out.println(type + "를 초기화한다.");
    }

    void power(String type, boolean onOff); // 추상메소드 Power메소드
    // 추상 메소드란 자식 클래스에서 반드시 오버라이딩 해야만 사용 할 수있는 메소드를 뜻한다.
}

public class interface_1 {
    public static void main(String[] args) {
        String who = "나는 ";
        // 람다식 코드
        Controllable tv = (String type, boolean onoff) -> { // 람다식을 활용하여 전 문제보다 간결하게 처리가 가능하다.
            String verb = onoff == true ? "켠다." : "끈다."; // 매개변수 onoff의 값을 토대로 켠다, 끈다 값을 verb에 저장하게 된다
            System.out.println(who + type + " 전원을 " + verb);

        };

        tv.power("TV", true); // tv라는 객체를 통해 interface의 추상메소드 power을 오버라이딩한 람다식코드에 매개변수 tv,true을 전달한다.
        tv.power("TV", false);
        tv.repair("애어컨"); // tv라는 객체를 통해 interface에서 정의한 repair메소드에 매개변수 애어컨를 전달한다.
        Controllable.reset("TV");

    }
}