import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Fanta - 40\n2) Sprite - 50\n3) Cola - 50\n4) Lipton - 120");
        System.out.println("Put your money:");
        int money = scanner.nextInt();
        System.out.println("Choose the number of a drink:");
        int number = scanner.nextInt();

        if (number < 1 || number > 4) {
            System.out.println("Wrong number!");
        } else {
            Drinks selectedDrink;
            switch (number) {
                case 1:
                    selectedDrink = Drinks.FANTA;
                    break;
                case 2:
                    selectedDrink = Drinks.SPRITE;
                    break;
                case 3:
                    selectedDrink = Drinks.COLA;
                    break;
                case 4:
                    selectedDrink = Drinks.LIPTON;
                    break;
                default:
                    selectedDrink = null; // Это не будет сработано из-за условия выше
            }

            // Проверка достаточно ли денег
            if (money >= selectedDrink.getValue()) {
                System.out.println("You have bought a " + selectedDrink);
            } else {
                System.out.println("Not enough money! You need " + (selectedDrink.getValue() - money) + " more.");
            }
        }

        scanner.close(); // Закрытие сканера
    }
}