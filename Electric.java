public class Electric{
	
	public static void main(String args []) {
		int unit =400;
		
		
		
	double bill = 0;
		
		if(unit<=100)
{
			bill=10*unit;
}
		else if (unit>100 && unit<=200) 
{
			bill = 100*10 + (unit - 100) * 15;
}
		else if (unit>200 && unit<=300) 
{
			bill = 100*10 + 100 *15+ (unit - 200)* 20;
}
		else if (unit>300 )
{
			bill = 100*10 + 100*15 + 100*20 + (unit - 300) * 25;
}	
			
			
		System.out.println(bill);
}
}