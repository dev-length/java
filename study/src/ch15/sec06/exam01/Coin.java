package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Coin {
    private int value;

//    @AllArgsConstructor
//    위의 @와 같은 기능
//    public Coin(int value) {
//        this.value = value;
//    }
//
//    @Getter
//    위의 @와 같은 기능
//    public int getValue() {
//        return value;
//    }
}
