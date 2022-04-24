package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class ManageCar {
    private List<CarInfo> carInfoList = new ArrayList<>();
    private int playRepeatCnt;


    public ManageCar(String userInputCarNames, String repeatCnt) {
        createCar(userInputCarNames);
        this.playRepeatCnt = Integer.parseInt(repeatCnt);
    }

    private void createCar(String userInputCarNames) {
        //1. 자동차 입력받는 기능 구현 완료
        //Validation 완료 후 실제 자동차 객체 생성
        for (String name : userInputCarNames.split(",")) {
            this.carInfoList.add(new CarInfo(name));
        }
    }

    public void setCarInfoList(List<CarInfo> carInfoList) {
        this.carInfoList = carInfoList;
    }

    public void playGame() {
        System.out.println("playRepeatCnt = " + playRepeatCnt);
        IntStream.range(0, playRepeatCnt).forEach(
                this::accept
        );
        //6. 우승자 판별 로직(가장 높은 전진cnt)
        //7. 인덱스 위치의 자동차 이름 반환하는 로직
        //8. 우승자 출력하는 로직

    }

    private void carMoveForward() {
        //0~9사이의 랜덤 숫자 생성하는 로직
        //4이상일 시 전진대상으로 판단하는 로직
        //콜렉션 개체의 전진카운트 증가시키는 로직
        IntStream.range(0, carInfoList.size()).forEach(
                i -> carInfoList.get(i).moveForward()
        );
    }

    private void printCurrentResultMsg() {
        OutputView.printCurrentResultMsg();
    }

    private void printCurrentPoint() {
        //5. 현재 누적된 경주 결과 출력하는 로직
        carInfoList.stream().map(this::getCurrentPoint).forEach(OutputView::printCurrentPoint);
    }

    private String getCurrentPoint(CarInfo carInfo) {
        StringBuilder msg = new StringBuilder(carInfo.getName() + " : ");
        for (int j = 0; j < carInfo.getForwardCount(); j++) {
            msg.append("-");
        }
        return msg.toString();
    }


    private void accept(int i) {
        //3. 전진/멈춤 조건 판별하는 기능
        //4. 전진 횟수 누적하는 기능
        carMoveForward();

        //5. 현재 누적된 경주 결과 출력하는 로직
        printCurrentResultMsg();
        printCurrentPoint();
    }
}
