package com.example.javaeightprograms.Predicate;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean test(T t);
}
