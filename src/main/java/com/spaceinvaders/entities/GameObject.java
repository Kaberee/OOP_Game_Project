package com.spaceinvaders.entities;
import com.almasb.fxgl.entity.component.Component;

public abstract class GameObject extends Component {
  private int health;
  private final int initialHealth;
  public GameObject(int initialHealth){
    if(initialHealth <= 0){
      throw new IllegalArgumentException("Initial health must be greater than zero.");
    }
    this.initialHealth = initialHealth;
    this.health = initialHealth;
  }
  public int getHealth() {
    return health;
  }
public int getInHealth(){
    return initialHealth;
}
public boolean alive(){
    return health>0;
}
public void damageIncurred(int amount){
    if(amount<=0){
        throw new IllegalArgumentException("Damage amount must be positive");
    }
    else if(amount>health){
        health=0;
    }
    else{
        health-=amount;
    }
}
    
}
