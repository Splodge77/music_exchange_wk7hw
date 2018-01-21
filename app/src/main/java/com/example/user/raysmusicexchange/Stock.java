package com.example.user.raysmusicexchange;

/**
 * Created by user on 21/01/2018.
 */

class Stock<T> {

    private T item;

    public Stock(T item) {this.item = item;}

    public T getItem(){return this.item;}
}
