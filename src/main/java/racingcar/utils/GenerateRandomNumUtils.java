package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class GenerateRandomNumUtils {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 9;

    public int generateRandomNum(){
        return Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
    }
}
