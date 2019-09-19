//import java.util.*;

public class Exit {
	public static final String NORTH = "N";
	public static final String NORTHEAST = "NE";
	public static final String EAST = "E";
	public static final String SOUTHEAST = "SE";
	public static final String SOUTH = "S";
	public static final String SOUTHWEST = "SW";
	public static final String WEST = "W";
	public static final String NORTHWEST = "NW";
	
	int exitsTo;
	String direction;
	
	Exit(int roomID, String dir)
	{
		exitsTo = roomID;
		direction = dir;
	}
	public int getNextRoom()
	{
		return exitsTo;
	}
	public String getDir()
	{
		return direction;
	}
}
