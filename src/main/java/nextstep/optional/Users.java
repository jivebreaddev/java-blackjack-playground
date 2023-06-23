package nextstep.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Users {
    static final User DEFAULT_USER = new User("codesquad", 100);

    List<User> users = Arrays.asList(
            new User("crong", 35),
            new User("pobi", 30),
            new User("jk", 40),
            new User("honux", 45));

    User getUser(String name) { // 이 부분이 제일 힘들었는데 없다면 default 넘기는 부분이었다.
//        Optional<List<User>> optionalUsers = Optional.of(users);
//        optionalUsers.map(list -> list.stream().filter(x -> x.matchName(name)));

        return users.stream().filter(user -> user.matchName(name)).findFirst().orElse(DEFAULT_USER); // find First() 없다면 Optional을 넘겨준다.


    }
}
