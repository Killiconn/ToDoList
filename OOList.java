import java.util.*;
import java.io.*;

public class OOList
{
	Queue myList;

	public static void main(String [] arg)
	{
		//HashMap containing the options you have.
		Queue myList = new Queue();

		Map<String, Runnable> option = new HashMap<>();

		option.put("Enqueue",() -> enq(myList));
		option.put("Peek",() -> System.out.println("\nYour next To-Do is: " + myList.peeky()));
		option.put("Dequeue",() -> myList.dequeue());
		option.put("ShowAll",() -> myList.showAll());
		option.put("Done",() -> finish());

		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			try
			{
				System.out.println("What would you like to do?\nYour options are : Peek, Enqueue, Dequeue, ShowAll or Done");
				String txt = scanner.nextLine();
				option.get(txt).run();
			}
			catch(Exception NullPointerException) //If the input is not in the hashmap.
			{
				System.out.println("\nSorry I don't understand.\n");
			}
		}
	}

	public static void enq(Queue myList)
	{
		//Taking in all the details of task or event and adding it to the Queue
		Configure todo;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Task or Event: ");
		String txt = scanner.nextLine();

		if(txt.equals("Task"))
		{		
			System.out.println("Insert a date, time, duration and people involved:");

			String tdate = getDate(scanner);
			String ttime = getTime(scanner);

			System.out.println("Duration: ");
			String tDuration = scanner.nextLine();

			System.out.println("People involved: ");
			String tpeople = scanner.nextLine();

			todo = new Task(tdate, ttime, tDuration, tpeople); //Change the Object to Configure
			myList.enqueue(todo); // Add to the Queue
			System.out.println(myList.peeky() + " has been added to your Queue.");
		}

		else if(txt.equals("Event"))
		{
			System.out.println("Insert a date, time and location : ");

			String edate = getDate(scanner);
			String etime = getTime(scanner);

			System.out.println("Location: ");
			String eLocation = scanner.nextLine();

			todo = new Event(edate, etime, eLocation); //Change the Object to Configure
			myList.enqueue(todo); // Add to the Queue
			System.out.println(myList.peeky() + " has been added to your Queue.");
		}
		else
			System.out.println("I dont understand.");
	}

	public static String getTime(Scanner scanner) //Since both take in a time and date, I made functions for them.
	{
		System.out.println("Time: ");
		String gtime = scanner.nextLine();
		return gtime;
	}

	public static String getDate(Scanner scanner)
	{
		System.out.println("Date: ");
		String gdate = scanner.nextLine();
		return gdate;
	}

	public static void finish() //When youre finished adding to the Queue.
	{
		System.exit(0);
	}
}