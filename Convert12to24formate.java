import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert12to24formate {
    public static String englishTime(String input) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";

        time = dateFormat.parse(input);
        output = format.format(time);
        return output;
    }

    public static void main(String[] arg) throws ParseException {
        System.out.println(englishTime("09:05:45 PM"));
    }
}
