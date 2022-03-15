import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;


class PiDay {  
  public static void main(String args[]) throws IOException, InterruptedException { 
    System.out.println("What is today?");

    // Create a reader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Get the user's response to the question
    String today = reader.readLine();

    if (today.equals("pi day")) {
      System.out.println("Yay it's Pi Day!!!");

      TimeUnit.SECONDS.sleep(2);

      System.out.println("3.14159265358979323846");
    } else {
      System.out.println("It's not Pi Day so have the constant E!!!");

      TimeUnit.SECONDS.sleep(2);

      System.out.println("2.71828182845904523536");
    }
  } 
}
