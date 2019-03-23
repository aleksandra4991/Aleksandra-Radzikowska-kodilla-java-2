package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService{

    @Override
    public void inform(Client client) {
        System.out.println("Wiadomość SMS wysłana do klienta");
    }
}
