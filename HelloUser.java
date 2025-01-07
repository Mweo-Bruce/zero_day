// Aurthor: Mweo Malupande, Full Stack Developer
// Hello world in Java

class HelloUser {
  
  public static void main(String[] args) {
    
    // create Scanner object to accept user input
    Scanner input = new Scanner(System.in);

    // get user's full name
    System.out.print("What is your full name: ");
    String userName = input.nextLine();
    
    // greet user 
    System.out.println("Hello " + userName + ", nice to meet you.");

    // close input stream
    input.close();
    
  } // end main method
  
} // end class HelloWorld
