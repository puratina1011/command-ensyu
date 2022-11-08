import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    System.out.print("１人目の情報を入力してください");
    System.out.print("・身長(m)を入力してください：");
    double height = i.nextDouble(); // 身長を入力
    System.out.print("・体重(Kg)を入力してください：");
    double weight = i.nextDouble(); // 体重を入力
    double bmi = weight / Math.pow(height, 2);
    System.out.print("2人目の情報を入力してください");
    System.out.print("・身長(m)を入力してください：");
    double height2 = i.nextDouble(); // 身長を入力
    System.out.print("・体重(Kg)を入力してください：");
    double weight2 = i.nextDouble(); // 体重を入力
    double bmi2 = weight2 / Math.pow(height2, 2);
    System.out.println("1人目のBMI値は"+(double)Math.round(bmi*100)/100+"です。");
    System.out.println("2人目のBMI値は" +(double)Math.round(bmi2*100)/100 + "です。");
  }
}

