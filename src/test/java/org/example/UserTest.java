package org.example;
/*
    BDD
    • Behavior Driven Development (행위 주도 개발)
    • 행위에 대한 테스트 코드를 작성하는 개발 방법
    • 유저 시나리오 동작을 검증 (시나리오 단위)
    • 하나의 시나리오는 Given, When, Then 구조를 가짐
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        //user.initPassword(new RandomPasswordGenerator());           // 이렇게 되는 경우 랜덤하게 패스워드가 생성됨 => 그결과가 적합 혹은 부적합 할수 있음
        user.initPassword(new CorrectPasswordGenerator());            // 패스워드가 항상 8자리이므로 진행될것임.

        // then
        assertThat(user.getPassword()).isNotNull();
    }
}