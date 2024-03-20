//Slip19_2: Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci) subjects. Display the selected subject in a text field

import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*;  
public class demo extends JFrame implements ItemListener
{    
    JComboBox cb;
    JTextField t1;
    demo()
    {   
	    setLayout(new FlowLayout());   
String sub[]={"TCS","JAVA","WT","FDS","OS"};
        	cb=new    JComboBox(sub);    

	add(cb);        
           
            setSize(400,500);    
          
	cb.addItemListener(this);
	t1=new JTextField("selected subjects:"); 
	add(t1);
setVisible(true); 	         
     }    
     public void itemStateChanged(ItemEvent E)
     {
		t1.setText(cb.getSelectedItem() + " selected");
     } 
     public static void main(String[] args) 
     {    
       new demo();    
     }    
}  