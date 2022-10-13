import java.util.Scanner;

public class CaesarCipher
{
    public static void main(String args[])
    {
        //loop through menu until quit selected
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n-----------Caesars Cipher-----------");
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Encrypt Text");
            System.out.println("2. Decrypt Text");
            System.out.println("3. Find Key");
            System.out.println("4. Quit");

            int input = scan.nextInt();

            if (input == 1)
            {
                System.out.println("You have entered Encrypt!");
            }
            else if (input == 2)
            {
                System.out.println("You have entered Decrypt!");
            }
            else if (input == 3)
            {
                System.out.println("You have entered Find Key!");
            }
            else if(input == 4)
            {
                System.out.println("Goodbye!");
                break;
            }
            else
            {
                System.out.println("Please enter a valid choice");
            }
        }//end while 
    }//end main
}//end CaesarCipher