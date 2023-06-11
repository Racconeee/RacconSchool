/*
 * 예제에서는 Thread1, Thread2가 실행되고 메인 스레드가 3초 이후 Thread1을 interrupt()을 호출하여 중단시킨다. 
Thread1이 실행되는 동안 while(True)을 만나서 무한루프에 빠지면서 Thread 1 is running을 호출하게 된다.
이후에 thread1을 interrupted시키면 thread1은 결국 종료되고
Thread2는 for문에 의해 출력문을 매초 출력하고 종료되게 된다
이후 메인스레드 까지 종료되고 프로그램은 종료되게 된다.
 */

public class Thread_ex3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Thread 1 is running.");
                    // Thread.yield(); // Yield to allow other threads to run
                    if (Thread.interrupted()) {
                        System.out.println("Thread 1 was interrupted.");
                        break;
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2 is running. Count: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 2 was interrupted.");
                        return;
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        // Interrupt thread1 after 3 seconds
        try {
            Thread.sleep(3000);
            thread1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
