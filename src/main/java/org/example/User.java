package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGeneratePolicy) {
        //랜덤하게 패스워드가 생성됨 => 그결과가 적합 혹은 부적합 할수 있음
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGeneratePolicy.generatePassword();

        /*
            비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
