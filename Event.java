public class Event extends Configure
{
	String edate;
	String etime;
	String eLocation;

	public Event(String edate, String etime, String eLocation)
	{
		super(edate, etime);
		this.eLocation = eLocation;
	}

	public String toString()
	{
		return super.toString() + " " + this.eLocation;
	}
}