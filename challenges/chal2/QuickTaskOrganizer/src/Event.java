import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Event {
	
	private String title;
	private String description;
	private Calendar startDate;
	private Calendar endDate;
	
	public Event(String title, String description, Calendar startDate, Calendar endDate)
	{
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	public void print() {
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(title + " : " + description);
		System.out.println("Begins at : " + dateFormat.format(startDate.getTime()));
		System.out.println("Ends at : " + dateFormat.format(endDate.getTime()));
	}

}
