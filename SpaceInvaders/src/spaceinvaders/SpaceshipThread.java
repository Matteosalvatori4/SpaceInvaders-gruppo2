/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author matte
 */
public class SpaceshipThread implements Runnable {

    private Spaceship spaceship;

    public SpaceshipThread(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    @Override
    public void run() {
        while (true) {
            if (spaceship.hasToMove()) {
                spaceship.move();
            } else {
                spaceship.raggiuntoTarget();
            }
            if (spaceship.hasToMove()) {
                spaceship.move();
            }
        }
    }

}
