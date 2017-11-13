import java.awt.*; // Подключаем библиотеки
import java.io.*;
public class string_lenth // объявляем класс
{
	static int b;
	static String slovo="";
	static char[] charray=new char[20];
	public static void main(String args[])
	{
		int i=0;
		System.out.println("Введите слово ->");
		try
		{
			while ((b=System.in.read()) !=13)
			{
				charray[i++]=(char) b;
			}
		}
		catch (IOException e)
		{
			System.out.println("The error"+e);
		}
		slovo=new String(charray);
		System.out.println("Введенное слово "+slovo.trim()+" c длиной - "+slovo.trim().length());
	}
}
