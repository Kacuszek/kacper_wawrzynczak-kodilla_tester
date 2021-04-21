import java.util.Random;

public class RandomNumbers {
    int min = 31;
    int max = -1;
    public int getCountOfRandomNumbers() {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5001) {
            int temp = random.nextInt(31);
            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }
            sum = sum + temp;
            result++;
        }
        return result;
    }
    public int getMin () {
        return this.min;

    }
    public int getMax() {
        return  this.max;
    }

}
