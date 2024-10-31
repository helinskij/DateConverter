import java.util.Scanner;
public class DateConverter{
    Scanner keyboard = new Scanner(System.in);
    private int day;
    private int month;          //no need for constructor, java creates it automatically

    public void setMonth() throws MonthException {
        System.out.println("Choose the month (1-12): ");    //asking user to enter a month
        this.month = keyboard.nextInt();
        if (month<1 || month > 12){
            throw new MonthException("Invalid month number!");  //if the month is not in range new exception is thrown
        }
    }
    public void setDay() throws DayException{
        System.out.println("Choose the day");       //asking user to enter a day
        this.day = keyboard.nextInt();
        if (day < 1 || day > 31 || (month == 2 && day > 28) || ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
            throw new DayException("Invalid day number!");  //if the user enters wrond day number in the month
        }                                                   //he entered earlier, new exception is thrown
    }

    public int getDay(){
        return day;         //returns day user entered
    }
    public String getMonth(){
        switch (month){     //switch returns the month that user entered as a word instead of a number
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }
}
