/*
 * Seth James England
 * date unkown, sorry
 */

package mathmethods;

/**
 *
 * @author seeng1309
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Here i am declaring my variables
         int myNumberRounded;
         double aNumber = 56;
         double anotherNumber = 3;
        double myNumber=15.4;
        double pi = Math.PI;
       double theGreatest = Math.max(myNumber, pi);
        myNumberRounded = (int) Math.round(myNumber);
         double theSuckiest = Math.min(myNumber, myNumberRounded);
         double aReallyBigNumber = Math.pow(aNumber, anotherNumber);
//        myNumber *=10; // this is the same as myNumber = myNumber *10;
//        myNumber +=5;
//        myNumber /=10;
//        myNumberRounded =(int)(myNumber);
        System.out.println(myNumberRounded);
        System.out.println(theGreatest);
        System.out.println(theSuckiest);
        System.out.println(aReallyBigNumber);
        
        
    }
    
}
