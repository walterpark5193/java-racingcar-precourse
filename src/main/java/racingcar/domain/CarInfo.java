package racingcar.domain;

public class CarInfo {
    private String name;
    private int forwardCount;

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
}
