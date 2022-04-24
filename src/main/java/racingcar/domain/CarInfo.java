package racingcar.domain;

import racingcar.utils.GenerateRandomNumUtils;

public class CarInfo {
    public static final int MIN_VALUE = 0;
    public static final int MOVING_FORWARD = 4;
    private String name;
    private int forwardCount;

    public CarInfo(String carName){
        this.name = carName;
        this.forwardCount = MIN_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public void moveForward(){
        if (isForward()) {
            this.setForwardCount(this.getForwardCount()+1);
        }
    }

    private boolean isForward() {
        return generateRandomForwardNum() >= MOVING_FORWARD;
    }

    private int generateRandomForwardNum() {
        return new GenerateRandomNumUtils().generateRandomNum();
    }

}
