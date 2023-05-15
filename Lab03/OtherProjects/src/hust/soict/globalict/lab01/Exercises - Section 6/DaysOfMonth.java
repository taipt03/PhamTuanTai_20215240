import java.util.Scanner;
public class DaysOfMonth{
    public static void main(String args[]){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=y.nextInt();
        Scanner m=new Scanner(System.in);
        System.out.println("Enter month: ");
        String monthName=m.nextLine();
        int month;
        switch (monthName) {
            case "January":
            case "Jan":
            case "Jan.":
            case "1":
               month=1;
               break;
            case "February":
            case "Feb":
            case "2":
            case "Feb.":
               month=2;
               break;
            case "March":
            case "Mar":
            case "3":
            case "Mar.":
               month= 3;
               break;
            case "April":
            case "Apr":
            case "4":
            case "Apr.":
               month= 4;
               break;
            case "May":
            case "5":
               month= 5;
               break;
            case "June":
            case "Jun":
            case "6":
            case "Jun.":
               month= 6;
               break;
            case "July":
            case "Jul":
            case "7":
            case "Jul.":
               month= 7;
               break;
            case "August":
            case "Aug":
            case "8":
            case "Aug.":
               month= 8;
               break;
            case "September":
            case "Sep":
            case "9":
            case "Sep.":
               month= 9;
               break;
            case "October":
            case "Oct":
            case "10":
            case "Oct.":
               month= 10;
               break;
            case "November":
            case "Nov":
            case "11":
            case "Nov.":
               month= 11;
               break;
            case "December":
            case "Dec":
            case "12":
            case "Dec.":
               month= 12;
               break;
            default:
               month= -1;
            }
        if (year>0){
            int day;
            switch(month){
                case 2:
                if (LeapYear(year)) day=29;
                else day=28;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                day=31;
                break;
                default: day=30;
            }
            System.out.println("That month has "+day+"days\n");
        }
        else {
            System.out.println("Invalid year\n");
        }
    }
    public static boolean LeapYear(int year) {
        if (year % 4 == 0) {
           if (year % 100 == 0) {
              if (year % 400 == 0) {
                 return true;
              } else {
                 return false;
              }
           } else {
              return true;
           }
        } else {
           return false;
        }
    }
    
}
