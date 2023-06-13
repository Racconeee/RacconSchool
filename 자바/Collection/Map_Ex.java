import java.util.HashMap;
import java.util.Map;

class Student{
    int number;
    String name;

    public Student(int number, String name){
        this.number = number;
        this.name = name;

    }
    public String toString(){
        return name;
    }
}

public class Map_Ex {
    public static void main(String[] args) {
        Map<String,Student> st = new HashMap<>();

        st.put("2005",new Student(9125, "금잔디"));
        st.put("3005",new Student(4225, "이발소"));
        st.put("2025",new Student(6325, "루피"));

        System.out.println(st.entrySet());
        st.remove("2005");
        System.out.println(st);

        //Map.Entry를 통해서 Map의 각 항복의 키와 값에 액세스해서 값을 하나씩 출력한다.
        //알고보니 foreach문으로 되어있다.
        for(Map.Entry<String,Student> s : st.entrySet()){
            String key =s.getKey();
            Student value =s.getValue();
            System.out.println("key : "+key + ", value= "+ value);
        }
    }
}
