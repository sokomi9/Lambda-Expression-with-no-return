@FunctionalInterface
interface Cows
{
  void breed(int num1, int num2);
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Cows brCows = (num1, num2) -> System.out.println("Freshian"); 
    }
}