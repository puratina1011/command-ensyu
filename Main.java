import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
 
    System.out.print("�E�g��(m)����͂��Ă��������F");
    double height = i.nextDouble(); // �g�������
    System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    double weight = i.nextDouble(); // �̏d�����
    double bmi = weight / Math.pow(height, 2);
    System.out.println("BMI�l��" + (double)Math.round(bmi*100)/100 + "�ł��B");
  }
}
