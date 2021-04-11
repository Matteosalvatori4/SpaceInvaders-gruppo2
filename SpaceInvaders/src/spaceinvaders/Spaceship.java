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
public class Spaceship extends ElementiDiGioco {

    public Spaceship(JButton button) {
        setButton(button);
        setX(NewJFrameSpaceInvaders.SPACESHIP_XMIN);
        setY(NewJFrameSpaceInvaders.ROCKET_YMIN);
        setTargetX(getX());
        setTargetY(getY());
        setStepX(2);
        setStepY(0);
    }

    @Override
    public void move() {
        // se devo andare a destra
        if (getTargetX() > getX()) {
        // mi muovo a destra di 1
            setStepX(1);
        } 
        //altrimenti vado a sinistra
        else {
            setStepX(-1);
        }
        //eseguo il movimento
        setX(getX() + getStepX());
    }

    @Override
    public void raggiuntoTarget() {

        if (getX() == NewJFrameSpaceInvaders.SPACESHIP_XMAX) {
            //abilito bottone sx
            
        }
        if (getX() != NewJFrameSpaceInvaders.SPACESHIP_XMAX){
            //abilito bottone dx
        }
        if (getX() == NewJFrameSpaceInvaders.SPACESHIP_XMIN) {
            //disiabilito bottone sx
        }
        if (getX() != NewJFrameSpaceInvaders.SPACESHIP_XMIN){
            //abilito bottone sx
        }
        else {
          //lascio bottoni attivi
        }
        //esegue il movimento
        setStepX(-getStepX());
       }
    

}
