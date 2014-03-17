import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

import javax.swing.JFrame;
public class Combat implements KeyListener, ActionListener{
	
	private JFrame window;
	private CombatPanel cp;
	private Timer time;
	
	public Combat() {
		window=new JFrame ("Combat Game");
		cp=new CombatPanel();
		window.add(cp);
		window.setSize(1600,1000);
		time=new Timer(100,this);
		time.start();
		window.setVisible(true);
		window.addKeyListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		cp.update();
		cp.repaint();

	}
	
	public static void main(String[] args) {
		new Combat();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("K"+e.getKeyCode());
		if(e.getKeyCode()==87){
			//W-UP
			cp.moveDir('u',1);

		}
		else if(e.getKeyCode()==83){
			//S-Down
			cp.moveDir('d',1);
		}else if(e.getKeyCode()==68){
			//A-Right
			cp.moveDir('r',1);
		}else if(e.getKeyCode()==65){
			//D-Left
			cp.moveDir('l',1);
		}else if(e.getKeyCode()==37){cp.moveDir('l',2);}
		else if(e.getKeyCode()==40){cp.moveDir('d',2);}
		else if(e.getKeyCode()==39){cp.moveDir('r',2);}
		else if(e.getKeyCode()==38){cp.moveDir('u',2);}
		
		//fire
		else if(e.getKeyCode()==32){cp.fire(1);}
		else if(e.getKeyCode()==10){cp.fire(2);}

			
		
		cp.repaint();

	}
	
	
	
	public void keyReleased(KeyEvent arg0) {
		
	}
	
	public void keyTyped(KeyEvent arg0) {
		
	}
}