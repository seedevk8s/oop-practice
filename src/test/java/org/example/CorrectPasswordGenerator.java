package org.example;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "abcdefgh";              // 8κΈμ μμ±
    }
}
