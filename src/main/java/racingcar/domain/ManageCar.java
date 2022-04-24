package racingcar.domain;

import java.util.List;

public class ManageCar {
    private List<CarInfo> carInfoList;
    private int playRepeatCnt;


    public ManageCar(String userInputCarNames, String repeatCnt) {
        createCar(userInputCarNames);
        playRepeatCnt = Integer.parseInt(repeatCnt);
    }

    private void createCar(String userInputCarNames) {
        //1. 자동차 입력받는 기능 구현 완료
        //Validation 완료 후 실제 자동차 객체 생성
        for (String name : userInputCarNames.split(",")) {
            this.carInfoList.add(new CarInfo(name));
        }
    }

    public List<CarInfo> getCarInfoList() {
        return carInfoList;
    }

    public void setCarInfoList(List<CarInfo> carInfoList) {
        this.carInfoList = carInfoList;
    }
}
