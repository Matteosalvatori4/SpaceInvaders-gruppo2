/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Point;
import javax.swing.JButton;

/**
 *
 * @author francesco
 */
public class ElementiDiGioco {
    
    private double x, y;
    private double targetX, targetY;
    private double stepX, stepY;
    private JButton button;

    protected ElementiDiGioco() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        // aggiorna anche la X del pulsante
        Point p = button.getLocation();
        p.setLocation(x, p.getY());
        button.setLocation(p);
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        // aggiorna anche la Y del pulsante
        Point p = button.getLocation();
        p.setLocation(p.getX(), y);
        button.setLocation(p);
        this.y = y;
    }

    public double getTargetX() {
        return targetX;
    }

    public void setTargetX(double targetX) {
        this.targetX = targetX;
    }

    public double getTargetY() {
        return targetY;
    }

    public void setTargetY(double targetY) {
        this.targetY = targetY;
    }

    public double getStepX() {
        return stepX;
    }

    public void setStepX(double stepX) {
        this.stepX = stepX;
    }

    public double getStepY() {
        return stepY;
    }

    public void setStepY(double stepY) {
        this.stepY = stepY;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
     public boolean hasToMove() {
        // se non sono sulle coordinate target mi devo muovere
        boolean htm = ((x != targetX) || (y != targetY));
        System.out.println(this + "HasToMove = " + htm);
        return htm;
    }

    public void move() {
        // mi muovo ...
        setX(getX() + getStepX());
        setY(getY() + getStepY());
    }
}
