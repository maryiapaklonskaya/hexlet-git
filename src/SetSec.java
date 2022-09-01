public class SetSec {
    private int seconds;
    SetSec(int sec) {
        if((sec > 60)||(sec < 0)) {
            System.out.println("Invalid seconds, set between 0 and 60");
            this.seconds = -1;
        } else {
            this.seconds = sec;
        }
    }

    public int returnInt() {
        return seconds;
    }
}
