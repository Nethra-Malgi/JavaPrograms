package polymorphism;

public class ConstructorOverloading {
	
	double h,w;
	int d;
	//declaring the variables
	
	ConstructorOverloading() //default constructor
	{
		h=w=d=10;  //assigning the values to variables
	}
	
	/*ConstructorOverloading(double height,double width,double depth) //paramerized con
	{
		h=height;
		w=width;
		d=depth;
	}*/
	
	ConstructorOverloading(double height,double width,int depth)
	{
		h=height;
		w=width;
		d=depth;
	}
	
	void boxVol()
	{
		System.out.println(h*w*d);
	}

}
