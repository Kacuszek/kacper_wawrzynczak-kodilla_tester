public class LeapYear {
    public static void main(String[] args) {
        String firstWord = "Leap year";
        String secondWord = "Not leap year";
        int year = 2015;
        int secondNumber = 4;
        int thirdNumber = 100;
        int fourthNumber = 400;
        int result = 2015%4;
        int secondResult = 2015%100;
        int thirdResult = 2015%400;
        int zero = 0;

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(year);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(result);
        System.out.println(secondResult);
        System.out.println(thirdResult);


        if (result = zero && secondResult = zero && thirdResult = zero) {
            System.out.println(firstWord);
        } else if (result = zero && secondResult > zero) {
            System.out.println(firstWord);
        } else {
            System.out.println(secondWord);
        }



    }

}
