/*
 * Create DeskComputer as the encapsulation of all components
 */
package deskcomputer;

/**
 * Create DeskComputer as the encapsulation of all components
 * @author servi
 */
class DeskComputer {
    //create the keyboard of Desk Computer with 15 buttons
    DeskComputerButton[] keyboard = {
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_0),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_1),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_2),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_3),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_4),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_5),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_6),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_7),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_8),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_9),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_PLUS),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_MINUS),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_MULTIPLY),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_DIVIDE),
        new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_EQUAL),
    };
    //create display of Desk Computer
    DeskComputerDisplay cd = new DeskComputerDisplay();
    //method pushkey
    public void pushkey(DeskComputerButton.ButtonMarkups pushedButtonMarkup){
        cd.display(pushedButtonMarkup);
        switch(pushedButtonMarkup){
            
        }
    }
    
}
