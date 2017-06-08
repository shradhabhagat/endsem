
public class Music {

	private int volume;
	private boolean status;

	public Music(boolean b, int i) {
		// TODO Auto-generated constructor stub
		this.status=b;
		this.volume=i;
	}
	void musicon()
	{
		this.status=true;
		System.out.println("music is on");
	}
	void musicoff()
	{
		this.status=false;
		System.out.println("music is off");
	}
	void volumeup()
	{
		if(this.status==true)
		{
		this.volume=this.volume+1;
		System.out.println("volume is"+this.volume);
		}
		else
		{
			System.out.println("music is off" );
		}
	}
	void volumedown()
	{
		if(this.status==true)
		{
		this.volume=this.volume-1;
		System.out.println("volume is"+this.volume);
		}
		
		else
		{
			System.out.println("music is off" );
		}
		
		
		}
}
