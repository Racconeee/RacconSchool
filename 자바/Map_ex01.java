package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_ex01 {
    public static void main(String[] args) {
        Map<String,String> book = new HashMap<>();
        
        book.put("영어", "40점");
        book.put("수학", "80점");
        book.put("국어", "100점");
        book.put("과학", "70점");

        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("과목을 입력하세요");

            String key = sc.next();
            if(key.equals("quit")){
                break;
            }
            System.out.println("단어의 의미는 : " + book.get(key));
        }while(true);
    }    
}
