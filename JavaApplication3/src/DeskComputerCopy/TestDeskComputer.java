/*
 * Testing test computer simulating an add operation.
 */
package DeskComputerCopy;

import deskcomputer.*;

/**
 * Testing test computer simulating an add operation.
 * @author servi
 */
public class TestDeskComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a desk computer object
        DeskComputer dc = new DeskComputer();
        //push the desk computer keys to introduce first operand
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_1);
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_2);
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_3);
        //introduce the operation
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_PLUS);
        //push the desk computer keys to introduce second operand
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_3);
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_2);
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_1);
        //introduce =
        dc.pushkey(DeskComputerButton.ButtonMarkups.KEY_EQUAL);
    }
    
}
