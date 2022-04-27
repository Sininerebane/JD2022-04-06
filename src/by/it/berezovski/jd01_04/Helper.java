package by.it.berezovski.jd01_04;

public class Helper {

    public static void sort(double[] array) {
        boolean swap;
       int last = array.length - 1;
        do {
            swap = false;
            for (int j =0; j < last; j ++){
                if (array[j] > array [j+1]){
                    double buffer = array [j];
                    array [j] = array [j+1];
                    array [j+1] = buffer;
                    swap = true;
                }
            }
            last --;
        }
        while (swap);

    }



    public static double findMin(double[] array) {
        double min = array[0];
        for (double m : array) {
            if (min > m) {
                min = m;

            }

        }
        return min;



        }

    public static double findMax(double[] array) {
        double max = array [0];
        for (double m : array){
            if (max < m) max =m;
        }
        return max;
    }
}


