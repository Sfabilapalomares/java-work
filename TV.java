package ch5;

public class TV 
{

	
	//Instance Variables
		private int channel;
		private int volume;
		private boolean on;
		private int MaxChannel;
		private int MaxVolume;
		
	//Contructors
	public TV()
	{
		channel = 1;
		volume = 1;
		on = false;
		MaxChannel = 1;
		MaxVolume = 1;
		
	}
	//stubs
	public int getChannel()
	{ return channel;}
	
	public int getVolume()
	{ return volume;}
	
	public int getMaxChannel()
	{ return MaxChannel;}
	
	public int getMaxVolume()
	{ return MaxVolume;}
	
	public boolean isOn()
	{return on;}
	
	public void setChannel(int someChannel)
	{
		if(on == true && someChannel >= 1 && someChannel <= MaxChannel)
		{
			channel = someChannel;
		}
		
		else
		{
		}
	}
	
	public void setVolume(int someVolume)
	{
		if(on == true && someVolume >= 1 && someVolume <= MaxVolume)
		{
			volume = someVolume;
		}
		
		else
		{
		}
	}
	
	public void setMaxChannel(int maxCh)
	{MaxChannel = maxCh;}
	
	public void setMaxVolume(int maxVol)
	{MaxVolume = maxVol;}
	
	public void channelUp()
	{if(on == true && channel == MaxChannel)
	{
		channel = 1;
	}
	else if(on == true && channel < MaxChannel)
	{
		channel = channel + 1;
	}
	else
	{	
	}
	}
	
	public void channelDown()
	{if(on == true && channel == 1)
	{
		channel = MaxChannel;
	}
	else if(on == true && channel > 1)
	{
		channel = channel - 1;
	}
	else
	{
	}
	}
	
	public void volumeUp()
	{
	if(on == true && volume < MaxVolume)
	{
		volume = volume + 1;
	}
	else
	{
	}
	}
	
	public void volumeDown()
	{	if(on == true && volume > 0)
	{
		volume = volume - 1;
	}
	else
	{
	}
	}
	
	public void turnOn()
	{ on = true;}
	
	public void turnOff()
	{ on = false;}
	
	public String toString()
	{
	return "\n\tChannel: " + channel
			+ "\n\tVolume: " + volume 
			+ "\n\ton: " + on 
			+ "\n\tmaxChannel: " + MaxChannel 
			+ "\n\tmaxVolume: " + MaxVolume;
	}
	
	
	
	
	
	
}


