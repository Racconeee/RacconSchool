/* 멀티 쓰레드를 이용하기 위해서 스레드를 만들어야 하는데 만드는데는 2가지 방식이 존재한다.
 * dog클래스는 Thread클래스를 직접 상속 받아서 만드는 방식
 * panda 클래스는 Runnable 인터페이스를 구현하면서 만드는 방식이다
 * 아래의 예제를 실행시켜 보게된다면 Thread-0,Thread-1 두가지가 서로 섞여서 출력이 되게 된다.
 */

public class Thread_ex1 {
    public static void main(String[] args) {
        
    dog t1 = new dog();
    
    Runnable r = new panda();
    Thread t2 = new Thread(r);

    t1.start();
    t2.start();

    for (int i = 0; i < 30; i++) {
        System.out.println("2");
    }

    /*
    아래의 2 문장은 단일 스레드를 사용해서 결과값이 절대 섞이지가 않는다.
    for(int i = 0; i<10; i++){
        System.out.println(i);
    }
    for(int j = 0; j<10; j++){
        System.out.println(i);
    }
     */
    }

}

class dog extends Thread{
    public void run(){
        for (int i = 0; i <30; i++) {
            System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출
        }
    }
}

class panda implements Runnable{
    public void run(){
        for (int i = 0; i < 30; i++) {
            //Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
