import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		  SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	       SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	       
	       Date y1 = sdf1.parse("25/07/2011");
	       Date y2 = sdf2.parse("25/5/2011 14:40:06");
	       
	       System.out.println(y1);
	       System.out.println(y2);
	}

}
