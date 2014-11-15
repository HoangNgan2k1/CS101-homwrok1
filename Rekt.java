public class Rekt {
  public static int add2(int oldFloatValue) {
      //#rekt
      return (int)Math.floor(((float) oldFloatValue + 3.1)) - 1;
  }
  
  public static void main(String[] args) {
    float beLessVulgar = 2.34f;
    System.out.println(new Rekt().add2((int) beLessVulgar));
  }
}
