package exercises;
import java.util.Arrays;

public class ArrayNumLoop {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};
        for(int i=0; i<someInts.length; i++) {
            if(someInts[i] % 2 != 0) {
//                System.out.println(someInts[i]);
            }
        }

        String seussText = "I would not, could not, in a box. I would not, could not with a fox. I will not eat " +
                "them in a house. I will not eat them with a mouse.";

        String[] splitSeuss = seussText.split(" ");
//        String[] stringSeuss = splitSeuss.split("\\.");
//        System.out.println(Arrays.toString(stringSeuss));
    }
}
