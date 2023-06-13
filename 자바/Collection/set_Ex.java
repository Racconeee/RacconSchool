import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_Ex {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<String>();
        TreeSet<String> set3 = new TreeSet<>();
        Set<String> set0 = new HashSet<String>();

        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheese");
        set1.add("Ham");
        set1.add("Ham");
        System.out.println(set1);
        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheese");
        set1.add("Ham");
        set1.add("Ham");
        System.out.println(set1);
        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheese");
        set1.add("Ham");
        set1.add("Ham");
        System.out.println(set1);

        String[] sample = {"말","개","소","개"};

        for(String a : sample){
            if(!set0.add(a)){
                System.out.println("중복되는 원소는 "+ a);
            }
        }
        System.out.println(set0.size()+ "중복되지않는 단어 : "+ set0 );

        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");
        s2.add("1");
        s2.add("C");

        //집합해서 s1에 값을 저장한다.
        //당연하게 중복되는 원소는 자동으로 제거된다.
        System.out.println(s1.containsAll(s2)); //부분집합
        System.out.println(s1);
        System.out.println(s1.containsAll(s2)); //합집합
        System.out.println(s1);
        System.out.println(s1.retainAll(s2)); // 교집합
        System.out.println(s1);
        System.out.println(s1.removeAll(s2)); // 차집합
        System.out.println(s1);
    }
}
