package model;

import java.awt.geom.Point2D;

public class Projectile extends Ship {
	private Boolean ally;
	
	public Projectile(){
		super();
		this.ally = true;
	}
	
	public Projectile(Point2D pos, Boolean ally){
		super(pos);
		this.ally = ally;
	}
}
