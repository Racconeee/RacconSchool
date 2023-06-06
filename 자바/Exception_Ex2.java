//아래예제는 형변환에 대한 예제이다.
//BankAccount에 객체를 생성해야 되는데 SavingsAccount에 객체를 생성해서 
// 형변환을 하려고 하는데 다운캐스팅때문에 안되는 모습을 보이고 있다.

class SavingsAccount{
    int money;
    public void deposit(int money){
        this.money += money;
    }
    public void withdraw(int money){
        this.money -= money;

    }
}
class BankAccount extends SavingsAccount{
    
    BankAccount(int money){
        this.money = money;
    }
    public int look_money(){
        return money;
    }
}



public class Exception_Ex2 {
    
    public static void main(String[] args) {

        BankAccount user = new BankAccount(10000);
        System.out.println(user.money);
        user.deposit(1000);
        System.out.println(user.look_money());

        try {
            SavingsAccount user1 = new SavingsAccount();
            BankAccount user2 = (BankAccount) user1;
        } catch (ClassCastException e) {
            System.out.println("잘못 만들엇습니다. 삭제 후 다시 만드시오");
        }

        
    }
}
