import java.util.*;

public class GeorgeAndSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // current time
        String t = sc.next(); // sleep duration

        // current time
        int sh = Integer.parseInt(s.substring(0, 2));
        int sm = Integer.parseInt(s.substring(3, 5));

        // sleep time
        int th = Integer.parseInt(t.substring(0, 2));
        int tm = Integer.parseInt(t.substring(3, 5));

        // convert to minutes
        int currentMinutes = sh * 60 + sm;
        int sleepMinutes = th * 60 + tm;

        // subtract
        int bedMinutes = currentMinutes - sleepMinutes;

        // if negative, go to previous day
        if (bedMinutes < 0) {
            bedMinutes += 24 * 60;
        }

        // convert back to hh:mm
        int bh = bedMinutes / 60;
        int bm = bedMinutes % 60;

        
        System.out.printf("%02d:%02d", bh, bm);
    }
}

