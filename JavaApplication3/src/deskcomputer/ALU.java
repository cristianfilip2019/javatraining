/*
 * ALU is processing all the desk computer operations
 */
package deskcomputer;

/**
 * ALU is processing all the desk computer operations
 * @author servi
 */
class ALU {
    //Desk Computer parent
    DeskComputer parent;
    //memory for first operand
    private int firstOperand = 0;
    //memory for second operand
    private int secondOperand = 0;
    //memory for operator
    DeskComputerButton.ButtonMarkups operator;
    //memory for result
    private int result = 0;
    //ALU constructor
    public ALU(DeskComputer parent){
        this.parent = parent;
    }
    
    public void pushkey(DeskComputerButton markup){
        switch(markup.getMarkup()){
            case KEY_0:
            {
                if( null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("0");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("0");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_1:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("1");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("1");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_2:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("2");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("2");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_3:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("3");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("3");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_4:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("4");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("4");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_5:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("5");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("5");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_6:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("6");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("6");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_7:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("7");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("7");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_8:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("8");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("8");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_9:
            {
                if(null == operator){
                    String temp = String.valueOf(firstOperand);
                    temp = temp.concat("9");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(secondOperand);
                    temp = temp.concat("9");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_PLUS:
                operator = DeskComputerButton.ButtonMarkups.KEY_PLUS;
            break;
            case KEY_MINUS:
                operator = DeskComputerButton.ButtonMarkups.KEY_MINUS;
            break;
            case KEY_MULTIPLY:
                operator = DeskComputerButton.ButtonMarkups.KEY_MULTIPLY;
            break;
            case KEY_DIVIDE:
                operator = DeskComputerButton.ButtonMarkups.KEY_DIVIDE;
            break;
            case KEY_EQUAL:
            {
                switch(operator){
                    case KEY_PLUS: result = firstOperand + secondOperand;
                    break;
                    case KEY_MINUS: result = firstOperand - secondOperand;
                    break;
                    case KEY_MULTIPLY: result = firstOperand * secondOperand;
                    break;
                    case KEY_DIVIDE: result = firstOperand/secondOperand;
                    break;
                }               
                parent.getCd().display(String.valueOf(result));
            }    
        }
    }
}
