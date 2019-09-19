import java.util.*;

public class RoomList {
	ArrayList<Room> rooms;
	int nextID;
	
	RoomList()
	{
		rooms = new ArrayList<Room>();
		nextID = 0;
		addRoom("");
	}
	
	private int getRoomIndex(int roomID)
	{
		for(int i = 0; i < rooms.size(); i++)
		{
			if(rooms.get(i).getID() == roomID)
			{
				return(i);
			}
		}
		return 0;
	}
	public int addRoom(String desc)
	{
		Room r = new Room(desc, nextID);
		rooms.add(r);
		nextID++;
		return r.getID();
	}
	public String getRoomDesc(int roomID)
	{
		int i = getRoomIndex(roomID);
		if(i == 0)
		{
			return null;
		}
		return rooms.get(i).getDesc();
	}
	public ArrayList<Integer> getRoomItems(int roomID)
	{
		int i = getRoomIndex(roomID);
		if(i == 0)
		{
			return null;
		}
		return rooms.get(i).getItems();
	}
	public ArrayList<Integer> getRoomChars(int roomID)
	{
		int i = getRoomIndex(roomID);
		if(i == 0)
		{
			return null;
		}
		return rooms.get(i).getChars();
	}
	public ArrayList<Exit> getRoomExits(int roomID)
	{
		int i = getRoomIndex(roomID);
		if(i == 0)
		{
			return null;
		}
		return rooms.get(i).getExits();
	}
	public int moveChar(int roomID, int charID, String dir)
	{
		int firstIndex = getRoomIndex(roomID);
		if(rooms.get(firstIndex).containsChar(charID))
		{
			int nextRoom = rooms.get(firstIndex).getConnectedRoomID(dir);
			if(nextRoom != 0)
			{
				int secondIndex = getRoomIndex(nextRoom);
				rooms.get(firstIndex).removeChar(charID);
				rooms.get(secondIndex).addChar(charID);
				return nextRoom;
			}
		}
		return 0;
	}
	public boolean containsItem(int roomID, int itemID)
	{
		int i = getRoomIndex(roomID);
		return rooms.get(i).containsItem(itemID);
	}
	public boolean containsChar(int roomID, int charID)
	{
		int i = getRoomIndex(roomID);
		return rooms.get(i).containsChar(charID);
	}
	public void removeChar(int roomID, int charID)
	{
		int i = getRoomIndex(roomID);
		if(containsChar(roomID, charID))
		{
			rooms.get(i).removeChar(charID);
		}
	}
	public void removeItem(int roomID, int itemID)
	{
		int i = getRoomIndex(roomID);
		if(containsItem(roomID, itemID))
		{
			rooms.get(i).removeItem(itemID);
		}
	}
	public void addChar(int roomID, int charID)
	{
		int i = getRoomIndex(roomID);
		if(!containsChar(roomID, charID))
		{
			rooms.get(i).addChar(charID);
		}
	}
	public void addItem(int roomID, int itemID)
	{
		int i = getRoomIndex(roomID);
		if(!containsItem(roomID, itemID))
		{
			rooms.get(i).addItem(itemID);
		}
	}
	public void addExitToRoom(int fromRoomID, int toRoomID, String dir)
	{
		int i = getRoomIndex(fromRoomID);
		rooms.get(i).addExit(toRoomID, dir);
	}
}
