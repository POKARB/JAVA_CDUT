public class ChinaMobileSIMCard implements SIMCard {
    @Override
    public String getNetworkService() {
        return "China Mobile Network Service";
    }

    @Override
    public String getCardInfo() {
        return "China Mobile SIM Card";
    }
}
