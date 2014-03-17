import java.awt.Color;
import java.awt.Graphics;


public class Tank {
   private Bullet b1;
	private int x;
	private int y;
	private char dir;
	private Color tankColor;
	
	//moveBullet
	public void moveBullet(){
		b1.move();
	}
	

	public void fire(){
		if(b1.getIsFired())return;
	    b1.fire(dir, x, y);
	   
		
	}
	
	
	
	public int getTopX(){if(dir=='u'||dir=='d')return x-17; return x-30;}
	public int getTopY(){if(dir=='u'||dir=='d')return y-22; return y-12;}
	public int getWidth(){if(dir=='u'||dir=='d')return 84; return 112;}
	public int getHeight(){if(dir=='u'||dir=='d')return 102; return 84;}
	
	
	public int getX(){return x;}
	public void setX(int i){x=i;}
	public int getY(){return y;}
	public void setY(int i){y=i;}
	
	public void moveLeft(){
		x=x-25;
	}
	public void moveRight(){
		x=x+25;
	}
	public void moveUp(){
		y=y-25;
	}
	public void moveDown(){
		y=y+25;
	}
	public void move(char _dir){
		dir=_dir;
		if(dir=='u'){
			y-=25;
		}else if(dir=='d'){
			y+=25;
		}else if(dir=='l'){
			x-=25;
		}else if(dir=='r'){
			x+=25;
		}
		else if(dir=='u'){
			y-=25;
		}else if(dir=='d'){
			y+=25;
		}else if(dir=='l'){
			x-=25;
		}else if(dir=='r'){
			x+=25;
		}
			
	}
	public Tank(int _x,int _y, int r, int g, int b) {
	
		x=_x;
		y=_y;
		dir='d';
		tankColor=new Color(r,g,b);
		b1=new Bullet(x,y,false);
		
	}
	public void draw(Graphics g){
		b1.draw(g);
		if(dir=='u'){
		//outline U
		g.setColor(Color.RED);
		g.drawLine(x-17, y-22, x+67, y-22);
		g.drawLine(x-17, y+80, x+67,y+80);
		g.drawLine(x-17, y+80, x-17,y-22);
		g.drawLine(x+67, y-22, x+67,y+80);
		}
		if(dir=='d' ){
			//outline D
			//outline D
			g.setColor(Color.RED);
			g.drawLine(x-17, y-12, x+67, y-12);
			g.drawLine(x-17, y+80, x+67,y+80);
			g.drawLine(x-17, y+80, x-17,y-12);
			g.drawLine(x+67, y-12, x+67,y+80);
			}
		
		if(dir=='l')	{
			//outline L
			g.setColor(Color.RED);
			g.drawLine(x-30, y-22, x+77, y-22);
			g.drawLine(x-30, y+62, x+77,y+62);
			g.drawLine(x-30, y+62, x-30, y-22);
			g.drawLine(x+77, y-22, x+77,y+62);	}
		if(dir=='r' ){
			//outline R
			g.setColor(Color.RED);
			g.drawLine(x-15, y-22, x+87, y-22);
			g.drawLine(x-15, y+62, x+87,y+62);
			g.drawLine(x-15, y+62, x-15, y-22);
			g.drawLine(x+87, y-22, x+87,y+62);}
		
		//center
		if (dir=='u' || dir=='d' || dir=='l' || dir=='r')
		{ g.setColor(tankColor);
		g.fillRect(x+0,y+0,60,60);
	}
		//tread
		g.setColor(Color.black);
		
		if(dir=='l' || dir=='r')
		{
			
			g.fillRect(x-10,y-20,85,20);
			g.fillRect(x-10,y+40,85,20);
		}
		else if (dir=='u'|| dir=='d')
			
		{
			g.fillRect(x-15,y-10,20,85);
			g.fillRect(x+45,y-10,20,85);

		}
		
		//turret
		g.setColor(Color.black);
		if(dir=='r')
		{g.fillRect(x+45, y+10,40,20);}
		else if(dir=='l')
		{g.fillRect(x-25, y+10,40,20);}
		else if(dir=='u')
		{g.fillRect(x+15, y-20,20,40);}
		else if(dir=='d')
		{g.fillRect(x+15, y+40,20,40);}
		
	
		
	
	
		
	}
		

		
		
		
	}

