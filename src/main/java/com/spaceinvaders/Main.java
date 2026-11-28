package com.spaceinvaders;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.spaceinvaders.game.GameManager;
import com.spaceinvaders.entities.Enemy;

public class Main extends GameApplication {
    private GameManager gameManager;

    @Override 
    protected void initGame(){
        gameManager=new GameManager();
          Enemy enemy = new Enemy(2);
FXGL.entityBuilder().at(100,100).view(FXGL.texture("monster_1.png", 50, 50)).with(enemy).buildAndAttach();
gameManager.addEnemy(enemy);
gameManager.initializeEnemies();
}
@Override
    protected void initSettings(GameSettings settings) { //method to configure the game
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Space Invaders");
    }
@Override
    protected void onUpdate(double tpf){
        gameManager.moveFormation(tpf);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

