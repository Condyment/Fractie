
public class THEMAIN {

	
	
	public static void main(String[]args )
	{
		
	Fractie f=new Fractie();
	Fractie f1=new Fractie(10,10);
	Fractie f2=new Fractie(10,10);
	Fractie flast=new Fractie(f1,f2);
    System.out.println(flast);
    System.out.println(flast.uselessstuff);
    
	}
}
