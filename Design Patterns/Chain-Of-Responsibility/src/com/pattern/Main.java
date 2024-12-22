package com.pattern;

import com.pattern.chain.MiddleWare;
import com.pattern.chain.RoleCheckMiddleWare;
import com.pattern.chain.ThrottlingMiddleWare;
import com.pattern.chain.UserExistsMiddleWare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This example shows how a request containing user data passes a sequential chain of handlers that perform various things such as
 * authentication, authorization and validation.
 *
 * Chain of responsibility pattern is used in 2 ways:
 * 1. look for the correct handler, and exit the chain after that.
 * 2. We execute every handler until there's one that can't handle a request.
 *
 * This example is of type 2.
 */

/**
 * The primary focus here is to understand the Chain of Responsibility (CoR) design pattern.
 * However, the code may contain potential pitfalls and areas for improvement which are out of scope.
 */

/**
 * credits:
 * <a href="https://youtube.com/playlist?list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&feature=shared">...</a>
 * <a href="https://refactoring.guru">...</a>
 */

public class Main {
    private static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    private static void init(){
        server=new Server();
        server.register("harsh@gmail.com","admin_pass");
        server.register("user1@gmail.com","user_pass");

        MiddleWare middleWare=MiddleWare.link(new ThrottlingMiddleWare(2),
                new UserExistsMiddleWare(server),
                new RoleCheckMiddleWare()
        );

        server.setMiddleWare(middleWare);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do{
            System.out.print("Enter email: ");
            String email=reader.readLine();
            System.out.print("Enter password: ");
            String password=reader.readLine();
            success=server.logIn(email,password);
        } while (!success);

    }
}