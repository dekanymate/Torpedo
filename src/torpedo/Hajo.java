/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torpedo;

/**
 *
 * @author hallgato
 */
public class Hajo {
        private int[] pozicio;
        
        public Hajo(int[] poz) {
            this.pozicio = poz;
        }
        
        public String talalat(int poz){
            // eldöntés tétele
            int i = 0, N = this.pozicio.length;
            while(i<N&&!(pozicio[i] == poz)){
                i++;
            }
            return i < N ? "talált": "mellé";
        }
}
