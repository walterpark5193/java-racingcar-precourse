package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static final String INPUT_CAR_NAME_MSG = "경주할 자동차 이름 (이름은쉼표(,) 기준으로 구분)";
    public static final String INPUT_REPEAT_CNT_MSG = "시도할 횟수";

    public static String getCarsNameInput() {
        System.out.println(INPUT_CAR_NAME_MSG);
        return Console.readLine();
    }

    public static String getPlayRepeatInput() {
        System.out.println(INPUT_REPEAT_CNT_MSG);
        return Console.readLine();
    }
}
