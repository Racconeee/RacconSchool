public class Thread_ex2 {
    public static void main(String[] args) {
        
    dog t1 = new dog();
    
    Runnable r = new panda();
    Thread t2 = new Thread(r);

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
