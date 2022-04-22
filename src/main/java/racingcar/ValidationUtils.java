package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidationUtils extends IllegalArgumentException{
    public boolean validName(String userInput) {
        List<String> nameList = new ArrayList<>();

        //입력받은 이름 리스트 분리
        splitNameList(userInput, nameList);
        System.out.println("userInput = "+userInput);
        try{
            //이름 입력 값 체크 (아무것도 입력되지 않았거나 쉼표만 입력된 경우)
            validNameValue(nameList);

            //이름 길이 체크 (이름값이 입력되지 않았거나 5자리 초과한 경우 에러)
            validNameLength(nameList);
        } catch(IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getClass().getName());
            //throw new IllegalArgumentException();   //에러 대신 다시 입력받도록 해야함
            return false;
        }
        return true;
    }

    private boolean splitNameList(String name, List<String> nameList) {
        return Collections.addAll(nameList, name.split(","));
    }

    private void validNameValue(List<String> nameList){
        if(nameList.size() == 0){
            throw new IllegalArgumentException();
        }
    }

    private void validNameLength(List<String> nameList) {
        if (nameList.stream().anyMatch(s -> s.length() == 0 || s.length() > 5))
            throw new IllegalArgumentException();
    }

    public static boolean validRepeat(String repeatCnt) throws IllegalArgumentException {
        try {
            return (!repeatCnt.isEmpty() && !(Integer.parseInt(repeatCnt) < 1));
        } catch(IllegalArgumentException e) {
            System.out.println("[ERROR] " + e.getClass().getName());
            return false;
        }
    }
}
