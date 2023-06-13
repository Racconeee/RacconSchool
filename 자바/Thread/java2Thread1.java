/*
 * 프로그램을 진행시켜보고 나오는 결과물에 대해서 왜 그런지 서술하시오
 * 이후에 주석을풀고 나오는 결과물에 대해서도 서술하시오
 * 이 프로그램은 쓰레드를 Thread클래스를 상속받아서 구현하는 것, Runnalbe 인터페이스를 구현하는 방식 2가지로 멀티 스레드를 구현하엿다.
 * 이후에 t1,t2스레드를 start()메소드를 활용해서 각각 run()으로 구현한 부분에 대해서 실행을 시켜주게 되었고.
 * t1,t2가 실행되는 동안 main쓰레드는 종료를 마치게 되어서 먼저 소요시간 0을 출력하게 된다.
 * 
 * 이후 주석을 풀고 나오는 결괴물은 
 * t1,t2를 실행시켰지만 join()이라는 메소드를 활용해서 main스레드가 t1,t2작업이 끝날때 까지 기다리게 되고
 * 두 프로그램이 종료되면 마지막에 소요시간을 출력하게 된다.
 */



public class java2Thread1 {
    public static void main(String[] args) {
        
    Thread t1 = new dog();
    
    Thread t2 = new Thread(new panda());

    t1.start();
    t2.start();

    long startTime = System.currentTimeMillis();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {

        }

    System.out.println("소요시간 " + (System.currentTimeMillis() - startTime) );
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
