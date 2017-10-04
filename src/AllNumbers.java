import java.util.Scanner;

public class AllNumbers {
    public static void main(String args[])
    {
        int number1;
        int number2;
        int number3;

        System.out.println("Enter the first number");
        Scanner numberScan = new Scanner(System.in);
        number1 = numberScan.nextInt();

        System.out.println("Enter the second number");
        numberScan = new Scanner(System.in);
        number2 = numberScan.nextInt();

        System.out.println("Enter the third number");
        numberScan = new Scanner(System.in);
        number3 = numberScan.nextInt();

        System.out.println("Your numbers are "+number1+", " +number2+" and " +number3);
        System.out.println();
        System.out.println("The highest number is " + getHighest(number1, number2,number3));

        System.out.println();
        System.out.println("The lowest number is " + getSmaller(number1, number2,number3));

        System.out.println();
        System.out.println("The sum of the numbers is "+ sum(number1, number2, number3));

        System.out.println();
        System.out.println("The product of the numbers is "+ product(number1, number2, number3));

        System.out.println();
        System.out.println("The average of the numbers is "+ average(number1, number2, number3));

    }
    public static int getHighest(int number1, int number2, int number3){
       int highest;
        if(number1>number2){
            highest=number1;
        }else{
            highest=number2;
        }

        if(number3>highest)
        {
            highest=number3;
        }
       return highest;
    }

    public static int getSmaller(int number1, int number2 , int number3){
        int lowest;
        if(number1<number2) {
            lowest = number1;
        } else {
            lowest = number2;

        }

        if(number3 < lowest) {
            lowest = number3;
        }
        return lowest;
}
    public static int sum(int number1, int number2 , int number3) {
        int sumAll;
        sumAll = number1 + number2 + number3;
        return sumAll;

    }
    public static int product(int number1, int number2 , int number3) {
        int product;
        product = number1 * number2 * number3;
        return product;
    }
    public static double average(int number1, int number2 , int number3) {
        double average = ((double)sum(number1, number2, number3) / 3);
        return (double)Math.round(average * 100d) / 100d;
    }

}
