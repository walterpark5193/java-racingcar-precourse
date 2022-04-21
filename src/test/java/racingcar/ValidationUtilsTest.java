package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @Test
    @DisplayName("자동차_입력값_이름_검증")
    void 자동차_입력값_이름_검증(){
        assertThat(ValidationUtils.validName("pobi")).isTrue();
        assertThat(ValidationUtils.validName("pobi,java")).isTrue();
        assertThat(ValidationUtils.validName("pobi,javaji")).isFalse();
        assertThat(ValidationUtils.validName("")).isFalse();
        assertThat(ValidationUtils.validName(",")).isFalse();
        assertThat(ValidationUtils.validName(",,,")).isFalse();
    }

}
