package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class Client {

    String pseudonym;

    public Client(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        return pseudonym;
    }
}
