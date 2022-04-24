package racingcar.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ValidationUtils extends IllegalArgumentException{

    /**
     * 입력받은 자동차 이름 String에 대한 체크 (1번 기능에 대한 밸리데이션)
     * @param userInput : 쉼표로 구분된 자동차 이름 값
     * @return T/F
     */
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
        return Collections.addAll(nameList, name.split(","));
    }

    private void validNameValue(List<String> nameList){
        if(nameList.size() == 0){
            throw new IllegalArgumentException("[ERROR] 이름을 정확히 입력해주세요.");
        }
    }

    private void validNameLength(List<String> nameList) {
        if (nameList.stream().anyMatch(name -> name.length() == 0))
            throw new IllegalArgumentException("[ERROR] 입력된 이름이 없습니다.");
        else if (nameList.stream().anyMatch(name ->  name.length() > 5))
            throw new IllegalArgumentException("[ERROR] 이름이 5글자를 초과합니다.");
    }


    private void validNameDuplicate(List<String> nameList) {
        HashSet<String> hs = new HashSet<>();
        nameList.stream().filter(
                name -> !hs.add(name.toUpperCase())
                )
                .forEach(name -> {
                    throw new IllegalArgumentException("[ERROR] 중복된 이름이 입력되었습니다.");
                });
    }


    /**
     * 입력받은 게임 반복 횟수 String에 대한 체크 (2번 기능에 대한 밸리데이션)
     * @param repeatCnt : 사용자가 입력한 게임 반복 횟수
     * @return T/F
     * @throws IllegalArgumentException : 입력 값 오류 시 IllegalArgumentException 발생
     */
    public static boolean validRepeat(String repeatCnt) throws IllegalArgumentException {
        try {
            return (!repeatCnt.isEmpty() && !(Integer.parseInt(repeatCnt) < 1));
        } catch(IllegalArgumentException e) {
            System.out.println("[ERROR] " + "반복횟수를 잘못 입력하였습니다.");
            return false;
        }
    }
}
