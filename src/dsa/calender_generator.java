package dsa;

public class calender_generator {

    public static boolean isLeap(int year) {
        return ( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0);
    }

    public static int totalDays(int month,int year) {
        int total = 0 ;

        int[] monthDays = {
                31,isLeap(year) ? 29 : 28,31,30,31,30,31,31,30,31,30,31
        };

        for ( int i = 1 ; i < year ; i++ ) {
            total += isLeap(i) ? 366 : 365 ;
        }

        for ( int i = 0 ; i < month - 1 ; i++ ) {
            total += monthDays[i];
        }

        return total;
    }

    public static void calender_generator(int month , int year) {
        int firstDay = totalDays(month,year) % 7 ;
        System.out.println("Calender: " + month+" / "+year);
        System.out.println("____________________________");
        System.out.println("Mon Tue Wed Thur Fri Sat Sun");

        for ( int i = 0 ; i < firstDay ; i++ ) {
            System.out.printf("%4s"," ");
        }

        int[] monthDays = {
                31,isLeap(year) ? 29 : 28,31,30,31,30,31,31,30,31,30,31
        };

        for(int d = 1 ; d <= monthDays[month - 1]; d++) {
            System.out.printf("%4d",d);

            if((firstDay + d ) % 7 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        calender_generator(7,2026);
    }
}
