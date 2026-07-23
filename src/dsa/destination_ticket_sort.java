package dsa;

import java.util.Scanner;

public class destination_ticket_sort {
    public static void destination_ticket_sort(String[] from, String[] to) {
        int n = from.length;
        int start = -1;

        for(int i = 0 ; i < n ; i++ ) {
            boolean found = false ;
            for( int j = 0 ; j < n ; j++ ) {
                if( from[i].equals(to[j]) ) {
                    found = true ;
                    break;
                }

                if(!found){
                    start = i;
                    break;
                }
            }
        }

        int currLocation = start ;
        for( int i = 0 ; i < n ; i++ ) {
            System.out.print(from[currLocation]+"->"+to[currLocation]+",");
            for (int j = 0; j < n; j++) {
                if( from[j].equals(to[currLocation]) ) {
                    currLocation = j ;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF TICKETS :");
        int ticketsCount = in.nextInt();
        String[] from = new String[ticketsCount];
        String[] to = new String[ticketsCount];

        for (int i = 0; i < ticketsCount; i++) {
            System.out.printf("Ticket - %d \n FROM :",i+1);
            from[i] = in.next();
            System.out.printf(" TO :");
            to[i] = in.next();
        }

        for (int i = 0; i < ticketsCount; i++) {
            System.out.println("["+from[i]+"->"+to[i]+"]");
        }

        destination_ticket_sort(from,to);
    }
}
