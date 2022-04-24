package racingcar.view;

import racingcar.domain.CarInfo;

import java.util.List;

public class OutputView {

    public static final String WINNER_MSG = "최종 우승자 : ";
    public static final String RESULT_MSG = "실행결과";
    public static final String SCORE_VALUE = "-";
    public static final String DELIMITER = ", ";
    public static final String RESULT_PREFIX = " : ";

    public static void printCurrentPoint(CarInfo carInfo) {
        StringBuilder currentPoint = new StringBuilder(carInfo.getName() + RESULT_PREFIX);
        for (int j = 0; j < carInfo.getForwardCount(); j++) {
            currentPoint.append(SCORE_VALUE);
        }
        System.out.println(currentPoint.toString());
    }

    public static void printCurrentResultMsg() {
        System.out.println(RESULT_MSG);
    }

    public static void printWinnerMsg(List<String> winnerList) {
        System.out.println(WINNER_MSG + String.join(DELIMITER, winnerList));
    }

}
