import java.awt.*;
import java.io.*;
public class read_by_char
{
	static int b;
	static String sname;
	static char[] charrray;
	public static void main(String args[])
	{
		charrray=new char[20];
		int i=0;
		System.out.println("Ваше имя?");
		try
		{
			while ((b=System.in.read()) !=13)
			{charrray[i++]=(char) b;}
		}
		catch (IOException e)
		{
			System.out.println("Ошибка"+e);
		}
	sname=new String(charrray);
	System.out.println("Привет, приятель програмист, "+sname);
	}
}