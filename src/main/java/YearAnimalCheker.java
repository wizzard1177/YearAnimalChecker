import java.util.Scanner;

public class YearAnimalCheker {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Данная программа определяет символическое животное введеного года.");
        int year = scan.nextInt();

        checkyear(year);
    }

    public static void checkyear(int a){
        int year = a;
        if (year<=0){
            System.out.println("Программа сомневается что вы родились до нашей эры. Попробуйте другой год.");
            year = scan.nextInt();
            checkyear(year);
        }else {
            switch (year%12) {
                case 1:
                    System.out.println(" Год Петуха");
                    break;

                case 2:
                    System.out.println(" Год Собаки");
                    break;

                case 3:
                    System.out.println(" Год Свиньи");
                    break;

                case 4:
                    System.out.println(" Год Крысы");
                    break;

                case 5:
                    System.out.println(" Год Быка");
                    break;

                case 6:
                    System.out.println(" Год Тигра");
                    break;

                case 7:
                    System.out.println(" Год Кролика");
                    break;

                case 8:
                    System.out.println(" Год Дракона");
                    break;

                case 9:
                    System.out.println(" Год Змеи");
                    break;

                case 10:
                    System.out.println(" Год Лошади");
                    break;

                case 11:
                    System.out.println(" Год Козы");
                    break;

                case 0:
                    System.out.println(" Год Обезяны");
                    break;
            }
        }
    }
}
