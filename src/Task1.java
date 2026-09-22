import java.util.Scanner;

class Task1{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userPrice;
        double shipping;

        System.out.println("Input the cost of your item.");


        if (scan.hasNextDouble()) {
            userPrice = scan.nextDouble();
            if (userPrice < 100 && userPrice > 0){
                shipping = userPrice * 0.02;
                System.out.println("Your shipping is $" + shipping + " and your total price is $" + (shipping + userPrice));
            } else if(userPrice >= 100){
                shipping = 0;
                System.out.println("Your shipping is free and your total price is $" + userPrice + ".");
            } else {
                System.out.println("You must enter a value greater than 0.");
            }
        } else{
            System.out.println("You entered an invalid input.");
        }
    }
}
