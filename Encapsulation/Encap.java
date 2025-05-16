package package1;

public class Encap {
	
	protected String name;
	protected int age;
	protected String city;
	protected long phoneNo;
	
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName(String n)
	{
		return this.name;
		
	}
	public void setAge(int a)
	{
		this.age=a;
	}
	public int getAge(int a)
	{
		return this.age;
		
	}
	public void setCity(String v)
	{
		this.city=v;
	}
	public String getCity(String n)
	{
		return this.city;
		
	}
	public void setPhone(long number)
	{
		this.phoneNo=number;
	}
	public long getPhone(long number)
	{
		return this.phoneNo;
		
	}
	

}
