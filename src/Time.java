public class Time {
//    Write  a  class  Time  with  three  data  members  to  store  hr,  min  and  seconds.
//    Create three constructors and apply checks to set valid time.
//    Also create display function which displays all data members
    // checks 24 h
    // 60 minutes invalid

    private int hourInt = 00;
    SetHour hour;
    SetMin minutes;
    SetSec seconds;
    private int minutesInt = 00;
    private int secInt = 00;
    private String localTime;

    Time(SetHour hour, SetMin minutes, SetSec seconds) {
        this.hourInt = hour.returnInt();
        this.secInt = seconds.returnInt();
        this.minutesInt = minutes.returnInt();
    }

    Time(SetHour hour, SetMin minutes) {
        this.hourInt = hour.returnInt();
        this.minutesInt = minutes.returnInt();
    }

    Time(SetHour hour) {
        this.hourInt = hour.returnInt();
    }



т
    public String displayTime() {
        if((hourInt < 0)||(minutesInt < 0)||(secInt <0)) {
            System.out.println("invalid time");
            return localTime;
        } else {
            localTime = Integer.toString(hourInt) + ":" + Integer.toString(minutesInt) + ":" + Integer.toString(secInt);
            System.out.println(localTime);
            return localTime;
        }

    }





}
