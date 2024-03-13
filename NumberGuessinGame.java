import java.util.Random;
import java.util.Scanner;

public class NumberGuessinGame {
    public static void playGame(){
        System.out.println("1.Choose the number between 1 to 100:");
        System.out.println("2.Guess the number within 5 tries:");

        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        int target =random.nextInt(100)+1;
        int ans=0;
        for(int i=0;i<5;i++){
            int x=sc.nextInt();
            if(x==target){
                System.out.println("congratulations! you guessed the right number");
                ans++;
                
                System.out.println("Attempt made: "+ans);
                break;
            }
            else if(x<target){
                System.out.println("the number you entered is smaller than correct number");
            }
            else{
                System.out.println("the number you entered is greater than the correct number");
            }
        System.out.println("tries left :"+(4-i));
    }
           
        }
    public static void main(String[]args){
         playGame(); 
         Scanner sc =new Scanner(System.in); 
         
         System.out.println("press 1 if you wanted to play again:");
         System.out.println("press 2 to exit:");
         int num=sc.nextInt();
         switch(num){
            case 1:
            playGame();
            break;
            case 2:System.out.println("Thank you for playing!");
            break;
            default:System.out.println("invalid choice.Exiting the game");
            break;
         }
    }
}
