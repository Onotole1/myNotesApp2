package com.example.mynotesapp;

public interface Keystore {
    boolean hasPin();

    boolean checkPin(String pin);

    void saveNew(String pin);
}
