public class MissingNumber {
    public static void main(String[] args) {
//        int increment = 0;
//        System.out.println(increment++);
//        System.out.println(increment);
//
//        int incrementPlus = 0;
//        System.out.println(++incrementPlus);
//        System.out.println(incrementPlus);git init

        int [] numbers = {1, 2, 3, 5, 6};
        int missingNumber = TheNumber(numbers);
        System.out.println("The missing numbers is " + missingNumber);

    }
    public static int TheNumber(int [] numbers) {
        int result = numbers.length + 1;
        int expected = result * (result + 1) / 2;

        int actual = 0;
        for(int number: numbers) {
            actual += number;

        }
        return expected - actual;
//        return expected - actual;

        }
}
