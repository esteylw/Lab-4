//Import random class
import java.util.Random;

class Main {
  public static void main(String[] args) {
    //Seed the random numbers
    Random r = new Random();
    int randomNum = r.nextInt(51);
    //Checkpoint: What is the random number?
    System.out.println("The random number is: " +randomNum);
    //Run countDown and print
    System.out.println(countDown(randomNum));
  }
  public static String countDown(int startNum){
    //Declare return String but do not initialize
    String s;
    System.out.println("Initiating Countdown:");
    //Countdown loop
    for (int i = startNum; i >= 0; i--){
      System.out.println(i);
    }

    //Return values depending on startNum
    if (startNum <= 5){
      s = "Ahoy mateys!";
    } else if (startNum >= 25 && startNum <= 42){
      s = "Cannonball!";
    } else {
      s = "Blast off!";
    }
    return s;
  }
}