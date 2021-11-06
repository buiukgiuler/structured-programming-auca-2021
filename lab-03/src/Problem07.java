import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day:");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int elapsed = input.nextInt();

        String todaysday = "";

        switch(today%7){
            case 1:todaysday= "Monday";break;
            case 2:todaysday= "Tuesday";break;
            case 3:todaysday= "Wednesday";break;
            case 4:todaysday= "Thursday";break;
            case 5:todaysday= "Friday";break;
            case 6:todaysday= "Saturday";break;
            case 0:todaysday= "Sunday";break;
        }
        System.out.print("Today is " + todaysday + " and the future day is " );

        int day = (today + elapsed);

        switch(day%7){
            case 1:todaysday= "Monday";break;
            case 2:todaysday= "Tuesday";break;
            case 3:todaysday= "Wednesday";break;
            case 4:todaysday= "Thursday";break;
            case 5:todaysday= "Friday";break;
            case 6:todaysday= "Saturday";break;
            case 0:todaysday= "Sunday";break;
        }
        System.out.print(todaysday);
    }

}