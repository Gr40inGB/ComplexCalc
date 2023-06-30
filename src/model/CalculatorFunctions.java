package model;

public interface CalculatorFunctions {
    public void setLeftImaginary(Double leftImaginary);

    public void setRightImaginary(Double rightImaginary);

    public void setLeftReal(Double left);

    public void setRightReal(Double right);

    public void setOperation(String s);

    public boolean calculateResultOk();

    public String getResult();

    public String getResult(Double left, Double leftImaginary, String operation, Double right, Double rightImaginary);

}
