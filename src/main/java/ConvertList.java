import java.util.ArrayList;
import java.util.List;

public class ConvertList {

    List<Integer> toList(int[][] array) {
        final List<Integer> result = new ArrayList<>();

        for (int[] i : array) {
            for (int y : i) {
                result.add(y);
            }
        }

        return result;

    }

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
}
