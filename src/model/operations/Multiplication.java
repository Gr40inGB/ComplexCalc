package model.operations;

public class Multiplication extends CalcOperation {
    @Override
    public String calculate(Double left, Double leftImaginary, Double right, Double rightImaginary) {
        df.setDecimalSeparatorAlwaysShown(false);
        sb.append(df.format(left * right));
        if (leftImaginary * rightImaginary > 0) {
            sb.append(" + ");
        }
        sb.append(df.format(leftImaginary * rightImaginary)).append("i");
        return sb.toString();
    }
}
