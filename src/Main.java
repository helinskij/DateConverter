
public class Main {
    public static void main(String[] args) {
        DateConverter date = new DateConverter();      //create object date
        try{
            date.setMonth();                //call method to set the date for the object
            date.setDay();
            System.out.println(date.getMonth() + " " + date.getDay());
        }catch (MonthException | DayException e){      //catches the exception of wrong day or month
            System.out.println(e.getMessage());            //and prints the equivalent message
        }
}
}