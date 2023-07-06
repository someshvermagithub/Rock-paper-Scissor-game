import java.util.Random;
import java.util.Scanner;



public class Rock_paper_Scissor_Game {

    public static void main(String[] args) {
        System.out.println("0>Rock\n1>Paper\n2>Scissor");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int user = sc.nextInt(3);
        Random r = new Random();
        int computer = r.nextInt(3);


        if (computer == user) {
            System.out.println("Draw");

        } else if (user == 0 && computer == 2 || user == 2 && computer == 1 || user == 1 && computer == 0) {
            System.out.println("You Win");
        } else {
            System.out.println("Computer Win");
        }

        System.out.println("Computer input:" + computer);
        System.out.print("Computer Selected:");
        if (computer == 0) {
            System.out.print("Rock");
        }
        else if(computer == 1){
            System.out.print("Paper");
        }
else{
            System.out.print("Scissor");
        }
        System.out.print("\nYou Selected:");
        if (user == 0) {
            System.out.print("Rock");
        }
        else if(user == 1){
            System.out.print("Paper");
        }
        else{
            System.out.print("Scissor");
        }

    }
}