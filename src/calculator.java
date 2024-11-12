import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) addition\n2) substruction\n3) multiplication\n4) division");
        System.out.println("Выберите операцию : ");
        char operator = scanner.next().charAt(0);
        double result;
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '1':
                result = num1 + num2;
                break;
            case '2':
                result = num1 - num2;
                break;
            case '3':
                result = num1 * num2;
                break;
            case '4':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: Неверная операция!");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
