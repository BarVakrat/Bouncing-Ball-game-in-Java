package gamebox_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D axis parallel rectangle.
 *
 */
public class Rectangle implements GeoShape {

	/* 
	 * Please, do not change this function!
	 * 
	 */
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int r;
	private int g;
	private int b;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height, int r, int g, int b) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void draw(Graphics g, Component c) {
		g.setColor(new Color(getRed(), getGreen(), getBlue()));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.setColor(new Color(0, 0, 0));
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void translateX() {
		x = dx + x;
	}

	@Override
	public void translateY() {
		y = dy + y;
	}
	
	@Override
	public void setColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public boolean intersects(GeoShape g) {
		if (g instanceof Rectangle) {
			Circle c = (Circle) g;
			for (int i = this.x; i <= this.x + width; i++)
				for (int j = this.y; j <= this.y + height; j--)
					if(c.PointDis(i, j) <= c.getRadius())
						return true;
		}
		
		return false;
	}

	@Override
	public int getDx() {
		return dx;
	}

	@Override
	public void setDx(int dx) {
		this.dx = dx;
	}

	@Override
	public int getDy() {
		return dy;
	}

	@Override
	public void setDy(int dy) {
		this.dy = dy;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int getRed() {
		return r;
	}

	@Override
	public int getGreen() {
		return g;
	}

	@Override
	public int getBlue() {
		return b;
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
	
	public double distance(Circle r1, Rectangle r2) {
		return Math.sqrt(Math.pow(r1.getX() - r2.getX(), 2) + Math.pow(r1.getY() - r2.getY(), 2));
	}
	
	public double PointDis(int a, int b) {
		return Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
	}
}
