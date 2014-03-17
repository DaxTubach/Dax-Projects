import java.awt.Graphics;

	import javax.swing.JPanel;


	public class CombatPanel extends JPanel {

		private Tank t,t2;
		private Level l;
		
		public void fire (int tank){
			Tank temp;
			if(tank==1)temp=t;
			else temp=t2;
			
			temp.fire();
		}
		public void update(){
			t.moveBullet();
			t2.moveBullet();
			
		}

		public void moveDir(char c,int Tank){
			Tank temp;
			if(Tank==1)temp=t;
			else temp=t2;
			temp.move(c);
			//collisions
			
			if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
			t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight())){
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l'){temp.setX(temp.getX()+25);
			}
			if(c=='r'){temp.setX(temp.getX()-25);
			}}
			
			//Middle-left box		
			if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
			l.geto1TopX(),l.geto1TopY(),l.geto1Width(),l.geto1Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}
			if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
			l.geto1TopX(),l.geto1TopY(),l.geto1Width(),l.geto1Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}			
			
			
			//middle-right box
			if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
			l.geto3TopX(),l.geto3TopY(),l.geto3Width(),l.geto3Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}
			if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
			l.geto3TopX(),l.geto3TopY(),l.geto3Width(),l.geto3Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}
			//middle-right box
			if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
			l.geto2TopX(),l.geto2TopY(),l.geto2Width(),l.geto2Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}
			if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
			l.geto2TopX(),l.geto2TopY(),l.geto2Width(),l.geto2Height()))
			{
			if(c=='u')temp.setY(temp.getY()+25);
			if(c=='d')temp.setY(temp.getY()-25);
			if(c=='l')temp.setX(temp.getX()+25);
			if(c=='r')temp.setX(temp.getX()-25);
			}



	
	}
	public CombatPanel(){
		t=new Tank(250,475,255,255,51);
		t2=new Tank(1350,475,51,255,255);
		l=new Level();
	
		
	}
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h)
	{
	    if ((b1_x > b2_x + b2_w - 1) || // is b1 on the right side of b2?
	        (b1_y > b2_y + b2_h - 1) || // is b1 under b2?
	        (b2_x > b1_x + b1_w - 1) || // is b2 on the right side of b1?
	        (b2_y > b1_y + b1_h - 1))   // is b2 under b1?
	    {
	        // no collision
	        return false;
	    }
	 
	    // collision
	    return true;
	}
	
	public void paintComponent(Graphics g){
	
		
		
		//Tanks
	 
		l.draw(g);
		t.draw(g);
		t2.draw(g);
	
		
	}

}
