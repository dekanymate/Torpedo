package torpedo;

import java.util.Scanner;

public class Torpedo {

    public static void main(String[] args) {
        int random = Math.random();
        Hajo hajo = new Hajo(new int[]{1,3,4});
        System.out.println("Torpedó játék");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lövés helye: ");
        int loves = sc.nextInt();
        int lovesekSzama = 0, talalatokSzama = 0;
        for (int i = 0; i < Hajo.pozicio.length; i++) {
            if(loves==Hajo.pozicio[i]){
                System.out.println("Talált!");
                lovesekSzama++;
                talalatokSzama++;
            }else{
                System.out.println("Nem talált!");
                lovesekSzama++;
            }
            
        }
    }
    
}
