public class SetMin {
    private int minutes;

    SetMin(int min) {
        if((min > 60)||(min < 0)) {
            System.out.println("Invalid minutes, set between 0 and 60");
            this.minutes = -1;
        } else {
            this.minutes = min;
        }
    }

    public int returnInt() {
        return minutes;
    }
}
