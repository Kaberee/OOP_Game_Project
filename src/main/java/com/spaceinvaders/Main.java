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
          for(int i=0; i<8; i++){
            Enemy enemy=new Enemy(2); 
            gameManager.addEnemy(enemy); // Each enemy has 2 health points
int row = i / 4;
int col = i % 4;

double x = 100 + col * 70;
double y = 80 + row * 60;
FXGL.entityBuilder()
    .at(x, y)
    .view(FXGL.texture("monster_" + (i + 1) + ".png", 65, 65))
    .with(enemy)
    .buildAndAttach();
          }

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

