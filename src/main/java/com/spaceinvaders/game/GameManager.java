package com.spaceinvaders.game;
import com.spaceinvaders.entities.Enemy;
import java.util.ArrayList;
import java.util.List;


public class GameManager{

private List<Enemy> enemies=new ArrayList<>(); //number of enemies at all time is dynamic
private double initialSpeed=50;
private double increaseSpeed=2;
private int direction=1;  //1 for right, -1 for left
private int initialEnemyCount;
private double screenWidth=800; // Assuming a screen width of 800 pixels
private double descentAmount=10; // Amount to descend when changing direction

public void addEnemy(Enemy enemy){
    enemies.add(enemy);
}
public void initializeEnemies(){
    initialEnemyCount=enemies.size();
}
private double getSpeed(){
    return initialSpeed+(initialEnemyCount-enemies.size())*increaseSpeed;
}
public void moveFormation(double tpf) {
    if (enemies.isEmpty()) {
    return;
}
    checkBoundaries();

    double dx = getSpeed() * direction * tpf;

    for (Enemy enemy : enemies) {
        enemy.move(dx, 0);
    }
}
private double getLeftBoundary(){
     double left = Double.MAX_VALUE;
     for(Enemy enemy:enemies){
        left=Math.min(left,enemy.getEntity().getX());
     }
     return left;
}
private double getRightBoundary(){
    double right=Double.NEGATIVE_INFINITY;
    for(Enemy enemy:enemies){
        right=Math.max(right, enemy.getEntity().getX()
                + enemy.getEntity().getWidth());
    }
    return right;
}
private void moveDown(){

    for (Enemy enemy : enemies) {
        enemy.move(0, descentAmount);
    }
}
//checking boundaries and changing formation direction
private void checkBoundaries(){
if(getLeftBoundary()<=0 && direction==-1){
direction=1;
moveDown();
}
else if(getRightBoundary()>=screenWidth && direction==1){
direction=-1;
moveDown();
}
}


}
