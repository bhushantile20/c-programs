//Slip16_2: Write a program to design a screen using Awt that,
                           
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.event.*;
class demo extends JFrame 
{
	JMenuBar mb;
	JMenu m1,m2,m3;
	JMenuItem open,save,cut,copy,new1,exit1;
	JCheckBoxMenuItem jcm;
	
	demo()
	{
		setLayout(null);			
		setSize(800,800);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		mb=new JMenuBar();
		setJMenuBar(mb);
		
		m1=new JMenu("File");
		mb.add(m1);	
		
		new1=new JMenuItem("New     CTRL+N");
		m1.add(new1);
		m1.setMnemonic(KeyEvent.VK_N);
		open=new JMenuItem("Open");
		m1.add(open);
		
		save=new JMenuItem("Save");
		m1.add(save);
		m1.addSeparator();

		jcm=new JCheckBoxMenuItem("Show About");

		m1.add(jcm);
		m1.addSeparator();
		exit1=new JMenuItem("Exit");
		m1.add(exit1);

		m2=new JMenu("Edit");
		mb.add(m2);
		
		m3=new JMenu("About");
		mb.add(m3);
		
	}
	public static void main(String args[]) 
	{
    	new demo();
	}
}
