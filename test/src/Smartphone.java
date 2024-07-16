public class Smartphone {
    private SIMCard simCard;

    public void setSIMCard(SIMCard simCard) {
        this.simCard = simCard;
    }

    public void makeCall() {
        if (simCard != null) {
            System.out.println("Making a call using " + simCard.getNetworkService());
        } else {
            System.out.println("No SIM card inserted.");
        }
    }

    public void sendSMS() {
        if (simCard != null) {
            System.out.println("Sending SMS using " + simCard.getNetworkService());
        } else {
            System.out.println("No SIM card inserted.");
        }
    }
}
