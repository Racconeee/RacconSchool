public class counttt {
    public static void main(String[] args) {
        Integer[] intArray = { 5, 2, 8, 2, 3, 2, 1 };
        String[] stringArray = { "apple", "banana", "orange", "banana", "pear" };

        int countInt = countOccurrences(intArray, 2);
        int countString = countOccurrences(stringArray, "banana");

        System.out.println("Occurrences of 2 in intArray: " + countInt);
        System.out.println("Occurrences of \"banana\" in stringArray: " + countString);

    }   
    public static <T> int countOccurrences(T[] array, T target) {
        int count=0;
        for (T t : array) {
            if(t == target){
                count++;
            }
        }
        return count;
    }
 
}
