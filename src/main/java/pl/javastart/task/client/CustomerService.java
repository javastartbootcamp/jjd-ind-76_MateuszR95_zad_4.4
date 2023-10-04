package pl.javastart.task.client;

import pl.javastart.task.bank.Offer;

public class CustomerService {
    public void payoutOffer(Offer offer) {
        if (offer.isValid()) {
            System.out.printf("Wypłacono %.2f zł\n", offer.getValue());
            System.out.printf("Do zwrotu będzie %.2f zł\n", (offer.getPercentage() + 1) * offer.getValue());
        } else {
            System.out.println("Odmowa wypłaty");
        }
    }
}
