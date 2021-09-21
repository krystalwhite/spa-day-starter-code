package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    private static Map<Integer, User> userMap = new HashMap<>();

    public static void add(User user) {
        userMap.put(user.getId(), user);
    }

    public static Collection<User> getAll() {
        return userMap.values();
    }

    public static User getById(int id) {
        return userMap.get(id);
    }

}
