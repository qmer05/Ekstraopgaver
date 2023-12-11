package _2tjek_passwords;

public class PasswordValidator {
    private int minLength;
    private int maxLength;
    private boolean numbersRequired;
    private boolean isUppercase;
    private boolean isLowercase;

    public PasswordValidator(int minLength, int maxLength, boolean numbersRequired, boolean isUppercase, boolean isLowercase){
     this.minLength = minLength;
     this.maxLength = maxLength;
     this.numbersRequired = numbersRequired;
     this.isUppercase = isUppercase;
     this.isLowercase = isLowercase;
    }

    public boolean isValid(String password){

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                numbersRequired = true;
                break;
            } else {
                numbersRequired = false;
            }
        }

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                isUppercase = true;
                break;
            } else {
                isUppercase = false;
            }
        }

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                isLowercase = true;
                break;
            } else {
                isLowercase = false;
            }
        }

        if (password.length() > minLength && password.length() < maxLength && numbersRequired && isUppercase && isLowercase){
            return true;
        }
        return false;
    }
}
