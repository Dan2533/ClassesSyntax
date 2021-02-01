package com.Danielle;
/*   Syntax
  1. Create a public Store
  2. Your program will not compile without a main() method.
     Define one within store.

     Constructors
  3. Let’s explore how code execution moves around the file with two methods.
     Add a print statement inside our Store constructor with the message:
     I am inside the constructor method.

  4. Inside main(), print lemonadeStand to see how Java represents this instance.

    Review the order of the printed messages:

    Running the program invokes main()
    We create an instance so we move from main() to Store()
    The code inside Store() runs
    When Store() finishes execution, we return to main()
 */

public class Store {
    public Store(){
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
        Store lemonadeStand = new Store();
    }
}
