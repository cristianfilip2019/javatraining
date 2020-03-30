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
    
    public void pushkey(DeskComputerButton pushedButton){
        switch(pushedButton.getMarkup()){
            case KEY_0:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_0 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("0");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("0");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_1:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_1 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("1");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("1");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_2:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_2 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("2");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("2");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_3:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_3 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("3");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("3");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_4:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_4 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("4");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("4");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_5:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_5 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("5");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("5");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_6:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_6 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("6");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("6");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_7:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_7 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("7");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("7");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_8:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_8 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("8");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("8");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_9:
            {
                if(DeskComputerButton.ButtonMarkups.KEY_9 == operator){
                    String temp = String.valueOf(firstOperand);
                    temp.concat("9");
                    parent.getCd().display(temp);
                    firstOperand = Integer.parseInt(temp);
                }
                else{
                    String temp = String.valueOf(firstOperand);
                    temp.concat("9");
                    parent.getCd().display(temp);
                    secondOperand = Integer.parseInt(temp);
                }
            }
            break;
            case KEY_PLUS:
                operator = DeskComputerButton.ButtonMarkups.KEY_PLUS;
            case KEY_EQUAL:
            {
                switch(operator){
                    case KEY_PLUS: result = firstOperand + secondOperand;
                    case KEY_MINUS: result = firstOperand - secondOperand;
                    case KEY_MULTIPLY: result = firstOperand * secondOperand;
                    case KEY_DIVIDE: result = firstOperand/secondOperand;
                }
                parent.getCd().display(String.valueOf(result));
            }    
        }
    }
}
