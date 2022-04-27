package by.it.berezovski.jd01_03;

public class Runner {
    public static void main(String[] args) {
      // Scanner scanner = new Scanner(System.in);
      // String line = scanner.nextLine();
        String line = "72 12 35 76 46 765 45 712";
      double [] array = InOut.getArray(line);
      InOut.printArray(array);
        InOut.printArray(array, "A", 4);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);

    }
}
