//이번 예제는 자바의 예외처리에 대한 예제이다.
//정수를 0으로 나누었을때 발생하는 예외에 대해서 알아보고 비정상적으로 프로그램이 종료되지 않도록
//예외처리를 하는 예제이다.

public class Exception_Ex1 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println((int)(Math.random()*10));
                    result = number/(int) (Math.random() * 10);
                    System.out.println(result);
                }
            } catch (ArithmeticException e) {
                System.out.println(0);
            }finally{
                System.out.println("End");
            }
    }
}

