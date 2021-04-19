import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

}
