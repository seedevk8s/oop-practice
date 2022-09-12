package org.example02;

import org.example.PasswordGeneratePolicy;

public class WrongFixedPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "ab";              // 8글자 생성
    }
}
