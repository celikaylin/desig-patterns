# Design Patterns

This project includes simple examples of usage of some design patterns.

## Builder Pattern
It helps us in creating immutable classes with a more attributes.

It prevents
* creating more contractors
* losing immutability of the class by using setter methods. 

## Chain Of Responsibility
It gets request, process it and then transfer it to the next chain. It increases flexibility.

Request --> Handler --(ok)--> Handler --(ok)--> ..... --(ok)--> Finish

## Singleton
It provides using same object.
