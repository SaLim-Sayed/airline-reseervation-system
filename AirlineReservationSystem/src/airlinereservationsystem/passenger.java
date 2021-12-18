/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystem;
import java.util.Scanner;
/**
 *
 * @author Computer Market
 */
public class passenger {
    Scanner input=new Scanner(System.in);
    private String name;
    private int passportID;
    private int Age;
    private String address;
    private String Gender;
    private String towen;
    private String country;
    private int phone_Number;

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getTowen() {
        return towen;
    }

    public void setTowen(String towen) {
        this.towen = towen;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhone_Number() {
        return 0+phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }
     public void showinfo(){
      System.out.println("*******************************************************");
      System.out.println("your information sir (passenger)");
      System.out.println("your name  is \t"+getName());
      System.out.println("your age is\t"+getAge());
      System.out.println("your Gender is \t"+getGender());
      System.out.println("your phone numbeer is\t"+"0"+getPhone_Number());
      System.out.println("your passport ID is \t"+getPassportID());
      System.out.println("your Address is  \t"+getAddress());
      System.out.println("your Towen is\t"+getTowen());  
      System.out.println("your country is \t"+getCountry());
      System.out.println("for any modifi refill it again");
}
  public void setyourinfo(){  
      System.out.println("*******************************************************");
      System.out.println("Enter your information sir");
      System.out.print("Name (string): ");
      setName(input.next());
      System.out.print("Age (integer):  ");
      setAge(input.nextInt());
      System.out.print("Gender (male / female):  ");
      setGender(input.next());
      System.out.print("Passport ID (integer):  ");
      setPassportID(input.nextInt());
      System.out.print("Phone Number (integer):  ");
      setPhone_Number(input.nextInt());
      System.out.print("Street (string):  ");
      setAddress(input.next());
      System.out.print("Towen (string):  ");
      setTowen(input.next());
      System.out.print("Country (string):  ");
      setCountry(input.next());
      
       
      
      
}}