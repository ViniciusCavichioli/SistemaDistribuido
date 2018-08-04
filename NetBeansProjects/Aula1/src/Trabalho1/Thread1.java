package Trabalho1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 106025010
 */
public class Thread1 extends Thread {
    javax.swing.JLabel lbHora;
        public Thread1(javax.swing.JLabel lbHora)
        {
            this.lbHora = lbHora;
        }

        public void run() 
        {
            for(;;)
            {
               lbHora.setText(Hora.atual());  
                try{
                    Thread1.sleep(500);
                }
                catch(Exception ex) {}
            }
        }
}
