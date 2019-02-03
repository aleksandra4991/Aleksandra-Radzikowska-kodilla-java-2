package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "Aleksandra",'F', LocalDate.of(1994,8,1),35 ));
        theForumUsersList.add(new ForumUser(2,"Mateusz",'M',LocalDate.of(2003,12,4),24));
        theForumUsersList.add(new ForumUser(3,"Sebastian",'M',LocalDate.of(1993,2,6),7));
        theForumUsersList.add(new ForumUser(4,"Jakub",'M',LocalDate.of(1990,7,5),0));
        theForumUsersList.add(new ForumUser(5,"Jakub",'M',LocalDate.of(1990,7,5),1));
    }

    public List<ForumUser> getList() {
        return new ArrayList<ForumUser>(theForumUsersList);
    }
}
