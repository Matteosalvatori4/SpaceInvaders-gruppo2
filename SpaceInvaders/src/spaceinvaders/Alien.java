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
public class Alien extends ElementiDiGioco {

    public Alien(JButton button, double y) {
        setButton(button);
        setY(y);
        setTargetX(NewJFrameSpaceInvaders.ALIEN_XMAX);
        setTargetY(y);
        setX(NewJFrameSpaceInvaders.ALIEN_XMIN);
        setStepX(1);
        setStepY(0);
    }

    @Override
    public void raggiuntoTarget() {
        // si muove a destra
        if (getX() == NewJFrameSpaceInvaders.ALIEN_XMAX) {
            System.out.println("vado a sinistra");
            setTargetX(NewJFrameSpaceInvaders.ALIEN_XMIN);
        } //si muove a sinistra
        else {
            System.out.println("vado a destra");
            setTargetX(NewJFrameSpaceInvaders.ALIEN_XMAX);
        }
        //esegue il movimento
        setStepX(-getStepX());
    }
}
