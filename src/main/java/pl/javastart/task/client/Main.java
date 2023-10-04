package pl.javastart.task.client;

import pl.javastart.task.bank.Config;
import pl.javastart.task.bank.Offer;
import pl.javastart.task.bank.SalesRepresentative;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 3000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);

    }
}