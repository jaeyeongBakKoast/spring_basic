package chapter03.use;

import chapter03.used.SubCalc;
import chapter03.used.Calculator;

/*
* 인터페이스 의존 확인
*/
public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        Integer result = calculator.calc(10, 5);
        System.out.println("계산 결과는 (" + result + ")입니다.");
    }
}
