import java.util.Arrays;
import java.util.Random;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] randomNumberArray = new int[500];

        int minNumber = Integer.MAX_VALUE;

        for(int i =0; i<randomNumberArray.length-1; i++) {

            Random rand = new Random();

            //Generate random number that is bound between 0 and 500.
            randomNumberArray[i] = rand.nextInt(500);

            if(randomNumberArray[i]<minNumber) {
                minNumber = randomNumberArray[i];
            }
        }
        System.out.println("The randomly generated array is:");
        System.out.println(Arrays.toString(randomNumberArray));

        System.out.println("The minimum number is "+minNumber);
    }

}

