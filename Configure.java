import java.util.*;

public class Configure
{
	String cdate;
	String ctime;
	String cDuration;

	public Configure(String cdate, String ctime)
	{
		this.cdate = cdate;
		this.ctime = ctime;
	}

	public String toString()
	{
		return this.cdate + " " + this.ctime;
	}

}