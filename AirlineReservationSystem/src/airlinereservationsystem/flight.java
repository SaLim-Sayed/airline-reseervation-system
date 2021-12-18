
package airlinereservationsystem;
//import static airlinereservationsystem.airport.time_trip;
import java.util.Scanner;

public class flight extends airport {
    
    Scanner input=new Scanner(System.in);
  
   
 public flight()
 { 
     System.out.println( "From Egypt to China press 1 ");
     System.out.println( "From Cairo to El Barazril press 2 ");
      System.out.println( "From Cairo to China Etaly press 3");
      System.out.println("****************************************************************");
     System.out.print("Hi.. please set yor infoemation carfully and press you trip number   "); 
     int Num_of_tripe=input.nextInt();
     System.out.println("*******************************************************************");
    System.out.print("Hi.. please set yor infoemation carfully   ");
     
  
    switch(Num_of_tripe)
       {
            case 1:
                  airport.setTime_trip("1:00H");
                  airport.setTime_launch("7:00 AM");
                  airport.setTime_landing("8:00 AM");
                  airport.setDestination("Cairo");
                  airport.setNum_ticket(true);
                  airport.setNum_line(1);
                  airport.setNum_capacity(30);
                  airport.setLanding("China");
                  System.out.println( "destination" +airport.getDestination());
                  System.out.println( "landing"+airport.getLanding());
                  System.out.println( "time_trip"+airport.getTime_trip());
                  System.out.println("time_launch"+airport.getTime_launch());
                  System.out.println( "time_landing "+airport.getTime_landing());
                  System.out.println( "ticket unReserve"+airport.isNum_ticket());
                  System.out.println("the flight use line"+airport.getNum_line());
                  System.out.println("the flight capacity is"+airport.getNum_capacity());
               break;
              case 2:
                    airport.setTime_trip("2:30H");
                    airport.setTime_landing("12:30 AM");
                    airport.setTime_launch("10:00 PM");
                    airport.setDestination("Cairo");
                    airport.setNum_ticket(true);
                    airport.setNum_line(2);
                    airport.setNum_capacity(300);
                    airport.setDestination(" Cairo");
                    airport.setLanding(" El Barazril");
                    System.out.println( " destination" +airport.getDestination());
                    System.out.println( " landing"+airport.getLanding());
                    System.out.println( " time_trip"+airport.getTime_trip());
                    System.out.println(" time_launch"+airport.getTime_launch());
                    System.out.println( " time_landing "+airport.getTime_landing());
                    System.out.println( " ticket unReserve"+airport.isNum_ticket());
                    System.out.println(" the flight use line"+airport.getNum_line());
                    System.out.println("  the flight capacity is"+airport.getNum_capacity());

               break;
               case 3:
                    airport.setTime_trip(" 3:30H");
                    airport.setTime_landing(" 5:30 PM");
                    airport.setTime_launch(" 2:00 PM");
                    airport.setNum_ticket(true);
                    airport.setNum_line(3);
                    airport.setNum_capacity(250);
                    airport.setDestination(" Cairo");
                    airport.setLanding(" Etalye");
                    System.out.println( " destination" +airport.getDestination());
                    System.out.println( " landing"+airport.getLanding());
                    System.out.println( " time_trip"+airport.getTime_trip());
                    System.out.println(" time_launch"+airport.getTime_launch());
                    System.out.println( " time_landing "+airport.getTime_landing());
                    System.out.println( " ticket unReserve"+airport.isNum_ticket());
                    System.out.println(" the flight use line"+airport.getNum_line());
                    System.out.println(" the flight capacity is"+airport.getNum_capacity());

               break;
               default:
                    System.out.println("please rerun your project ");
        }
 
    }  
     
   
}
   