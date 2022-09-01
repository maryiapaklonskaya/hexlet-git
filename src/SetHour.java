public class SetHour {
    private int hour;

    SetHour(int hour) {
        if((hour > 24)||(hour < 0)) {
            System.out.println("Invalid hour, set between 0 and 24");
            this.hour = -1;
        } else {
            this.hour = hour;
        }
    }

    public int returnInt() {
        return hour;
    }
}
