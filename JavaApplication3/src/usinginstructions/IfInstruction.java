
package usinginstructions;

public class IfInstruction {
        String intersection = "left";
        
        public void testIfInstruction(){
            if("left".equals(intersection)){
                System.out.println("Go left!");
            }
            else{
                System.out.println("Go right!");
            }
        }
}
