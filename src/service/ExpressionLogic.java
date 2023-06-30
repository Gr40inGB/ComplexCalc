package service;

import model.Calculator;

public class ExpressionLogic implements ExpressionInterface {

    Calculator calculator = new Calculator();

    @Override
    public String getResult(String expression) {
        return calculator.getResult(3.0, 23.5, "+", -21.0, 234.0);
    }


}
