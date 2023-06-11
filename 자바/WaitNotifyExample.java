public class WaitNotifyExample {
    public static void main(String[] args) {
        Message message = new Message();

        Thread senderThread = new Thread(new Sender(message));
        Thread receiverThread = new Thread(new Receiver(message));

        senderThread.start();
        receiverThread.start();
    }

    static class Message {
        private String content;
        private boolean isSent = false;

        public synchronized void send(String message) {
            while (isSent) {
                try {
                    // Wait until the message is received by the receiver
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.content = message;
            isSent = true;
            System.out.println("Sent: " + content);

            // Notify the receiver thread that the message is sent
            notify();
        }

        public synchronized String receive() {
            while (!isSent) {
                try {
                    // Wait until a message is sent by the sender
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            isSent = false;
            System.out.println("Received: " + content);

            // Notify the sender thread that the message is received
            notify();

            return content;
        }
    }

    static class Sender implements Runnable {
        private final Message message;

        public Sender(Message message) {
            this.message = message;
        }

        public void run() {
            String[] messages = { "Hello", "How are you?", "Goodbye" };

            for (String msg : messages) {
                System.out.println("--------------------");
                message.send(msg);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    static class Receiver implements Runnable {
        private final Message message;
        
        public Receiver(Message message) {
            this.message = message;
        }
        
        public void run() {
            for (int i = 0; i < 3; i++) {
                message.receive();
            }
        }
    }
}
