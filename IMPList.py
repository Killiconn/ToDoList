global myList

def peek():
	global myList
	if len(myList) != 0:
		for i in range(len(myList)):
			if myList[i] == "|":
				print(myList[:i] + "\n")
				break	
	elif len(myList) == 0:
		print("You have noting in your To-Do List\n")	
	else:
		print("Something went wrong\n")

def enqueue():
	global myList
	ifTorE = True
	while ifTorE:
		txt = input("Would you like to add a Task or Event? : \n")
		if txt == "Task":
			myList = myList + txt + " --> "
			txt = input("Enter a date, time, duration and people involved: \n")
			myList = myList + txt + "|"
			ifTorE = False
		elif txt == "Event":
			myList = myList + txt + " --> "
			txt = input("Enter a date, time, and location:  \n")
			myList = myList + txt + "|"
			ifTorE = False
		print(txt + "has been added to the List")

def dequeue():
	global myList
	if len(myList) != 0:
		print("Are you sure you've completed this?:")
		peek()
		txt = input("Yes/No\n")
		if txt == "Yes":
			for i in range(len(myList)):
				if myList[i] == "|":
					print("To-Do completed: " + myList[:i] + "\n")
					myList = myList[i:]
					break
		elif txt == "No":
			print("There's noting in the List to Dequeue \n")
	else:
		print("There's nothing in the List to Dequeue \n")

def showall():
	global myList
	if len(myList) != 0:
		j=0
		for i in range(len(myList)):
			if myList[i] == "|":
				print("\n" + myList[j:i]+ "\n")
				j=i+1
	else:
		print("There is nothing in your List")

def main():
	global myList
	cond = True
	while cond:
		txt = input("Hello, What would you like to do?\nYour options are : Peek, Enqueue, Dequeue, ShowAll or Done\n")	

		if txt == "Peek":
			print("\nHere's your next To-Do : \n")
			peek()

		elif txt == "Enqueue":
			enqueue()

		elif txt == "Dequeue":
			dequeue()
				
		elif txt == "ShowAll" or txt == "Show All":
			showall()

		elif txt == "Done":
			cond = False

		else:
			print("I don't understand\n")

if __name__ == '__main__':
	myList = ""
	main()