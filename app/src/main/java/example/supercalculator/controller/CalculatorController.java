package example.supercalculator.controller;

import example.supercalculator.model.CalculatorClass;

/*
    Обработчики нажатий кнопок в UI передают инфу в контроллер.
    Здесь формируем значения оператор1, оператор2, выполняем вызов необходимого метода из CalculatorClass.
 */

public class CalculatorController {
    // Fields.
    double operator1 = 0;
    double operator2 = 0;
    Operations operand1;
    Operations operand2;

    public double result = 0;

    /*
        Which of the operand is used to.
        false - operand1
        true - operand2
     */
    boolean isSetOperand1 = false;
    boolean isSetOperator1 = false;

    // Methods.
    public void resetAll()  {
        operator1 = 0;
        operator2 = 0;
        result = 0;
        isSetOperand1 = false;
        isSetOperator1 = false;
    }

    public void addOperand(Operations operand, StringBuilder stringBuilder) {
        /*
        * In case of 'flagOperand' we use input argument 'operand':
        *
        * false - define 'operand1'
        * true - define 'operand2'
        *
        * */
        if (!isSetOperand1) {

            this.operator1 = parsingOperator(stringBuilder);
            this.operand1 = operand;
            isSetOperand1 = true;
            isSetOperator1 = true;

        } else {
            this.operator2 = parsingOperator(stringBuilder);
            this.operand2 = operand;
            // todo: call to private method to prepare call to Calculator class.
            Execute(operator1, operator2, operand1, operand2);
        }
    }

    private double parsingOperator(StringBuilder stringBuilder) {
        double result;
        /*
        * In case of exception value = 0.0 has been returned.
        * */
        try {
            result = Double.parseDouble(stringBuilder.toString());
        } catch (NumberFormatException e) {
            result = 0.0;
        }

        return result;
    }

    private void Execute(double operator1, double operator2, Operations operand1, Operations operand2)   {

        CalculatorClass calculatorClass = new CalculatorClass();
        calculatorClass.setOperator1(operator1);
        calculatorClass.setOperator2(operator2);

        switch(operand1) {
            case DIV:
                calculatorClass.division();
                break;
            case MULT:
                calculatorClass.multiply();
                break;
            case ADD:
                calculatorClass.plus();
                break;
            case SUB:
                calculatorClass.minus();
                break;
            case EQUAL:
                resetAll();
                break;
        }

        result = calculatorClass.getResult();

        if(operand2 == Operations.EQUAL) {
            isSetOperator1 = false;
            isSetOperand1 = false;
        }
        else    {
            operator1 = result;
            operand1 = operand2;
            isSetOperand1 = true;
            isSetOperator1 = true;
        }
    }
}
