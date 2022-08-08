public class Main {
    public static void main(String[] args) {
        System.out.println(ageCalc(1994, 2022.5));
    }
    public static int ageCalc(double birthYear, double currentYear) {
        int age = (int) (currentYear - birthYear);
        return age;

    }


}

