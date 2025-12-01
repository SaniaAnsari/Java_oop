package gadget;

import animals.Cat;

public class Main {
    public static void main(String[] args) {
    smart_watch my_watch= new smart_watch("FitTech");
        my_watch.powerOn();
        my_watch.showHeartRate();
        my_watch.receiveNotification("Meeting at 5 Pm");
        my_watch.powerOff();
    }
}

