import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
class DateException extends Exception {
    public DateException(String str) {
        System.out.println(str);
    }
}
public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Please enter date in string format");
        Date date02 = new Date();

        Scanner sc = new Scanner(System.in);
        String date01 = sc.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date01);
        try {
            if (date.before(date02)) {
                throw new DateException("Date is not valid");
            } else {
                System.out.println("It is a valid date");
            }
        }
        catch (DateException d) {
            System.out.println(d);
        }


    }

}