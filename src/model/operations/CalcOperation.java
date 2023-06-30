package model.operations;


import java.text.DecimalFormat;

public abstract class CalcOperation implements OperationsFunction {
    public DecimalFormat df = new DecimalFormat("#.###");
    StringBuilder sb = new StringBuilder();
}
