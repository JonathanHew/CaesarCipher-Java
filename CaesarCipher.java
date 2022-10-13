import java.util.Scanner;

public class CaesarCipher {
    public static void main(String args[]) {
        // loop through menu until quit selected
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\n-----------Caesars Cipher-----------");
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Encrypt Text");
            System.out.println("2. Decrypt Text");
            System.out.println("3. Find Key");
            System.out.println("4. Quit");

            int input = scan.nextInt();

            if (input == 1) {
                Encrypt();
            } else if (input == 2) {
                System.out.println("You have entered Decrypt!");
            } else if (input == 3) {
                System.out.println("You have entered Find Key!");
            } else if (input == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please enter a valid choice");
            }
        } // end while
    }// end main
    

    public static void Encrypt()
    {
        Scanner scan = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String answer = "";

        System.out.println("You have entered Encrypt!");
        System.out.println("Enter plaintext to be encrypted:");
        String plaintext = scan.nextLine();

        System.out.println("Enter the the key which will be used to encrypt:");
        int key = scan.nextInt();

        //looping through each letter in plaintext
        for(int i=0;i<plaintext.length();i++)
        {
            //catpturing the letter at each loop
            char letter = plaintext.charAt(i);
            
            //checking to see if letter is, lowercase or uppercase
            if(letter >= 'a' && letter <= 'z')
            {
                //looping through each letter in the alphabet
                for(int j=0;j<alphabet.length();j++)
                {
                    //when specfific letter is found
                    if(alphabet.charAt(j) == letter)
                    {
                        //record the index and add on the key to find the index of the new encrypted letter
                        int newIndex = j + key;
                        
                        //if new index is greatder then 25 get the modulo 
                        if(newIndex > 25)
                        {
                            newIndex = newIndex % 26;
                        }//end if
                        
                        //add the new encrypted letter to the answer string
                        answer = answer + String.valueOf(alphabet.charAt(newIndex));
                    }//end if
                }//end inner for
            }//end if
            //same as above but for capital letters
            else if(letter >= 'A' && letter <= 'Z')
            {
                for(int j=0;j<ALPHABET.length();j++)
                {
                    if(ALPHABET.charAt(j) == letter)
                    {
                        int newIndex = j + key;
                        
                        if(newIndex > 25)
                        {
                            newIndex = newIndex % 26;
                        }//end if
                        
                        answer = answer + String.valueOf(ALPHABET.charAt(newIndex));
                    }//end if
                }//enmd for
            }//end else if
            //if letter is neither uppercase or lowercase, its not alphabetic, this does not change
            else 
            {
                answer = answer + String.valueOf(letter);
            }//end else
        }//end for

        System.out.println(plaintext + " encrypted using key of " + key + " = " + answer);
        
    }//end Encrypt()
}// end CaesarCipher