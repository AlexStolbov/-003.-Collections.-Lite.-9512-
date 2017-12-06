import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.*;

public class UserConvertTest {

    @Test
    public void whenPassArrayThenGetList() throws Exception {
        User user1 = new User(1, "Name1", "Moscow");
        User user2 = new User(2, "Name2", "Moscow");
        User user3 = new User(3, "Name3", "Moscow");

        List<User> sourceListUser = new ArrayList<>();
        sourceListUser.addAll(Arrays.asList(user1, user2, user3));

        Map<Integer, User> testMap = new HashMap<>();
        testMap.put(user1.getId(), user1);
        testMap.put(user2.getId(), user2);
        testMap.put(user3.getId(), user3);

        Map<Integer, User> resultMap = new UserConvert().process(sourceListUser);

        assertThat(true, is(testMap.equals(resultMap)));

    }

}
