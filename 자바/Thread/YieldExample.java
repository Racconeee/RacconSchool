/*
 * yield() 에 대한 예제인다.
 * yield 을 통해서 양보를 하지만 스케줄러에 의해서 원하는 대로 출력은 되지않고
 * 확률만 증가시키는 코드이다. 절대적으로 양보하는 것이 아니다.
 */

public class YieldExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new CustomThread("Thread 1");
        Thread thread2 = new CustomThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }

    static class CustomThread extends Thread {
        private final String name;

        public CustomThread(String name) {
            this.name = name;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " - Count: " + i);

                // Check if the count is divisible by 2
                if (name == "Thread 1") {
                    // Use yield() to give other threads a chance to execute
                    Thread.yield();
                }
            }
        }
    }
}
