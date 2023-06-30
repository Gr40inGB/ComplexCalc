package model.operations;

public class Division extends CalcOperation {
    @Override
    public String calculate(Double left, Double leftImaginary, Double right, Double rightImaginary) {
        if (right == 0 || rightImaginary == 0) {
            return "Error division by Zero! ";
        }
        sb.append(df.format(left / right));
        if (leftImaginary / rightImaginary > 0) {
            sb.append(" + ");
        }
        sb.append(df.format(leftImaginary / rightImaginary)).append("i");
        return sb.toString();
    }
}
