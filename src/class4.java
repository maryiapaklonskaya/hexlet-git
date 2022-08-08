public class class4 {
    public static void main(String[] args) {
        //getLargest(1, 3, 2, 4);
        // evenOrOdd(3);
        //getMonth2(0);
        //numberOfEven(-3);
        //sumOf(5);
        //factorialOf(-5);
        sumOfReccursion(3);

    }

    public static void getLargest(int num1, int num2, int num3, int num4) {
        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println("The largest number is1 " + num1);
                } else {
                    System.out.println("The largest number is2 " + num4);
                }
            } else if (num3 > num4) {
                System.out.println("The largest number is3 " + num3);
            } else {
                System.out.println("The largest number is4 " + num4);
            }
        } else if (num2 > num3) {
            if (num2 > num4) {
                System.out.println("The largest number is5 " + num2);
            } else {
                System.out.println("The largest number is6 " + num4);
            }
        } else if (num3 > num4) {
            System.out.println("The largest number is7 " + num3);
        } else {
            System.out.println("The largest number is8 " + num4);
        }
    }

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void getMonth(int num) {

        switch (num) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("This is not a month!");
                break;
        }
    }

    public static void getMonth2(int num) {
        switch (num) {
            case 1 -> System.out.println("january");
            default -> System.out.println("not a month!");
        }


//    for(counter declaration; condition; modification of the counter) {
//        instruction
//    }

        for (int i = 0; i < 10; i++) {
            System.out.println("printing current number" + i);
        }
    }

    public static void numberOfEven(int num) {
        int count = -1;

        if (num < 0) {
            System.out.println("the even numbers are: ");
            for (int i = 0; i >= num; i--) {
                if (i % 2 == 0) {
                    count++;
                    System.out.println(i + ", ");
                }
            }
        } else if (num > 0) {
            System.out.println("the even numbers are: ");
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {
                    count++;
                    System.out.println(i + ", ");
                }
            }
        } else {
            System.out.println("0 is not valid");
            return;

        }

        System.out.println("the number of even numbers in the " + num + " = " + count);
    }

    public static void whileLoop(String[] args) {
        String[] array = {"Alice", "has", "a", "cat"};
        int i = 0;
        while(i < 10) {
            System.out.println("Hello world!");
            i++;
        }

        do {
            System.out.println("Hello world!");
            i++;
        }while (i < 10);

    }

    public static void sumOf(int num) {
        int sum = 0;
        int i = 0;

        if (num > 0) {
            while (i <= num) {
                sum = sum + i;
                i++;
            }
            System.out.println("The sum of the " + num + " is " + sum);
        } else if (num < 0) {
            while (i >= num) {
                sum = sum + i;
                i--;
            }
            System.out.println("The sum of the " + num + " is " + sum);
        } else {
            System.out.println("sum is 0");
            return;
        }
    }

    public static void factorialOf(int num) {

        if (num > 0) {
            int i = 1;
            int factorial = 1;
            while (i <= num) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("The factorial of the " + num + " is " + factorial);
        } else if (num < 0) {
            int i = -1;
            int factorial = -1;
            while (i >= num) {
                factorial = factorial * i;
                i--;
            }
            System.out.println("The factorial of the " + num + " is " + factorial);
        } else {
            System.out.println("factorial is 0");
            return;
        }
    }

    //Write a method to calculate the sum of all numbers between 1 and input using recursion
    public static int sumOfReccursion(int num) {
        if(num == 1) return 1;
        return num + sumOfReccursion(num - 1);
        }





}


