package org.example;

public class WrongFixedPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "ab";              // 8κΈμ μμ±
    }
}
