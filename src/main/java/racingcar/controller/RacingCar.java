package racingcar.controller;

import racingcar.utils.ValidationUtils;
import racingcar.domain.ManageCar;
import racingcar.view.InputView;

public class RacingCar {

    String userInputCarNames;
    String playRepeatCount;

    public void startGame(){
        initGameInfo();
        makeCarInfoList();
    }

    private void initGameInfo() {
        do {
            this.userInputCarNames = readCarsName();
        } while (new ValidationUtils().validName(userInputCarNames));

        do {
            playRepeatCount = readRepeatCount();
        } while (ValidationUtils.validRepeat(playRepeatCount));
    }

    public void makeCarInfoList() {
        new ManageCar(userInputCarNames, playRepeatCount);
    }

    private String readCarsName() {
        return InputView.getCarsNameInput();
    }

    private String readRepeatCount() {
        return InputView.getPlayRepeatnput();
    }

}
