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
public class RocketThread implements Runnable{
    Rocket rocket;

    public RocketThread(Rocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public void run() {
        if(rocket.hasToMove()){
        rocket.move();}
        else{
        rocket.raggiuntoTarget();}
         if(rocket.hasToMove()){
        rocket.move();}
        
    }

    
}
