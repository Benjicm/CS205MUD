import java.util.*;

public class Item {
	String name;
	int ID;
	boolean carriable;
	boolean beingCarried;
	int containerID;
	
	Item()
	{
		name = "";
		ID = 0;
		carriable = false;
		beingCarried = false;
		containerID = 0;
	}
	Item(String name, int ID, boolean carriable)
	{
		this.name = name;
		this.ID = ID;
		this.carriable = carriable;
		beingCarried = false;
		containerID = 0;
	}
	Item(String name, int ID, boolean carriable, boolean beingCarried, int containerID)
	{
		this.name = name;
		this.ID = ID;
		this.carriable = carriable;
		this.beingCarried = beingCarried;
		this.containerID = containerID;
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	public int getContainerID()
	{
		return containerID;
	}
	public boolean isCarriable()
	{
		return carriable;
	}
	public boolean isBeingCarried()
	{
		return beingCarried;
	}
	public void setContainer(boolean isBeingCarried, int containerID)
	{
		if((carriable && isBeingCarried) || (!isBeingCarried))
		{
			beingCarried = isBeingCarried;
			this.containerID = containerID;
		}
	}
}
