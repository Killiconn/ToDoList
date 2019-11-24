import java.util.ArrayList;

public class Queue
{
	private ArrayList<Configure> list_of_todos = new ArrayList<Configure>();


	Queue(){}

	public void enqueue(Configure atodo) //Add to the ArrayList
	{
		list_of_todos.add(atodo);
	}

	public void dequeue() //Remove off the ArrayList
	{
		if(getSize() <= 0)
			System.out.println("\nYou have nothing left in your Queue\n");
		else
		{
			System.out.println("You are removing : " + peeky());
			list_of_todos.remove(0);
		}
	}

	public String peeky() //See the first Item in the List
	{
		if(getSize() == 0)
			return ("\nYou have nothing in your list\n");
		else
		{
			return getterList(0);
		}
	}

	public String getterList(int i) //Getter from list
	{
		return list_of_todos.get(i).toString();
	}

	public Integer getSize()//Getter the size of list
	{
		return list_of_todos.size();
	}

	public void showAll() //Show All in the List
	{
		if(getSize() > 0)
		{
			String alloftodos = "";
			System.out.println("Your List is :");
			for(int i = 0; i < getSize(); i++)
				System.out.println("\n" + getterList(i) + "\n");
		}
		else
			System.out.println("Your list consists of nothing.");
	}
	
}
