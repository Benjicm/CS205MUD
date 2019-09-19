import java.util.*;

/**
 * @author ben
 *
 */
public class Room {
	String description;
	int ID;
	ArrayList<Integer> items;
	ArrayList<Integer> chars;
	ArrayList<Exit> exits;
	Room()
	{
		ID = 0;
		description = "";
		items = new ArrayList<Integer>();
		chars = new ArrayList<Integer>();
		exits = new ArrayList<Exit>();
	}
	Room(String desc, int ID)
	{
		this.ID = ID;
		description = desc;
		items = new ArrayList<Integer>();
		chars = new ArrayList<Integer>();
		exits = new ArrayList<Exit>();
	}
	
	/** Gets the description of the room.
	 * @return the description of the room
	 */
	public String getDesc()
	{
		return description;
	}
	/** Gets the room's ID.
	 * @return the ID of the room
	 */
	public int getID()
	{
		return ID;
	}
	/** Gets the ID of every item in the room.
	 * @return an ArrayList containing the ID of every item contained in the room
	 */
	public ArrayList<Integer> getItems()
	{
		return items;
	}
	/** Gets the ID of every character in the room.
	 * @return an ArrayList containing the ID of every item contained in the room
	 */
	public ArrayList<Integer> getChars()
	{
		return chars;
	}
	/** Gets all the exits to the room.
	 * @return an ArrayList all the exits to this room
	 */
	public ArrayList<Exit> getExits()
	{
		return exits;
	}
	
	/** Adds an exit to the room.
	 * @param roomID the ID of the room the new exit leads to
	 * @param dir the direction in which the new exit is located
	 */
	public void addExit(int roomID, String dir)
	{
		if(this.getExit(dir) == null)
		{
			Exit newExit = new Exit(roomID, dir);
			exits.add(newExit);
		}
		
	}
	/** Adds an item to the room.
	 * @param itemID the ID of the item to be added
	 */
	public void addItem(int itemID)
	{
		if(!containsItem(itemID))
		{
			items.add(itemID);
		}
	}
	/** Adds a character to the room.
	 * @param charID the ID of the character to be added
	 */
	public void addChar(int charID)
	{
		if(!containsChar(charID))
		{
			chars.add(charID);
		}
	}
	/** Gets the exit in direction dir, if one exists.
	 * @param dir the direction of the exit to return
	 * @return the Exit in direction dir if one exists, null if one does not exist.
	 */
	public Exit getExit(String dir)
	{
		for (int i = 0; i < exits.size(); i++)
		{
			String d = exits.get(i).getDir();
			if(d.equals(dir))
			{
				return exits.get(i);
			}
		}
		return null;
	}
	/** If there is an exit in direction dir, returns the ID of the room in that direction.
	 * @param dir the direction to check
	 * @return the ID of the room in direction dir (0 if there is no exit in that direction)
	 */
	public int getConnectedRoomID(String dir)
	{
		Exit e = this.getExit(dir);
		if (e != null)
		{
			return e.getNextRoom();
		}
		//returning 0 indicates that no exit in direction dir exists
		return 0;
	}
	/** Checks whether or not this room contains the item with ID itemID
	 * @param itemID the ID of the item to check
	 * @return true if the room contains the item, false if not
	 */
	public boolean containsItem(int itemID)
	{
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i) == itemID)
			{
				return true;
			}
		}
		return false;
	}
	/** Checks whether or not this room contains the character with ID charID
	 * @param charID the ID of the item to check
	 * @return true if the room contains the character, false if not
	 */
	public boolean containsChar(int charID)
	{
		for(int i = 0; i < chars.size(); i++)
		{
			if(chars.get(i) == charID)
			{
				return true;
			}
		}
		return false;
	}
	/** If the item with ID itemID is contained within this room, removes it from the room
	 * @param itemID the ID of the item to remove
	 */
	public void removeItem(int itemID)
	{
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i) == itemID)
			{
				items.remove(i);
			}
		}
	}
	/** If the character with ID charID is contained within this room, removes it from the room
	 * @param charID the ID of the item to remove
	 */
	public void removeChar(int charID)
	{
		for(int i = 0; i < chars.size(); i++)
		{
			if(chars.get(i) == charID)
			{
				chars.remove(i);
			}
		}
	}
}
