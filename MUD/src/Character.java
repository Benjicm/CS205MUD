import java.util.*;

public class Character {
	String name;
	int ID;
	int currentRoom;
	ArrayList<Integer> inventory;
	
	Character()
	{
		name = "";
		ID = 0;
		currentRoom = 0;
		inventory = new ArrayList<Integer>();
	}
	Character(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
		currentRoom = 0;
		inventory = new ArrayList<Integer>();
	}
	Character(String name, int ID, int startingRoom)
	{
		this.name = name;
		this.ID = ID;
		currentRoom = startingRoom;
		inventory = new ArrayList<Integer>();
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	public int getRoom()
	{
		return currentRoom;
	}
	public ArrayList<Integer> getInv()
	{
		return inventory;
	}
	public boolean holdingItem(int itemID)
	{
		for(int i = 0; i < inventory.size(); i++)
		{
			if(inventory.get(i) == itemID)
			{
				return true;
			}
		}
		return false;
	}
	public void addItem(int itemID)
	{
		if(!holdingItem(itemID))
		{
			inventory.add(itemID);
		}
	}
	public void removeItem(int itemID)
	{
		for(int i = 0; i < inventory.size(); i++)
		{
			if(inventory.get(i) == itemID)
			{
				inventory.remove(i);
				return;
			}
		}
	}
	public void setRoom(int roomID)
	{
		currentRoom = roomID;
	}
}
