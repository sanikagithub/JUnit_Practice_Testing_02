package AppTest;
import java.util.Scanner;

public class Boilingwater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());  
        System.out.println(checkWaterTemp(numOne));
    }
    public static String checkWaterTemp(int numOne){
        if (numOne>212){
                return "Water is boiling";
             } else{
                return "Water is not boiling";
                   }
}
}