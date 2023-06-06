import java.sql.Time;

public class java2Thread4{
    public static void main(String[] args) {
        Runnable r = new Runnable3();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int money){
        while(balance < money){
            try {
                Thread.sleep(1000);
                System.out.println("Asd");
                wait();
            } catch (InterruptedException e) {

            }
            System.out.println("1번 일어났다");
            balance -= money;
        }
    }
    public void withdraw1(int money){
        System.out.println("sad");
        while(balance > money){
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                
            }
            System.out.println("1번 일어났다");
            balance -= money;
        }
    }
    public void deposit(int money){
        // time.sleep(1000);
        System.out.println("더하기");
        balance += money;
        notify();
    }
}

class Runnable3 implements Runnable{
    Account acc = new Account();
    public void run(){
        // while(acc.getBalance() > 0){
        int money = (int)(Math.random()*3+1)*100;
        // acc.withdraw(money);
        acc.withdraw1(money);
        acc.deposit(money);
        // sleep(1000);
        System.out.println("balance" + acc.getBalance());
    }

}