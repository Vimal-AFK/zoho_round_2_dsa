package dsa;

public class days_between_dates {

    public static boolean isLeap(int year) {
        return( year % 400  == 0) || ( year % 4 == 0 && year % 100 != 0 );
    }

    public static int totalDays(int[] date) {
        int total = 0;
        int day  = date[0];
        int month = date[1];
        int year = date[2];

        for ( int i = 1 ; i < year ; i++ ) {
            if(isLeap(year)) {
                total += 366;
            } else {
                total += 365;
            }
        }

        int[] monthDays = {
                31,28,31,30,31,30,
                31,31,30,31,30,31
        };

        if(isLeap(year)) monthDays[1] = 29;

        for(int i = 0 ; i < month - 1 ; i++) {
            total+=monthDays[i];
        }

        total += day;
        return total;
    }

    public static void days_between_dates(int[] date1 , int[] date2) {
        int totalDays = totalDays(date1) - totalDays(date2);
        System.out.println(totalDays > 0 ? totalDays : -totalDays);
    }

    public static void main(String[] args) {
        int[] d1 = { 1, 2, 2000 };
        int[] d2 = {1, 2, 2004};
        days_between_dates(d1,d2);
    }
}
