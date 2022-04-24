package racingcar.domain;

import racingcar.utils.GenerateRandomNumUtils;

public class CarInfo {
    private String name;
    private int forwardCount;

    public static final int MOVING_FORWARD = 4;

    public CarInfo(String carName){
        this.name = carName;
        this.forwardCount = 0;
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
        int b = generateRandomForwardNum();
        System.out.println("gen random num = "+b);
        return b >= MOVING_FORWARD;
    }

    private int generateRandomForwardNum() {
        return new GenerateRandomNumUtils().generateRandomNum();
    }

}
