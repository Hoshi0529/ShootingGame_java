import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character implements KeyListener{
	public void draw(MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect(x, y+20, 30, 10);
		f.setColor(200, 200,200);
		f.fillRect(x+10, y, 10, 30);
		f.setColor(200, 200,200);
		f.fillRect(x, y+20, 10, 30);
		f.setColor(200, 200,200);
		f.fillRect(x+20, y+20, 10, 30);
		f.setColor(0,128,0);
		f.fillRect(x-20, y+40, 30, 10);
		f.setColor(0,128,0);
		f.fillRect(x+20, y+40, 30, 10);
		f.setColor(200, 200,200);
		f.fillRect(x-20, y+40, 10, 30);
		f.setColor(200, 200,200);
		f.fillRect(x, y+40, 10, 30);
		f.setColor(200, 200,200);
		f.fillRect(x+20, y+40, 10, 30);
		f.setColor(200, 200,200);
		f.fillRect(x+40, y+40, 10, 30);
		
		
	}
	public Player(double x, double y, double vx, double vy) {
		//Characterクラスのコンストラクタ呼び出し(8章)
		super(x,y,vx,vy);
	}
	  public void move() {
		   super.move();
		   if(x<0) x=0;
		   if(x>370) x=370;
	   }
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			GameWorld.playerBullets.add(
					new PlayerBullet(x,y,0,-10));
			GameWorld.playerBullets.add(
					new PlayerBullet(x,y,9,-10));
			GameWorld.playerBullets.add(
					new PlayerBullet(x,y,-9,-10));
			System.out.println("弾の数="+GameWorld.playerBullets.size());
		}
		
	}

   public void keyReleased(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		vx=0;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		vx=0;
	}
}
   public void keyTyped(KeyEvent e) {

   }
}
