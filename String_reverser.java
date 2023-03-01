/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_reverser_programe;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class String_reverser {
    public static void main(String[] args){
        Main objmain = new Main();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String word = obj1.nextLine();
        System.out.println(Main.reverse(word)); //class calls the reverse method and passes a variable which is word 
    }
    
}

class Main {
  
    
    static String reverse(String s){ //parameter s
        String rev = ""; //Empty string value
        for(int j=s.length(); j>0; --j){ //using a for loop to check for the length of the arguments thst would be passed to the parameter
            //and assigning the value to variable j if the length of the arguments is greater than 0 the length of the arguments is pre decremented by -1 which is negative making it reversed  numbers 
             rev = rev+(s.charAt(j-1)); //the parameter which has a string data type would be returned in a character but in a negative value which is from the back which is -1 which makes it reversed character
        }
    
    return rev; //returning the variable rev which has now gotten a value
    }
}