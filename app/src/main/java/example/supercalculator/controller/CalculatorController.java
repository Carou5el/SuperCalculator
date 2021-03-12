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

    // Which operator is used to.
    // false - operator1
    // true - operator2
    boolean flagToOperator = false;


    // Methods.
    public void resetAll()  {
        operator1 = 0;
        operator2 = 0;
        result = 0;
        flagToOperator = false;
    }

    public void addOperator(String inputString, Operations operator)   {

        if(!flagToOperator)  {
            operator1 = Double.parseDouble(inputString);
            operand1 = operator;
            flagToOperator = !flagToOperator;
        }
        else    {
            operator2 = Double.parseDouble(inputString);
            operand2 = operator;
            sendToCalculatorClass(operator1, operator2, operand1, operand2);
        }

    }

    private void sendToCalculatorClass (double num1, double num2, Operations op1, Operations op2)   {

        if(op2 == Operations.EQUAL) {
            Task(op1);
            flagToOperator = false;
        }
        else    {
            Task(op1);
            operator1 = result;
            operand1 = op2;
            flagToOperator = true;

        }
    }

    private void Task(Operations op1) {
        CalculatorClass calculatorClass = new CalculatorClass();
        calculatorClass.setOperator1(operator1);
        calculatorClass.setOperator2(operator2);

        switch(op1) {
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
    }
}
