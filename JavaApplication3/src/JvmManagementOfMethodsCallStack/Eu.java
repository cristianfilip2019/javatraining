
package JvmManagementOfMethodsCallStack;

public class Eu {
    String name;
    float age;
    //morning habits
    public morningProgram(){
        System.out.println("morning program");
        washingface();
    }
    //washing face
    private washingface(){
        System.out.println("washing my face");
        putSoapInHand();
        cleanMyFace(); 
    }
    // put soap in hand
    private putSoapInHand(){
        System.out.println("put soap in my hand");
    }
    // clean my face
    private cleanMyFace(){
        System.out.println("clean my face");
    }
    
    public static void main(String[] args) {
        
    }
    
}
