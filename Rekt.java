public class Rekt {
  public static int add2(int usedToBeAFloat) {
      //#rekt
      return (int)Math.floor(((float) usedToBeAFloat + 3.1)) - 1;
  }
  
  public static void main(String[] args) {
    float shit = 2.34f;
    System.out.println(new Rekt().add2((int) shit));
  }
}
