package Generic;

class Pair<T>{
    T first;
    T second;

    public Pair(T first ,T second){
        this.first = first;
        this.second = second;
    }
    public void swap(){
        T tmp = first;
        first = second;
        second = tmp;
        System.out.println("first " + first + " seconde : "+ second);
    }
    
}
public class MtArrayAlgTest {
    public static void main(String[] args) {

        Pair<Integer> a = new Pair<Integer>(10,20);
        a.swap();
        a.swap();
        a.swap();

        Pair<String> b = new Pair<String>("원숭이 ", "사자 ");
        b.swap();
        
    }
}