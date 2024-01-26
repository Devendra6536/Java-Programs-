package max;

import java.util.Random;
import java.util.Scanner;
 class LudoSimulator extends Thread{
     public static int  randomNum(){
         Random ran_num = new Random();
         int num = ran_num.nextInt(7);
         return num;
     }
    public void run(){
        try{
            String s ="Y";
            while(s.equalsIgnoreCase("y")) {

                int choice = randomNum();
                Thread.sleep(1000);
                System.out.println("....");
                Thread.sleep(1000);
                System.out.println("....");
                Thread.sleep(1000);
                if(choice == 1) {
                    System.out.println("-----");
                    System.out.println("     ");
                    System.out.println("  O  ");
                    System.out.println("     ");
                    System.out.println("-----");
                }
                else if(choice == 2) {
                    System.out.println("-----");
                    System.out.println(" O   ");

                    System.out.println("    O ");
//				System.out.println("      ");
                    System.out.println("-----");
                }
                else if(choice==3) {
                    System.out.println("-----");
                    System.out.println("      ");
                    System.out.println("O O O");
                    System.out.println("     ");
                    System.out.println("-----");
                }
                else if(choice==4) {
                    System.out.println("------- ");
                    System.out.println(" O   O ");
                    System.out.println("      ");
                    System.out.println(" O   O ");
                    System.out.println(" -------");
                }
                else if(choice==5) {
                    System.out.println(" -------- ");
                    System.out.println(" O     O");
                    System.out.println("    O  ");
                    System.out.println(" O     O ");
                    System.out.println(" -------- ");
                }
                else if(choice==6) {
                    System.out.println("------");
                    System.out.println(" O O O ");
                    System.out.println("      ");
                    System.out.println(" O O O");
                    System.out.println(" -----");
                }

                System.out.println("Press Y for yes and E for exit");
                Scanner sc = new Scanner(System.in);
                s = sc.nextLine();
            }
            return;
//            System.out.println();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

     public static void main(String[] args) {
         LudoSimulator l = new LudoSimulator();
         l.start();
     }

}

