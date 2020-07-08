package live;
import music.*;
import music.string.*;
import music.wind.*;
class Test
{
	public static void main(String [] args)	
	{
	 	Veena veena=new Veena();
		veena.play();
		Saxophone sax=new Saxophone();
		sax.play();
		Playable  pla=new Veena();
		pla.play();
		Playable pla2=new Saxophone();
		pla2.play();
	}
}