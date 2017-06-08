
public class Washing {

	private boolean status;

	public Washing(boolean b) {
		
		this.status = b;
	}
	void washon()
	{
		this.status=true;
		System.out.println("washing machin is on");
	}
	void washoff()
	{
		this.status=false;
		System.out.println("washing machin is off");
	}
}
