import java.util.HashMap;
import java.util.List;

public class UserConvert {

    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> resultMap = new HashMap<>();

        for (User currentUser : list) {
            resultMap.put(currentUser.getId(), currentUser);
        }

        return resultMap;
    }

}
