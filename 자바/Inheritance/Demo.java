interface AnimalEat {
    
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    private String feed = "사료";
    public String feed1 = "고기";
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class Demo {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
        a.travel();
        System.out.println(a.feed1);
    }
}