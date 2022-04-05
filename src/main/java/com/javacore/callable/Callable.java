package com.javacore.callable;

@FunctionalInterface
public interface Callable<V> {
    V call() throws  Exception;

}
