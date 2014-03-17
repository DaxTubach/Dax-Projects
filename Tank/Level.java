import java.awt.*;

public class Level 
{
	
	//collisions
	//Middle-Left Box
	public int geto1TopX(){return 500;}
	public int geto1TopY(){return 425;}
	public int geto1Width(){ return 100;}
	public int geto1Height(){ return 150;}
	
	//Middle-right box
	public int geto2TopX(){return 1000;}
	public int geto2TopY(){return  425;}
	public int geto2Width(){ return 100;}
	public int geto2Height(){ return 150;}
	
	//TOP BORDER
	public int geto3TopX(){return 0;}
	public int geto3TopY(){return  60;}
	public int geto3Width(){ return 1600;}
	public int geto3Height(){ return 2;}
	


public void draw (Graphics g){
//background color
g.setColor(Color.white);
g.fillRect (0, 0, 1600, 1000);

  // Barrier Left
  g.setColor(Color.black);
  //top
  g.fillRect (200, 380, 150, 10);
  //center
  g.fillRect (350, 380, 10, 260);
  //bottom
  g.fillRect (200, 630, 150, 10);
  
  
  // Barrier Right
  g.setColor(Color.black);
  //top
  g.fillRect (1250, 380, 150, 10);
  //center
  g.fillRect (1250, 380, 10, 260);
  //bottom
  g.fillRect (1250, 630, 150, 10);
  
  
  // Bottom right barrier
  g.fillRect( 1200, 750, 125, 40);
  
  // Bottom left barrier
  g.fillRect( 275, 750, 125, 40);
  
  //Obstacle bottom    
  g.setColor(Color.black);
  g.fillRect (750, 700, 100, 150);
  
  
  //Obstacle Top   
  g.setColor(Color.black);
  g.fillRect (600, 175, 100, 50);
 
  //Obstacle Top   right
  g.setColor(Color.black);
  g.fillRect (925, 175, 100, 50);
  
  // Center
  g.fillRect(775, 350, 50, 200);
  
  //Obstacle middle  right
  g.setColor(Color.black);
  g.fillRect (1200, 200, 150, 50);
 
  //Obstacle middle  left
  g.setColor(Color.black);
  g.fillRect (275, 200, 150, 50);
  
   //Obstacle left
  g.setColor(Color.black);
  g.fillRect (500, 425, 100, 150);
  
   //Obstacle right
  g.setColor(Color.black);
  g.fillRect (1000, 425, 100, 150);
  
  //Scoreboards
  //border
  g.fillRect(0,60,1600,2);
  //left scoreboard
  g.fillRect(150, 5, 130, 50);
  //Score left
  Font s=new Font("Arial", Font.BOLD,  50);
   g.setFont(s);
   g.setColor( Color.white );
   g.drawString("00",185,46);
  //Right Scoreboard
  g.setColor(Color.black);
  g.fillRect(1300, 5, 130, 50);
  //Score Right
   g.setFont(s);
   g.setColor( Color.white );
   g.drawString("00",1340,46);
    
    
 
   

  	 
  	 
  //WoRDS

  Font f=new Font("Arial", Font.BOLD,  72);
  g.setFont(f);
  g.setColor( Color.black );
  g.drawString("COMBAT BEGIN!",500,50);
  	 
  	 

  	


	
}
}
 

