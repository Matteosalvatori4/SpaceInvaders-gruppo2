/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.JButton;

/**
 *
 * @author francesco
 */
public class Rocket extends ElementiDiGioco {
    
    public Rocket(JButton button, double x) {
        setButton(button);
        getButton().setVisible(true);
        setX(x);
        setY(NewJFrameSpaceInvaders.ROCKET_YMIN);
        setStepX(0);
        setStepY(-2);
    }

    @Override
    public void move() {
        //controllo margine superiore
        if (getY() == NewJFrameSpaceInvaders.ROCKET_YMAX) {
            getButton().setVisible(false);
            setStepX(0);
            setStepY(0);
        } else {
            setTargetX(NewJFrameSpaceInvaders.ROCKET_YMIN);
        }
    }
    
}
