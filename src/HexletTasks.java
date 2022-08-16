public class HexletTasks {

    public static void main(String[] args){
        //addDigits(1234567890);
        //fib(1);
        //fizzBuzz(10, 20);
        diff(160, 0);
    }

    public static int addDigits(int num) {
        int sum = 0;

        if (num < 10) {
            System.out.println("less than 10: " + num);
            return num;
        } else {
            do {
                sum = sum + (num % 10);
                System.out.println("sum = sum + (num % 10) === " + sum);
                System.out.println("num1: " + num);
                num = num / 10;
                System.out.println("num2: " + num);

                if((num < 10) && (sum != 0) && ((num + sum) >= 10)){
                    System.out.println("num3: " + num + " sum3: " + sum);
                    num = num + sum;
                    sum = 0;
                    System.out.println("num4: " + num + " sum4: " + sum);
                } else if((num + sum) < 10){
                    sum = sum + num;
                }
            } while (num >= 10);
            System.out.println("final num is: " + num);
            System.out.println("final sum is: " + sum);
            return sum;
        }

    }

    public static int fib(int index) {
        int fibNum3 = 0;
        int fibNum1 = 0;
        int fibNum2 = 1;
        int i = 2;
        if (index == 0) {
            return fibNum1;
        } else if (index == 1) {
            return fibNum2;
        } else {

            do {
                fibNum3 = fibNum2 + fibNum1;
                System.out.println(fibNum3 + " " + fibNum2 + " " + fibNum1 + " " + i);
                fibNum1 = fibNum2;
                fibNum2 = fibNum3;
                i++;
                System.out.println("после мешанины" + fibNum3 + " " + fibNum2 + " " + fibNum1 + " " + i);
            } while (i <= index);

            System.out.println(fibNum3);
            return fibNum3;
        }
    }

    public static void fizzBuzz(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void diff(int a, int b) {
        int num1 = 0;

        if (a > b) {
            num1 = a;
            a = b;
            b = num1;
        }

        num1 = b - a;

        if (num1 > 180)
            {
                num1 = 360 - num1;
            }

        System.out.println(num1);


    }

}
