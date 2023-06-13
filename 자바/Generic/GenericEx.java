class Box<T> {
    T item;
    // TODO: Define the necessary instance variable(s)

    public void addItem(T item) {
        this.item = item;
        // TODO: Implement the addItem method
    }

    public T getItem() {
        return item;
        // TODO: Implement the getItem method
    }
}

class Beer {
    public String toString() {
        return "Beer";
    }
}

class Juice {
    public String toString() {
        return "Juice";
    }
}

public class GenericEx {
    public static void main(String[] args) {
        Box<Beer> beerBox = new Box<>();
        Box<Juice> juiceBox = new Box<>();

        // TODO: Add a Beer to beerBox
        // TODO: Add a Juice to juiceBox

        beerBox.addItem(new Beer());
        juiceBox.addItem(new Juice());
        

        mixDrinks(beerBox, juiceBox);
    }

    public static <T, U> void mixDrinks(Box<T> box1, Box<U> box2) {
        // TODO: Implement the mixDrinks method
        // Print a message indicating the combination of drinks

        System.out.println(box1.getItem() +", "+ box2.getItem() +"의 칵테일");
    }
}
