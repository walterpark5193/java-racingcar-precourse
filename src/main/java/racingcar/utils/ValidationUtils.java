package racingcar.utils;

import racingcar.view.ErrorMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ValidationUtils extends IllegalArgumentException{

    public static final String DELIMITER = ",";
    public static final String NAME_TYPE_ERR_MSG = "이름을 정확히 입력해주세요.";
    public static final String OVER_MAX_LENGTH_MSG = "이름이 5글자를 초과합니다.";
    public static final String NO_NAME_MSG = "입력된 이름이 없습니다.";
    public static final String NAME_DUP_MSG = "중복된 이름이 입력되었습니다.";
    public static final String REPEAT_COUNT_ERR_MSG = "반복횟수를 잘못 입력하였습니다.";

    public boolean validName(String userInput) {
        List<String> nameList = new ArrayList<>();

        //입력받은 이름 리스트 분리
        splitNameList(userInput, nameList);

        try{
            //이름 입력 값 체크 (아무것도 입력되지 않았거나 쉼표만 입력된 경우)
            validNameValue(nameList);

            //이름 길이 체크 (이름값이 입력되지 않았거나 5자리 초과한 경우 에러)
            validNameLength(nameList);

            //중복값이 입력된 경우 체크
            validNameDuplicate(nameList);
        } catch(IllegalArgumentException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    private boolean splitNameList(String name, List<String> nameList) {
        return Collections.addAll(nameList, name.split(DELIMITER));
    }

    private void validNameValue(List<String> nameList){
        ErrorMessage.checkError(nameList.size() == 0, NAME_TYPE_ERR_MSG);
    }

    private void validNameLength(List<String> nameList) {
        for (String name : nameList) {
            validNameZeroValue(name);
            validNameMaxLength(name);
        }
    }

    private void validNameMaxLength(String name) {
        ErrorMessage.checkError(name.length() > 5, OVER_MAX_LENGTH_MSG);
    }

    private void validNameZeroValue(String name) {
        ErrorMessage.checkError(name.length() == 0, NO_NAME_MSG);
    }


    private void validNameDuplicate(List<String> nameList) {
        HashSet<String> hs = new HashSet<>();
        for (String name : nameList) {
            ErrorMessage.checkError(!hs.add(name.toUpperCase()), NAME_DUP_MSG);
        }
    }

   public boolean validRepeat(String repeatCnt) throws IllegalArgumentException {
        try {
            ErrorMessage.checkError(!(!repeatCnt.isEmpty() && !(Integer.parseInt(repeatCnt) < 1)), REPEAT_COUNT_ERR_MSG);
        } catch(IllegalArgumentException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }
}
