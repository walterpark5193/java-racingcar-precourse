package racingcar.utils;

import java.io.Serializable;

public enum ValidCommonConditionEnum {
    DELIMITER(","),
    REGEX_NUM("[0-9]+"),
    RESULT_MSG("실행결과"),
    RESULT_PREFIX(" : "),
    SCORE_VALUE("-"),
    WINNER_MSG("최종 우승자 : ");

    private final String value;

    ValidCommonConditionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
