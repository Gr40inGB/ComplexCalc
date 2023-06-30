package model;

import model.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator implements CalculatorFunctions {

    private Double leftReal;
    private Double rightReal;
    private Double leftNumberImaginary;
    private Double rightNumberImaginary;

    private CalcOperation calcOperation;

    private String result;

    Map<String, CalcOperation> operationMap = new HashMap<>();

    public Calculator() {
//        this.calcOperation = new Addition();
        this.operationMap.put("+", new Addition());
        this.operationMap.put("-", new Subtraction());
        this.operationMap.put("*", new Multiplication());
        this.operationMap.put("/", new Division());
    }

    @Override
    public void setLeftReal(Double leftReal) {
        this.leftReal = leftReal;
    }


    @Override
    public void setLeftImaginary(Double leftImaginary) {
        this.leftNumberImaginary = leftImaginary;
    }

    @Override
    public void setRightReal(Double rightReal) {
        this.rightReal = rightReal;
    }

    @Override
    public void setRightImaginary(Double rightImaginary) {
        this.rightNumberImaginary = rightImaginary;
    }

    @Override
    public void setOperation(String s) {
        this.calcOperation = this.operationMap.get(s);
    }

    @Override
    public boolean calculateResultOk() {
        this.result = calcOperation.calculate(leftReal, leftNumberImaginary, rightReal, rightNumberImaginary);
//        System.out.println(result);
        return !result.isEmpty();
    }

    @Override
    public String getResult() {
        return this.result;
    }

    @Override
    public String getResult(Double left, Double leftImaginary, String operation, Double right, Double rightImaginary) {
        setLeftReal(left);
        setLeftImaginary(leftImaginary);
        setOperation(operation);
        setRightReal(right);
        setRightImaginary(rightImaginary);
        return getResult();
    }
}

