
public class Ac {

	private int temprature;
	private boolean status;

	public Ac(boolean b, int i) {
		
		this.status=b;
		this.temprature=i;
	}
	public boolean acon()
	{
		this.status=true;
		return status;
	}
	void acoff()
	{
		this.status=false;
		System.out.println("ac is off");
	}
	public int increasetemp(){
		int count=0;
		for(int i=0;i<30;i++){
			count++;
		}
		return count;
		
	}
}
