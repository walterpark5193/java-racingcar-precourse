package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getCarsNameInput() {
        System.out.println("경주할 자동차 이름 (이름은쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public static String getPlayRepeatnput() {
        System.out.println("시도할 횟수");
        return Console.readLine();
    }
}
