package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarInfoVo {
    private List<String> nameList;
    private int forwardCount;

    public CarInfoVo(){
        this.nameList = new ArrayList<>();
        this.forwardCount = 0;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }
}
