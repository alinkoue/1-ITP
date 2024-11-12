import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи свои оценки (5 штук)\n");
        int[] grades = new int[5];
        int count=0;
        for (int i=0; i<5;i++){
            int grade_i= scanner.nextInt();
            grades[i]=grade_i;
            count+=grade_i;
        }
        count= count/5;
        if (count>60){
            System.out.println("Успешно!!!");
        }
        else if(count>40){
            System.out.println("на грани отчисления)))");
        }
        else{
            System.out.println("see you on the retske :)");
        }
        System.out.println();
        scanner.close();
    }
}
