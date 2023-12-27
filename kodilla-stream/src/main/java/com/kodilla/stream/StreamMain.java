package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10 , 50 , (a , b ) -> a+b);
        expressionExecutor.executeExpression(10 , 50 , (a , b ) -> a-b);
        expressionExecutor.executeExpression(10 , 50 , (a , b ) -> a/b);
        expressionExecutor.executeExpression(10 , 50 , (a , b ) -> a*b);
        System.out.println("--------Zadanie 7.1 ----------");
        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Adrian", String::toUpperCase);
        System.out.println("------------------");

        BookDirectory thebookDirectory = new BookDirectory();
        Map<String ,Book> theResultListOfBooks = thebookDirectory.getList().stream()
                .filter(book -> book.yearOfPublication()>2005)
                .collect(Collectors.toMap(Book::getSignature ,
                        book ->book));


        System.out.println("# elemnts: " + theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey()+": "+ entry.getValue())
                .forEach(System.out::println);
        System.out.println("-----------Zadanie 7.3-------");

        Forum forum = new Forum();
        List<ForumUser> userList = forum.getUserList();

        Map<Integer, ForumUser> resultMap = userList.stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getAge() >= 20)
                .filter(user -> user.getPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        resultMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}