package example.supercalculator.model;

public class Calculator {
    // Fields.
    private double operator1;
    private double operator2;
    private double result;

    // Constructors.
    Calculator()    {
        this.result = 0;
    }

    // Methods.
    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    private void division() {
        if(operator2 == 0)  {
            result = Double.POSITIVE_INFINITY;
        }
        else    {
            result = operator1 / operator2;
        }
    }

    private void multiply() {
        result = operator1 * operator2;
    }

    private void plus() {
        result = operator1 + operator2;
    }

    private void minus() {
        result = operator1 - operator2;
    }

    public double getResult() {
        return result;
    }
}
