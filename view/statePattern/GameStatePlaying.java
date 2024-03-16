package view.statePattern;

import java.awt.Graphics2D;

import view.AppWindow;

public class GameStatePlaying implements GameState {

    @Override
    public void goNext(AppWindow context) {
        context.setGameState(new GameStateDone());
    }

    @Override
    public void updateWindow() {
    
    }

    @Override
    public void updateCanvas(Graphics2D g2) {
    
    }
    
}
