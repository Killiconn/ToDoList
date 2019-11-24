public class Task extends Configure
{
	String tdate;
	String ttime;
	String tDuration;
	String tpeople;

	public Task(String tdate, String ttime, String tDuration, String tpeople)
	{
		super(tdate, ttime);
		this.tDuration = tDuration;
		this.tpeople = tpeople;
	}


	public String toString()
	{
		return super.toString() + " " + this.tDuration + " " + this.tpeople;
	}

}