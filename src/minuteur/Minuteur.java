package minuteur;

public class Minuteur {
	
	private int minute;
	
	public Minuteur()
	{
		this.minute = 0;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setMinute(int minute) 
	{
		this.minute = minute;
	}
	
	public void tic() 
	{ 
		if (this.minute == 59 ) 
		{ 
			this.minute = 0; 
		}
		else 
		{ 
			this.minute += 1; 
		} 
		System.out.println(this.minute + " min "); 
	} 
	
	public void avancer(int n) 
	{ 
		for (int i = 0; i < n; i++) 
		{ 
			this.tic(); 
		} 
	}
}
