package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.BookService.displayBook(..))")
    public void logBefore() {
        System.out.println("[LOG] Before executing displayBook()");
    }

    @After("execution(* com.library.BookService.displayBook(..))")
    public void logAfter() {
        System.out.println("[LOG] After executing displayBook()");
    }
}
