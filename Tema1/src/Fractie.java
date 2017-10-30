
public class Fractie {
private int up;
private int down;
private Fractie unu;
private Fractie doi;
private int upl;
private int downl;
public  int uselessstuff;
public Fractie()
{
up=0;
down=0;
}

public Fractie(int up,int down )
{
	this.up=up;
	this.down=down;

}
public Fractie(Fractie unu, Fractie doi)
{
	this.unu=unu;
	this.doi=doi;
System.out.println(unu.up+"/"+unu.down);

System.out.println(doi.up+"/"+doi.down);

}
public String adunare()
{
	upl=((unu.up*doi.down)+(doi.up*unu.down));
	downl=(unu.down*doi.down);
	int i=simplificare(upl,downl);
return String.format("%d/%d",upl/i,downl/i);
}
public String scadere()
{
	
	upl=((unu.up*doi.down)-(doi.up*unu.down));
	downl=(unu.down*doi.down);
	int i=simplificare(upl,downl);
	return String.format("%d/%d",upl/i,downl/i);
}
public String inmultire()
{
	upl=unu.up*doi.up;
	downl=unu.down*doi.down;
	int i=simplificare(upl,downl);
	return String.format("%d/%d",upl/i,downl/i);

}
public String impartire()
{
	upl=unu.up*doi.down ;
	downl=unu.down*doi.up;
	int i=simplificare(upl,downl);
	return String.format("%d/%d",upl/i,downl/i);
}

public String toString()
{
	return String.format("adunare=%s\nscadere=%s\ninmultire=%s\nimpartire=%s",adunare(),scadere(), inmultire(),impartire());
	}
public int simplificare(int x,int y)
{int p = 1;
	for( int i=1000;i>=2;i--)
	{
	
		if(x%i==0&&y%i==0)
	{
p=i;
break;
	}
	
	}
	uselessstuff=p;
return p;
	}

}

