/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

/**
 *
 * @author Nicolo
 */
public class Corridori implements Runnable {

    private Thread thr;

    public Corridori(String str) {
        thr = new Thread(this, str);
        thr.start();
    }

    public void run() {
        
        for (int i = 0; i < 100; i++) {
            
            System.out.println(i + " " + thr.getName());
            try {
                
                Thread.sleep((long) (Math.random() * 1000));
                
            } catch (InterruptedException e) {
            }
        }
        System.out.println(" ARRIVATO ! " + thr.getName());
    }

}
