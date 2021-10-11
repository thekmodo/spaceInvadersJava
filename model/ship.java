package model;

import java.awt.geom.Point2D;

public class Ship {
    private Point2D pos;

    public Ship(){
        this.pos = new Point2D.Double(1, 1);
    }

    public Ship(Point2D pos){
        this.pos = pos;
    }

    public void moveX(Boolean dir){
        if(dir){
            this.pos.setLocation(this.pos.getX()+10, this.pos.getY());
        }else{
            this.pos.setLocation(this.pos.getX()-10, this.pos.getY());
        }
    }

    public void moveY(Boolean dir){
        if(dir){
            this.pos.setLocation(this.pos.getX(), this.pos.getY()+10);
        }else{
            this.pos.setLocation(this.pos.getX(), this.pos.getY()-10);
        }
    }

    public Point2D getPos(){
        return this.pos;
    }

}
