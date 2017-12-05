import java.util.ArrayList;
import java.util.List;

public class ConvertList {

    /**
     * Convert array of int to list ogf int.
     * @param array - array of int
     * @return - list of int.
     */
    List<Integer> toList(int[][] array) {
        final List<Integer> result = new ArrayList<>();

        for (int[] i : array) {
            for (int y : i) {
                result.add(y);
            }
        }

        return result;

    }

    /**
     * Evenly splits the list into the number of rows of a two-dimensional array.
     * @param list - list of int.
     * @param rows - number of rows.
     * @return - list.
     */
    int[][] toArray(List<Integer> list, int rows) {

        int columns = (int) Math.ceil((float) list.size() / rows);
        int[][] resArray = new int[rows][columns];

        for (int currRow = 0; currRow < rows; currRow++) {
            for (int currColumn = 0; currColumn < columns; currColumn++) {
                int currPoint = currRow * columns + currColumn;
                if (list.size() > currPoint) {
                    resArray[currRow][currColumn] = list.get(currPoint);
                } else {
                    resArray[currRow][currColumn] = 0;
                }
            }
        }

        return resArray;
    }

    /**
     * Converts a list containing arrays to the list.
     * @param list - a list containing arrays of int.
     * @return list containing int.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> resList = new ArrayList<>();
        for (int[] currArray : list) {
            for (int currInt : currArray) {
                resList.add(currInt);
            }
        }
        return resList;
    }

}
