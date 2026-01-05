package GeneratePassword;

import java.security.SecureRandom;

public class Password{
    private static final String CHARS = "abcdefghijklmnopqrstuvyxwzABCDEFGHIJKLMNOPQRSTUVYXWZ0123456789()<>[]{}!@#$%&*";

    public static String generatePassword(int length){
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++){
            int index = secureRandom.nextInt(CHARS.length());
            password.append(CHARS.charAt(index));
        }

        return password.toString();
    }
}