import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Card implements ActionListener
{

	private JFrame win;
	private Card1 ds;
	private Timer time;
	private int speed;
	private int pause;
	
	public Card(){
	  ds = new Card1();      
      win = new JFrame();
      
      win.add( ds );
      win.setSize( 700, 700);      
      win.setVisible( true );
      speed=100;
      pause=200;
        time = new Timer(speed, this);
        time.setInitialDelay(pause);
        
        time.start();
	
	}
	
	public void actionPerformed(ActionEvent e){
		ds.changeColor();
		ds.repaint();
	System.out.println("Hola Me Nombre Es Dax Tubach");
	}


   public static void main( String[] args )
   {
     new Card(); 
      
    } 
} 
