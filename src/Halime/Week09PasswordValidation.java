package Halime;

public class Week09PasswordValidation {

    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static void main(String[] args) {


        String password = "gss";


        if (isPasswordValidation(password)) {
            System.out.println("your passwrod valid");
        } else {
            System.out.println("your password invalid");

        }


    }

    public static boolean isPasswordValidation(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            System.out.println("Your password must be at least 6 characters and must not contain spaces");
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Your password must contain at least one uppercase letter");
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("Your password must contain at least one lowercase letter");
            return false;
        }

        if (!password.matches(".*[0-9].*")) {
            System.out.println("Your password must contain at least one digit");
            return false;
        }

        if (password.matches("[A-Za-z0-9]*")) {
            System.out.println("Your password must contain at least one special character");
            return false;
        }

        return true;
    }
}



