import java.util.Arrays;
import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        //getLargest(1, 3, 2, 4);
        // evenOrOdd(3);
        //getMonth2(0);
        //numberOfEven(-3);
        //sumOf(5);
        //factorialOf(-5);
        //sumOfReccursion(3);
        //getIndex4("Hillary1");

        //int[] nums = {3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        //sumOfElementsInIntArray(nums);
        //average(nums);

//        int[][] nums = new int[3][3];
//        nums[0] = new int[]{3, 4, 53, 63};
//        nums[1] = new int[]{73, 184, 93, 123};
//        nums[2] = new int[]{133, 144, 153, 163};

        //getLargest(nums);

//        int[] nums1 = new int[]{1, 2, 3};
//        int[] nums2 = new int[]{1, 2, 3};
//        arraysMerge(nums1, nums2);

        //String[] namesWithDuplicatesArray = new String[]{"sam", "julija", "sam", "elina", "joan", "elina"};
        //removeDuplicates(namesWithDuplicatesArray);

        String text = "Карл у Клары украл кораллы, а Клара у Карла украла кларнет";
//        countCharacters(text);
//        getSubstring(args);

        theLongestWord(text);
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

    //Write a method that contains an array of names and
    //accepts a name as input and gives the array index as output
    // getIndex("sam") ===> index is 0  || name does not exist

    public static void getIndex(String textInput) {
        String[] names = {"Maryia", "Alex", "Sam", "Barack", "Hillary"};

        for (int i = 0; i < names.length; i++) {
            if (names[i] == textInput) {
                System.out.println("index is " + i);
                return;
            }
            System.out.println("name does not exist");
        }
    }

    public static void getIndex2(String name) {
        String[] names = new String[]{};

        for(String listName: names) {
            System.out.println("found");
            return;
        }
        System.out.println("not found");
    }

    public static void getIndex3(String name) {
        String[] names = new String[]{};
        int index = 0;

        while (index < names.length) {
            if(names[index].equals(name)){
                System.out.println("found");
                return;
            }
            index++;
        }
        System.out.println("not found");
    }

    public static void getIndex4(String name) {
        String[] names = new String[]{"Maryia", "Alex", "Sam", "Barack", "Hillary"};
        int index = 0;

        do {
            if(names[index].equals(name)){
                System.out.println("found index " + index);
                return;
            }
            index++;
        } while (index < names.length);

        System.out.println("not found index");
    }

    public static void multiArray(String[] args){
        String[] names = {"a", "b", "c"}; //we know that this is array because of []
        //String[] //array time with the strings inside
        //String[][]
        String[][] multiNames = new String[2][3]; //define the length, the size
        // [2] - large array; [3] - child arrays

        multiNames[0] = new String[]{"a", "b", "c"};
        multiNames[1] = new String[]{"d", "e", "f"};

        //indexes of the multidimensional array
        //[0][0]   [0][1]   [0][2]   [1][0]   [1][1]   [1][2]
        // || equals to ||
        //[0][0]   [0][1]   [0][2]
        //[1][0]   [1][1]   [1][2]
        String name = "e";
//        for(int i = 0; i < multiNames.length; i++) {
//           // for(int j = 0; multiNames[i].length; j++)
//                if(multiNames[i][j].equals(name)) {
//                    System.out.println(multiNames[i][j]);
//                    return;
////                }
//            }
//        System.out.println("not found");
        }

    public static void sumOfElementsInIntArray(int[] nums){
        //int[] nums = {1, 2, 3, 4};
        int sum = 0;

        for(int i : nums){ //= (int i = 0; i < nums.length; i++)
            sum+= i; //= sum = sum + nums[i];
            System.out.println(i + " aaand the sum is " + sum);
        }
        System.out.println("\n" + "The sum is " + sum);
    }

    public static void average(int[] nums){
        float averageNum = 0;
        int sum = 0;

        for(int i : nums){
            sum+=i;
        }
        averageNum = (float) sum / nums.length;
        System.out.println("\n" + "The average is " + averageNum);

    }

    public static void getLargest(int[][] nums) {
        int largest = 0;
        for (int[] i : nums) {
            for (int j : i) {
                if (j > largest) {
                    largest = j;
                }
            }
        }
        System.out.println("the largest num is " + largest);
    }

    public static void getLargest1(int[][] nums){
        int largest = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(nums[i][j] > largest){
                    largest = nums[i][j];
                }
            }
        }
        System.out.println("the largest num is " + largest);

    }

    public static void arraysMerge(int[] nums1, int[] nums2){
        // WRITE A METHOD THAT ADDS 2 ARRAYS TOGETHER
        // {1, 2, 3} {4, 5, 6} ====> {5, 7, 9}
        int[] numsSum = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            numsSum[i] = nums1[i] + nums2[i];
        }
        System.out.println("the sum of the \n" + Arrays.toString(nums1) + "\n and \n" + Arrays.toString(nums2) + "\n equals to \n" + Arrays.toString(numsSum));
    }

    public static void removeDuplicates(String[] namesWithDuplicatesArray){
        // WRITE A METHOD THAT FINDS DUPLICATES IN AN ARRAY
        // {"sam", "julija", "sam", "elina", "joan", "elina"} =====> {"sam", "julija", "elina", "joan"}
        String[] copiesArray = new String[namesWithDuplicatesArray.length];
        String[] resultsArray = new String[namesWithDuplicatesArray.length];

        int k = 0;
        int p = 0;
        int m = 0;

        for(int i = 0; i < namesWithDuplicatesArray.length; i++){
            for(int j = i + 1; j < namesWithDuplicatesArray.length; j++) {
                if((namesWithDuplicatesArray[i].equals(namesWithDuplicatesArray[j])) && (i != j)){
                    copiesArray[k] = namesWithDuplicatesArray[j];
                    k++;
                }
            }
        }

        for(int i = 0; i < namesWithDuplicatesArray.length; i++){
            m = 0;
            for(int j = 0; j < copiesArray.length; j++) {
                if ((namesWithDuplicatesArray[i].equals(copiesArray[j])) ) {
                    m++;
                }
            }

            if(m == 0){
                resultsArray[p] = namesWithDuplicatesArray[i];
                p++;
            }
        }

        System.out.println("the original array: " + Arrays.toString(namesWithDuplicatesArray));
        System.out.println("copies names are: " + Arrays.toString(copiesArray));
        System.out.println("unique names are: " + Arrays.toString(resultsArray));
    }

    public static void removeDuplicates4(String[] list){
        String[] found = new String[list.length];
        int currentFoundIndex = 0;

        for(int i = 0; i < list.length; i++) {
            String element = list[i];
            boolean elementFound = false;

            for (int j = 0; j < found.length; j++) {
                if((found[j] != null) && (found[j].equals(element))) {
                    elementFound = true;
                }
            }
            if (!elementFound) {
                found[currentFoundIndex] = element;
                currentFoundIndex++;

            }
        }
        System.out.println(Arrays.toString(found));
    }

    public static void classString(String line){
//        String myText = "Text";
//        String myText2 = new String("text");
//
//        //joining text
//        String text1 = "This is ";
//        text1 += "my text";
//        String text2 = "fsdf fdsfs";
//        String newString = text1.concat(text2);
//
//        String myText = "Text";
//        String myText2 = new String;
//        String val1 = text1.intern();
//        String val2 = text2.intern();
//
//        System.out.println(val1.equals(val2));
        // (text1 == text2) checks if values are stored in the exact same location
        // stringText.length() - should be with () since it is a method
        // textString.toUpperCase()
        // textString.toLowerCase()
        // indexOf() --> returns position of the first char of the occurence of the specified text in a string
        // textString.indexOf("masha"); returns -1 if couldn't find the matching piece
        // replaceAll() - replace all occurences of a given text with another
        // textString.replaceAll("a", "o")  "hahaha" --> "hohoho"
        // substring(int) - gets part of the string,  returns starting from int - starting index
        // substring(int1, int2) - starts from index int1, ends with index int2EXCLUDED
        // textString.contains("text")
        // textString.trim() removes white space char before and after
        // textString.isEmpty() - finds ANY character even whitespaces
        // textString.isBlank() - checks if there are any visible characters

    }

    public static void scannerMethod() {
        Scanner scan = new Scanner(System.in);

        String input1 = scan.nextLine(); //gives String
        int input2 = scan.nextInt(); //gives int
        boolean input3 = scan.nextBoolean();
        double input4 = scan.nextDouble();

        //PRINTF()
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0);
//                * e - floating point number in exponential notation
//                * f - floating-point number
//                * x - integer in hexadecimal system
//                * o - integer in the octal number system
//                * s - string
//                * c - one character (char)
//                * b - logical value

        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        //WRAPPER CLASSES
        int intValue = Integer.parseInt(intStrValue);
        int intValue2 = Integer.valueOf(intStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);

    }

    public static void countCharacters(String line) {
    // WRITE A METHOD TO COUNT HOW MANY NON-WHITESPACE CHARACTERS ARE IN A STRING
    // "     this class is /n about /t java  " ====>   "this class is about java" ====> 24

        line = line.replace("\n"," ");
        line = line.replace("\t"," ");
        line = line.trim();
        int length = line.length();
        int length2 = line.length();
        String lineTemp = "";

        for(int i = 0; i < length2 - 1; i++) {
            lineTemp = line.substring(i, i + 1);
            if (lineTemp.equals(" ")) {
                length--;
            }
        }

        System.out.println(length);

    }

    public static void countCharacters2(String line) {
        // WRITE A METHOD TO COUNT HOW MANY NON-WHITESPACE CHARACTERS ARE IN A STRING
        // "     this class is /n about /t java  " ====>   "this class is about java" ====> 24

        line = line.trim();
        int length = line.length();
        int length2 = line.length();
        String lineTemp = "";

        for(int i = 0; i < length2 - 1; i++) {
            lineTemp = line.substring(i, i + 1);
            if ((lineTemp.equals(" ")) || (lineTemp.equals("\n")) || (lineTemp.equals("\t")) ){
                length--;
            }
        }

        System.out.println(length);

    }


    public static void getSubstring(String inputText) {
//    Write a Java program to get a substring of a given string between two specified positions
        Scanner scan = new Scanner(System.in);

        System.out.println("Input position from which to trim the text line (integer):");
        int num1 = scan.nextInt();
        System.out.println("Input position until which to trim the text line (integer):");
        int num2 = scan.nextInt();
        System.out.println(inputText.substring(num1, num2));
    }

    public static void theLongestWord(String inputText) {         //    Write a method to get the length of the longest word in a string sentence
        int longest = 0;
        int wordLength = 0;
        String inputText1 = inputText.concat(" ");

        for(int i = 0; wordLength < inputText1.length(); i++) {
            wordLength = inputText1.indexOf(" ");
            inputText1 = inputText1.substring(wordLength + 1);
            if (wordLength > longest) {
                longest = wordLength;
            }
        }

        System.out.println("The longest word's length is: " + longest);

    }





}