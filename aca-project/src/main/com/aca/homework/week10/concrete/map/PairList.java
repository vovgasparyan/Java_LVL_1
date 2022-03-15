package com.aca.homework.week10.concrete.map;

public class PairList<K, V> {

    private K key;
    private V value;

    public PairList(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
