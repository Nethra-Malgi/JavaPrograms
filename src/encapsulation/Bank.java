package encapsulation;

public class Bank {
	
	//wrapping the data and methods in a single unit
	//rules of encapsulation
	
	//1.variables should be private
	//2.for each variable 2 methods are available(setter and getter)
	//3. varibles can be operated only through methods not by object
	
	private int accno;
	private String name;
	private double bal;
	
	
	public int getAccno() 
	{
		return accno;
	}
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getBal() 
	{
		return bal;
	}
	public void setBal(double bal) 
	{
		this.bal = bal;
	}
	
	
	

}
