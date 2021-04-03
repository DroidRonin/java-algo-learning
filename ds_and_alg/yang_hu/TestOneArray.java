public class TestOneArray {
  public static void main(String[] args) {
    int [] scores = { 90, 70, 50, 80, 60, 85 };
    for (int i=0; (i+1) < scores.length; i++) {
      System.out.print(scores[i] + ",");
    }
    System.out.print(scores[scores.length-1]);
  }
}
