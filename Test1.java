package test1;

import java.util.Scanner;

class Test1 {

        public static void main(String[] args){
            int eCal, time;
            String Olahraga;

            Scanner scan = new Scanner(System.in);
            System.out.print("Berapa Kalori yang Andi makan : ");
            eCal = scan.nextInt();

            time = eCal/10;

            if (eCal >= 750) {
                    Olahraga = "Lari";
                    System.out.println("Andi Harus Berolahraga " + Olahraga + " selama " + time + " menit");
            }
            
            if (eCal >= 500) {
                    Olahraga = "Badminton";
                    System.out.println("Andi Harus Berolahraga " + Olahraga + " selama " + time + " menit");
            }
               
            if (eCal <= 500) {
                    Olahraga = "Renang";
                    System.out.println("Andi Harus Berolahraga " + Olahraga + " selama " + time + " menit");
            }
            if (eCal <= 0) {
                System.out.println("Anda Bodoh");
            }
        }  
}
 