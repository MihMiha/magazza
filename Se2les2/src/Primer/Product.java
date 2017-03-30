package Primer;


 abstract class Product<T> implements Comparable<Product> {

    String name;
    int price;



    abstract void subCompare(T p);


 }
