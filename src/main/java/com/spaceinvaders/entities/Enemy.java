package com.spaceinvaders.entities;
import com.spaceinvaders.interfaces.Movable;
public class Enemy extends GameObject implements Movable {

    public Enemy(int initialHealth){
        super(initialHealth);
   
    }
    @Override 
    public void move(double dx, double dy){
        this.getEntity().translate(dx, dy);
    }
   
} 
