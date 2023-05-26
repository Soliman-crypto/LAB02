//TASK 2

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String password = generatePassword(8);
        System.out.println("Your password is: " + password);
    }

    public static String generatePassword(int length) {
        try {
            if (length <= 0) {
                throw new IllegalArgumentException("Password length must be a positive number");
            }

            char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=".toCharArray();
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                char c = chars[random.nextInt(chars.length)];
                sb.append(c);
            }

            return sb.toString();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return "";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "";
        }
    }
}