import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    System.out.print("�P�l�ڂ̏�����͂��Ă�������");
    System.out.print("�E�g��(m)����͂��Ă��������F");
    double height = i.nextDouble(); // �g�������
    System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    double weight = i.nextDouble(); // �̏d�����
    double bmi = weight / Math.pow(height, 2);
    System.out.print("2�l�ڂ̏�����͂��Ă�������");
    System.out.print("�E�g��(m)����͂��Ă��������F");
    double height2 = i.nextDouble(); // �g�������
    System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    double weight2 = i.nextDouble(); // �̏d�����
    double bmi2 = weight2 / Math.pow(height2, 2);
    System.out.println("1�l�ڂ�BMI�l��"+(double)Math.round(bmi*100)/100+"�ł��B");
    System.out.println("2�l�ڂ�BMI�l��" +(double)Math.round(bmi2*100)/100 + "�ł��B");
  }
}

