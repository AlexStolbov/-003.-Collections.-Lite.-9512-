import org.junit.Test;

import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenPassArrayThenGetList() throws Exception {

        int[][] sourceArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> testList = new ArrayList<>();
        testList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> resultList = new ConvertList().toList(sourceArray);

        assertThat(true, is(testList.equals(resultList)));

    }

    @Test
    public void whenPassListThenGetArray() throws Exception {
        List<Integer> sourceList = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            sourceList.add(i);
        }

//        int rows = 3;
//        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 0 ,0}};

        int rows = 2;
        int[][] testArray = {{1, 2, 3, 4}, {5, 6, 7, 0}};


        int[][] resArray = new ConvertList().toArray(sourceList, rows);

        boolean res = Arrays.deepEquals(testArray, resArray);

        assertThat(true, is(res));

    }

    @Test
    public void whenPassListOfArrayThenGetList() throws Exception {
        int[] sourceArray1 = {1, 2, 3};
        int[] sourceArray2 = {4, 5, 6, 7};
        int[] sourceArray3 = {8, 9, 10, 11, 12};
        List<int[]> sourceList = Arrays.asList(sourceArray1, sourceArray2, sourceArray3);

        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        List<Integer> resList = new ConvertList().convert(sourceList);

        assertThat(true, is(testList.equals(resList)));

    }

}