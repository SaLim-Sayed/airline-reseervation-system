package airlinereservationsystem;
import java.util.Scanner;
/**
 *
 * @author salem
 */
public class AirlineReservationSystem 
{
    public static void main(String[] args) {
        System.out.println("hello!  this project is implement by "+" SaLim & Nourhan & Shereen");
        flight f1=new flight();                  //this is an object from flight class
         
        Scanner input=new Scanner(System.in);      //scanner object
      passenger pas = new passenger();           //this an object from passenger class 
     // pas.setyourinfo();
      
      reservation R=new reservation();
      R.start();
      pas.showinfo();
     // R.outseat();
      
     
    }
    
}
