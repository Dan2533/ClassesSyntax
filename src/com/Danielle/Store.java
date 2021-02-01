package com.Danielle;
/*   Syntax
  1. Create a public Store
  2. Your program will not compile without a main() method.
     Define one within store.

     Constructors
  3. Let’s explore how code execution moves around the file with two methods.
     Add a print statement inside our Store constructor with the message:
     I am inside the constructor method.

    We’ll see this message whenever we create an instance of Store by calling the constructor.
 */

public class Store {
    public Store(){
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store();
    }
}
