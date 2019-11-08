
public class ArrayReverse {
    public static void main(String[] args) {

        String[] letters = new String[]{ "a", "b", "c","d","e"};

        String[] reversed = reverseArray(letters);

        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }
    }

    public static String[] reverseArray(String[] arrayToReverse){
        String[] newArray = new String[arrayToReverse.length];
        for (int i = 0; i < arrayToReverse.length; i++) {
            newArray[arrayToReverse.length -1 -i] = arrayToReverse[i];
        }
        return newArray;
    }
}