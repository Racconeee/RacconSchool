/* 이 코드에 대해서 문제점이 무엇인지 서술하고 왜 이러한 결과가 출력되었는지,
 * 이런 결과를 해결하기 위해 코드를 수정하시오.
 * 
 * 다음과 같은 결과가 출력되는 이유는 현재 2개의 스레드가 실행되면서 서로 run을 통해서 acc.withdraw()을 호출할떄
 * 동시에 호출하게 되면서 balance의 값이 음수가 나오게 된다. 
 * 이를 해결하기 위해서는 두개의 스레드중 하나의 스레드만 들어갈 수 있게 임계구역을 설정해주어야하는데
 * 이 임계구역을 설정해주는 방법은 메소드안에 선언, 메소드 전체선언 2가지의 방법이 있다.
 * 수정된 코드의 경우에는 메소드 전체에 임계구역을 설정해주어서 한번에 하나의 스레드만 접근 가능하게 설정하엿다.
 */

public class java2Thread3{
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
        if(balance >= money){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            balance -= money;
        }
    }
}

class Runnable3 implements Runnable{
    Account acc = new Account();
    public void run(){
        while(acc.getBalance() > 0){
        int money = (int)(Math.random()*3+1)*100;
        acc.withdraw(money);
        System.out.println("balance" + acc.getBalance());
    }
}
}