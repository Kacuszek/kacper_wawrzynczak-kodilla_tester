public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 3, 6};
        int firstNumber = numbers[0];
        int secondNumber = numbers[1];
        int thirdNumber = numbers[2];
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}
