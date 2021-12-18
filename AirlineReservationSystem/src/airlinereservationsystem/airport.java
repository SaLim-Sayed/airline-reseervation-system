/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template  in the editor.
 */
package airlinereservationsystem;

/**
 *
 * @author Computer Market
 */
public class airport {
 static  String time_trip;
 static  String time_launch;
 static  String time_landing;
 static  String landing;
 static  String destination;
 static  int  num_line; 
 static  int  num_capacity; 
 static  boolean  num_ticket;

    public static String getTime_trip() {
        return time_trip;
    }

    public static void setTime_trip(String time_trip) {
        airport.time_trip = time_trip;
    }

    public static String getTime_launch() {
        return time_launch;
    }

    public static void setTime_launch(String time_launch) {
        airport.time_launch = time_launch;
    }

    public static String getTime_landing() {
        return time_landing;
    }

    public static void setTime_landing(String time_landing) {
        airport.time_landing = time_landing;
    }

    public static String getLanding() {
        return landing;
    }

    public static void setLanding(String landing) {
        airport.landing = landing;
    }

    public static String getDestination() {
        return destination;
    }

    public static void setDestination(String destination) {
        airport.destination = destination;
    }

    public static int getNum_line() {
        return num_line;
    }

    public static void setNum_line(int num_line) {
        airport.num_line = num_line;
    }

    public static int getNum_capacity() {
        return num_capacity;
    }

    public static void setNum_capacity(int num_capacity) {
        airport.num_capacity = num_capacity;
    }

    public static boolean isNum_ticket() {
        return num_ticket;
    }

    public static void setNum_ticket(boolean num_ticket) {
        airport.num_ticket = num_ticket;
    }

    public static int getNum_flight() {
        return num_flight;
    }

    public static void setNum_flight(int num_flight) {
        airport.num_flight = num_flight;
    }
 static  int  num_flight; 

        
    

   
    
    
    
    
    
}
