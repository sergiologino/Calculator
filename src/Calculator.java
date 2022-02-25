import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Введите операнд1 ");
      int operand =  scan.nextInt();
      int result = 0;
      System.out.print("Введите операцию ");
      char operator = scan.next().charAt(0);
      System.out.print("Введите операнд2 ");
      switch (operator) {
         case '*':
            result = operand * scan.nextInt();
            break;
         case '/':
            result = operand / scan.nextInt();
            break;
         case '+':
            result = operand + scan.nextInt();
            break;
         case '-':
            result = operand - scan.nextInt();
            break;
         default:
            System.out.println("Неправильный оператор");
      }
      System.out.println("Результат: " + result);
   }
}
