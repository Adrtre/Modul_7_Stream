package com.kodilla.stream.forumuser;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "JohnDoe", 'M', LocalDate.of(1990, 5, 15), 3));
        userList.add(new ForumUser(2, "AliceSmith", 'F', LocalDate.of(1985, 8, 20), 0));
        userList.add(new ForumUser(3, "BobJohnson", 'M', LocalDate.of(2000, 2, 10), 1));
        userList.add(new ForumUser(4, "EveBrown", 'F', LocalDate.of(1995, 11, 25), 5));
        userList.add(new ForumUser(5, "CharlieMiller", 'M', LocalDate.of(1982, 4, 30), 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}