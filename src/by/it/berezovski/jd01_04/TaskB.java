package by.it.berezovski.jd01_04;

    import java.util.Scanner;

    public class TaskB {
        public static void main(String[] args) {
            int summaFirst = 0;
            int sumSecond = 0;
            int sumThird = 0;
            System.out.println("Введите число сотрудников:");
            Scanner scanner = new Scanner(System.in);
            int numEmployeers = scanner.nextInt();
            System.out.println("Введите фамилии сотрудников");
            String[] persons = new String[numEmployeers];
            for (int i = 0; i < numEmployeers; i++) {
                persons[i] = scanner.next();
            }
            int[][] personsSalary = new int[numEmployeers][4];
            for (int i = 0; i < numEmployeers; i++) {
                System.out.println("Введите зарплату для " + persons[i]);
                for (int j = 0; j < 4; j++) {
                    personsSalary[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Фамилия   Квартал1   Квартал2   Квартал3   Квартал4   Итого");
            System.out.printf("%-10s: ", persons[0]);
            for (int j = 0; j < 4; j++) {
                summaFirst = summaFirst+ personsSalary[0][j];
                System.out.printf("%-5d", personsSalary[0][j]);

            }
            System.out.printf("%-5d%n", summaFirst);

            System.out.printf("%-10s: ", persons[1]);
            for (int j = 0; j < 4; j++) {
                sumSecond += personsSalary[1][j];
                System.out.printf("%-5d", personsSalary[1][j]);

            }
              System.out.printf("%-5d%n", sumSecond);

            System.out.printf("%-10s: ", persons[2]);
            for (int j = 0; j < 4; j++) {
                sumThird += personsSalary[2][j];
                System.out.printf("%-5d", personsSalary[2][j]);
            }
            System.out.printf("%-5d%n", sumThird);

            int total = summaFirst + sumSecond + sumThird;
            double average = (double) total / (numEmployeers * 4);

            System.out.println("Итого  "   + total);
            System.out.println("Средняя  "   + average);
        }
    }
