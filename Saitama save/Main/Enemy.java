package Main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/*
 * Represents enemy
 * 
 * */
public class Enemy {
	
	private int width;
	private int height;
	

	private int x;
	private int y;
	
	//
	private ImageIcon  enemyImageIcon = new ImageIcon("image/enemy.png");
	
	public Enemy() {
		this.width = enemyImageIcon.getIconWidth();
		this.height = enemyImageIcon.getIconHeight();
		

		Random random = new Random();
		random.nextInt(10);
		
		this.x = random.nextInt(GameMain.width - (width/2));
		this.y = -random.nextInt(GameMain.height - (height/2));
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void move() {
		this.y += 1;
		
	}
	
	public void drawImage(Graphics g){
		g.drawImage(enemyImageIcon.getImage(), x, y, null);
	}
	

}
