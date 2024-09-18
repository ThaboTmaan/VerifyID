
package verifyid;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class VerifyID {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String idNo;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter ID number: ");
        idNo = kb.nextLine();
        
        if(idNo.length() !=13) {
            System.out.println("\nInvalid Identity Number!");
        }
     
    }
    
}
