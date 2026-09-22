import java.util.Scanner;

class Task4{
    static void main() {
        Scanner scan = new Scanner(System.in);
        int userAge;

        if (scan.hasNextInt()){
            userAge = scan.nextInt();
            if (userAge >= 21){
                System.out.println("You get a wristband.");
            }
        }else {
            System.out.println("Error: enter valid input type.");
        }
    }
}
