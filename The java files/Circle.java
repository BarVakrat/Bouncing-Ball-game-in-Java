package gamebox_Final;


import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/** 
 * This class represents a 2D circle in the plane. Please make sure you update it 
 * according to the GeoShape interface.
 */
public class Circle implements GeoShape{

	/* 
	 * Please, do not change this function!
	 * 
	 */

	private int Radius;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int r;
	private int g;
	private int b;

	public Circle(int x, int y, int radius, int r, int g, int b) {
		this.x = x;
		this.y = y;
		this.Radius=radius;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public void draw(Graphics g, Component c) {
		g.setColor(new Color( getRed(),getGreen(),getBlue()));
		g.fillOval(getX(), getY(), getRadius(), getRadius());
		g.setColor(new Color(0,0,0));
		g.drawOval(getX(), getY(), getRadius(), getRadius());

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
	public boolean intersects(GeoShape g) {
		if ( g instanceof Circle) {
			Circle c = (Circle)g;
			if (distance(this, c)  <= this.Radius + c.getRadius())
				return true;
		}
		if (g instanceof Rectangle) {
			Rectangle c = (Rectangle) g;
			for (int i = c.getX(); i <= c.getX() + c.getWidth(); i++)
				for (int j = c.getY(); j <= c.getY() + c.getHeight(); j++)
					if(PointDis(i, j) <= this.Radius)
						return true;
		}
		return false;
	}

	@Override
	public void setColor(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
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

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	public double distance(Circle c1, Circle c2) {
		return Math.sqrt(Math.pow(c1.getX() - c2.getX(), 2) + Math.pow(c1.getY() - c2.getY(), 2));
	}

	public double PointDis(int a, int b) {
		return Math.sqrt(Math.pow(x - a,2)+Math.pow(y - b,2));
	}

}
