import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
 
    System.out.print("・身長(m)を入力してください：");
    double height = i.nextDouble(); // 身長を入力
    System.out.print("・体重(Kg)を入力してください：");
    double weight = i.nextDouble(); // 体重を入力
    double bmi = weight / Math.pow(height, 2);
    System.out.println("BMI値は" + (double)Math.round(bmi*100)/100 + "です。");
  }
}
