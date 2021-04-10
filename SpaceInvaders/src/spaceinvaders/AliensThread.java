/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author utente
 */
public class AliensThread implements Runnable {

    List<Alien> listaAlieni = new ArrayList<>();

    public AliensThread(JButton... icone) {
        for (int i = 0; i < icone.length; i++) {
            JButton ico = icone[i];
            Alien a = new Alien(ico, i * 20);
            listaAlieni.add(a);
        }
    }

    @Override
    public void run() {
        while (true) {
            //faccio muovere tutti gli alieni
            listaAlieni.forEach(a -> a.move());
            try {
                //aspetto 20 ms
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(AliensThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
