package by.it.berezovski.jd01_02;

public class TaskC {

    static int[][] step3(int[][] array) {

        //find max

        int max = findMax(array);



        boolean[] delRows = new boolean[array.length];

        boolean[] delCols = new boolean[array[0].length];

        extractDeleteFlags(array, max, delRows, delCols);

        //getSize;

        int rows = getRows(delRows);

        //    getSize;

        int cols = getCols(delCols);

        return fillResult(array, delRows, delCols, rows, cols);





    }



    private static int[][] fillResult(int[][] array, boolean[] delRows, boolean[] delCols, int rows, int cols) {

        //fillResult

        int[][] result = new int[rows][cols];

        for (int i = 0, iResult = 0; i < array.length; i++) {

            //if (!delRows[i]

            if (delRows[i] == false) {

                for (int j = 0, jResult = 0; j < array[i].length; j++) {

                    if (!delCols[j]) {

                        result[iResult][jResult++] = array[i][j];

                    }



                }



                iResult++;



            }

        }

        return result;

    }



    public static int getRows(boolean[] delRows) {

        int rows = 0;

        for (boolean delRow : delRows) {

            if (!delRow) {

                rows++;

            }

        }

        return rows;

    }



    public static int getCols(boolean[] delCols) {

        int cols = 0;

        for (boolean delCol : delCols) {

            if (!delCol) {

                cols++;

            }

        }

        return cols;

    }



    private static void extractDeleteFlags(int[][] array, int max, boolean[] delRows, boolean[] delCols) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (max == array[i][j]) {

                    delRows[i] = true;

                    delCols[j] = true;

                }



            }



        }

    }



    private static int findMax(int[][] array) {

        int max = Integer.MIN_VALUE;

        for (int[] row : array) {

            for (int element : row) {

                if (element > max) {

                    max = element;

                }

            }



        }

        return max;

    }

}
