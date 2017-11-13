package passwordverifier;
import javax.swing.JOptionPane;

public class PasswordVerifier {

    public static void main(String[] args) {
        //Created variable for JOptionPane
        String input;
       
       input = JOptionPane.showInputDialog("What do you want " 
                                         + "to use as your new passowrd");
       
       //Called on my isValid Method. Tested the Password.
       if (isValid(input)) {
           JOptionPane.showMessageDialog(null, "That is a valid password");
           System.out.println("Your new password is: " + input);
       }
       else {
           JOptionPane.showMessageDialog(null, "That is not the proper format "
                                        + "of a password.\nMake sure it has "
                                        + "contains the following:" 
                                        + "\n     Uppercase" 
                                        + "\n     Lowercase"
                                        + "\n     Number" 
                                        + "\n     " 
                                        + "At least 6 characters long");
       }
       
       System.exit(0);
       
    }
    
    //Private method for testing password
    private static boolean isValid (String password) {
        //List of variables for testing
        boolean isLength = false;
        boolean isUppercase = false;
        boolean isLowercase = false;
        boolean isDigit = false;
        boolean valid = false;
        char ch = 0;
        
        //Tested the length of password
        if (password.length() >= 6) 
            isLength = true;
         //System.out.println(isLength); For debugging purposes
        
        //Tested each character for character until uppercase is found
         while (isLength && !isUppercase && ch <= password.length()) {
        
        if (Character.isUpperCase(password.charAt(ch))) 
            isUppercase = true;
        
        ch++;
        }
        
        //System.out.println(isUppercase); For debugging purposes
        
        ch = 0; //Reseted character value
        //Tested each character for character until lowercase is found
        while (isLength && !isLowercase && ch <= password.length()) {
        
        if (Character.isLowerCase(password.charAt(ch))) 
            isLowercase = true;
        
        ch++;
        }
        
        //System.out.println(isLowercase); For debugging purposes
        
        ch = 0; //Reseted character value
        //Tested each character for character until number is found
        while (isLength && !isDigit && ch <= password.length()) {
        
        if (Character.isDigit(password.charAt(ch))) 
            isDigit = true;
        
        ch++;
        }
        
        //System.out.println(isDigit); For debugging purposes
        
        //Return true if pass all the requirements
        if (isLength && isUppercase && isLowercase && isDigit)
            valid = true;
        
                
        return valid;
    }
    
}
