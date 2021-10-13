package com.example;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Entry {
    public static void main(String[] args){
        //mergeWith();
        concatWith();
    }

    private static void mergeWith(){
        Observable.intervalRange(1, 10, 0, 2000,TimeUnit.MILLISECONDS) //1
                .mergeWith(Observable.intervalRange(11, 10, 1000, 2000, TimeUnit.MILLISECONDS)) //2
                .blockingSubscribe(System.out::println); //3
    }

    private static void concatWith(){
        Observable.intervalRange(1, 10, 0, 2000,TimeUnit.MILLISECONDS) //1
                .concatWith(Observable.intervalRange(11, 10, 1000, 2000, TimeUnit.MILLISECONDS)) //2
                .blockingSubscribe(System.out::println); //3
    }
}