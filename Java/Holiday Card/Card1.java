import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class Card1 extends JPanel
{

   private Color color;
   
   public Card1(){



   }
   
   public void changeColor(){
      color=(color==Color.GREEN)?Color.RED:Color.GREEN;
   }
   
   public void paintComponent( Graphics g )
   {
   super.paintComponent( g );
        //background color
    g.setColor( new Color (0, 153, 0));
    g.fillRect (0, 0, 700, 700);

      // face
      g.setColor( new Color (255, 204, 153));
      g.fillOval( 250, 130, 150, 200 );
      
   	  // eyes
      g.setColor( Color.BLACK );
      g.fillOval( 275, 165, 20, 20 );
      g.fillOval( 350, 165, 20, 20 );
      
      // mouth
      g.fillOval( 270, 230, 100, 40 );
      
      // "mouth into a smile
      g.setColor( new Color (255, 204, 153));
      g.fillOval( 260, 220, 120, 45 );
      
      // Boots
      g.setColor(Color.RED);
      g.fillRect ( 400, 500, 50, 150 );
      g.fillOval ( 400, 600, 100, 50 );
      g.fillRect ( 200, 500, 50, 150 );
      g.fillOval ( 150, 600, 100, 50 );
      
      // Stomach
      g.setColor(Color.RED);
      g.fillOval (170, 325, 300, 240 );
      
      //Buttons
      g.setColor(Color.BLACK);
      g.fillOval (315, 400, 20, 20 );
      g.fillOval (315, 350, 20, 20 );
      g.fillOval (315, 450, 20, 20 );
      
      // Belt
      g.setColor(Color.BLACK);
      g.fillRect (200, 500, 250, 50);
      
      //Buckle
      g.setColor(Color.YELLOW);
      g.fillRect (295, 500, 50, 50);
      
      
      //hole
      g.setColor(Color.BLACK);
      g.fillRect (308, 514, 25, 25);
      
      //Beard
      g.setColor(Color.white);
      int xpoints[]= {275, 270, 375};
      int ypoints[]= {310, 360, 310};
      int npoints=3;
      g.fillPolygon(xpoints, ypoints, npoints);
      
      //nose
      g.setColor(Color.red);
      int xpoint[]= {275, 325, 375};
      int ypoint[]= {220, 180, 220};
      int npoint=3;
      g.fillPolygon(xpoint, ypoint, npoint);
      
      //hat
      g.setColor(Color.red);
      int xpoint1[]= {275, 325, 375};
      int ypoint1[]= {140, 70, 140};
      int npoint1=3;
      g.fillPolygon(xpoint1, ypoint1, npoint1);
      
      //ball
      g.setColor(Color.white);
      g.fillOval(310,62,20,20);
      
      
      //arms
      g.setColor(Color.red);
      g.fillRect(100, 380, 160, 30);
      g.fillRect(380, 380, 160, 30);
      
      //hands
      g.setColor(Color.black);
      g.fillOval(90,365,30,50);
      g.fillOval(520,365,30,50);
      
    
      
     //Background
      Random r=new Random();
      for(int j=0;j<250;j++){
   	   int x=r.nextInt(1000);
   	    int y=r.nextInt(1000);
   	    int size=r.nextInt(20);
    	  int endX=0,endY=0;
       
	
    	  for ( int i = 0; i<6; i++ ){
    
     	 endX = x + (int)(size*Math.cos( (2*Math.PI/6)*i ));
    	  endY = y - (int)(size*Math.sin( (2*Math.PI/6)*i ));
     	 g.drawLine( x, y, endX, endY );
     	 
     	 
     //WoRDS

     Font f=new Font("Arial", Font.BOLD,  72);
     g.setFont(f);
     g.setColor( color );
     g.drawString("Happy Holidays",100,50);
     	 
     	 
  
     	}
     	  
     	
     	}
    
         } 
} 