package racingcar.controller;

import racingcar.utils.ValidationUtils;
import racingcar.domain.ManageCar;
import racingcar.view.InputView;

public class RacingCar {

    private ManageCar manageCar;
    private String userInputCarNames;
    private String playRepeatCount;

    public void startGame(){
        initGameInfo();
        makeCarInfoList();
        playRacingGame();
    }

    private void initGameInfo() {
        do {
            this.userInputCarNames = InputView.getCarsNameInput();
        } while (!new ValidationUtils().validName(userInputCarNames));

        do {
            playRepeatCount = InputView.getPlayRepeatInput();
        } while (!ValidationUtils.validRepeat(playRepeatCount));
    }

    public void makeCarInfoList() {
        manageCar = new ManageCar(userInputCarNames, playRepeatCount);
    }

    private void playRacingGame() {
        manageCar.playGame();
    }

}
