// Demo from JAVA book
import java.awt.*;
import java.awt.event.*;

class Book
{
	String title;
	int price;
	Book (String s, int i)
	{
		this.title=s;
		this.price=i;
	}
}
public class Using_classes extends Frame implements ActionListener
{
	Book book;
	Button b1=new Button("Exit");
	Button b2=new Button("Create Object");
	Button b3=new Button("Show Object");
	
	public Using_classes()
	{
		setLayout(null);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b1.setBounds(20,40,100,20);
		b2.setBounds(20,70,100,20);
		b3.setBounds(20,100,100,20);
		setBackground(new Color(120,200,120));
	}
	public void actionPerformed (ActionEvent e)
	{
		Graphics g=getGraphics();
		//Graphics mess=getGraphics();
		if (e.getSource()==b1)
			System.exit(0);
		else
			if (e.getSource()==b2)
			{
				if (book==null)
					book=new Book("Pinoccio",200);
				else
					System.out.println("Объект существует");
					//mess.drawString("The oject exist",20,200);
			}
			else
				if (e.getSource()==b3)
				{
					if (book!=null)
					{
						//Graphics g=getGraphics();
						g.drawString(book.title,20,200);
					}
				}
	}
	public static void main(String [] args)
	{
		Using_classes f=new Using_classes();
		f.resize(500,500);
		f.setVisible(true);
	}
	
}