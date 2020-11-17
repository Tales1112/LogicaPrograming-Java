import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Order;
import entities.Post;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow That's awesome!");

		Post p1 = new Post(sdf.parse("21/06/2018"), "Traveling to New Zealand",
				"I am going to visit this wonderful Country", 12);
		p1.addComents(c1);
		p1.addComents(c2);

		System.out.println(p1);
	}

}
