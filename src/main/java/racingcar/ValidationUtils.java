package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidationUtils {
    public static boolean validName(String name) {
        List<String> nameList = new ArrayList<>();

        //입력받은 이름 리스트 분리
        Collections.addAll(nameList, name.split(","));

        //이름 입력 값 체크 (아무것도 입력되지 않았거나 쉼표만 입력된 경우)
        return nameList.size() != 0 && nameList.stream().noneMatch(s -> s.length() == 0 || s.length() > 5);
        //이름 길이 체크 (이름값이 입력되지 않았거나 5자리 초과한 경우 에러)
    }
}
