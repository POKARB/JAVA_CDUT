public class ChinaUnicomSIMCard implements SIMCard {
    @Override
    public String getNetworkService() {
        return "China Unicom Network Service";
    }

    @Override
    public String getCardInfo() {
        return "China Unicom SIM Card";
    }
}
