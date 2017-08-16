import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello World!");
		String title = "Fun Event";
		String description = "a fun programming event that everyone can take part in!";
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Calendar startDate = Calendar.getInstance();
		//System.out.println(dateFormat.format(startDate.getTime()));
		
		Calendar endDate = Calendar.getInstance();
		int hour = endDate.get(Calendar.HOUR);
		//System.out.println("The current hour is :" + hour);
		endDate.set(Calendar.HOUR, hour+1);
		
		
		//System.out.println(dateFormat.format(endDate.getTime()));
		
		Event testEvent = new Event(title, description, startDate, endDate);
		testEvent.print();
		
		
		EventQueue.invokeLater(() -> {
			QuickTaskOrganizerUI test = new QuickTaskOrganizerUI();
			test.setVisible(true);
			
			QuitButton qButton = new QuitButton();
			qButton.setVisible(true);
		});
		
		
		
		
	}

}
