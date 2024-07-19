package firstproject;

public class Leapyear {

	public static void main(String[] args) {
		int year =2004;
		if(year %4 ==0 )
		{
			System.out.println("year is leap year:"+year);
		}
		else if(year %400 == 0)
		{
			System.out.println("year is leap year:"+year);
		}
		else if(year %100!=0)
		{
			System.out.println("Entered year is not leap year:"+year);
		}
	}

}
