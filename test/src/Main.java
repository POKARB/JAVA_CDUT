public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        SIMCard mobileSIM = new ChinaMobileSIMCard();
        phone.setSIMCard(mobileSIM);
        phone.makeCall();
        phone.sendSMS();

        SIMCard unicomSIM = new ChinaUnicomSIMCard();
        phone.setSIMCard(unicomSIM);
        phone.makeCall();
        phone.sendSMS();
    }
}
