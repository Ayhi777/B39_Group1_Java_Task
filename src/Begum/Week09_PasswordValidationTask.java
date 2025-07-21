package Begum;

public class Week09_PasswordValidationTask {
    /*
    String -- Password Validation Task
1.Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2.PassWord should at least contain one upper case letter
3.PassWord should at least contain one lowercase letter
4.Password should at least contain one special characters
5.Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static void main(String[] args) {
        String password = "Test123.";
        if (isValid(password)) {
            System.out.println("your password valid");
        } else {
            System.out.println("your password invalid");

        }
    }


    public static boolean isValid(String password) {
        if ((password.length() < 6) || (password.contains(" "))) {
            System.out.println("your password should contain upper case letter");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("your password should contain upper case letter");
            return false;

        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("your password should contain lower case letter");
            return false;

        }
        if (!password.matches("[^A-Za-z0-9_]")) {
            System.out.println("your password should contain special character");
            return false;

        }
        if (!password.matches(".*[0-9].*")) {
            System.out.println("your password should contain digit");
            return false;


        }
        return true;

    }
}
