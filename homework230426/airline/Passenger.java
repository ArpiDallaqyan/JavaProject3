package homework230426.airline;

public class Passenger {

    private boolean hasVisa;
    private boolean hasBoardingPass;
    private boolean hasExpiredPassport;

    Passenger(boolean hasVisa, boolean hasBoardingPass, boolean hasExpiredPassport){
        this.hasVisa = hasVisa;
        this.hasBoardingPass = hasBoardingPass;
        this.hasExpiredPassport = hasExpiredPassport;

    }

    public boolean isHasBoardingPass() {
        return hasBoardingPass;
    }

    public boolean isHasVisa() {
        return hasVisa;
    }

    public boolean isHasExpiredPassport() {
        return hasExpiredPassport;
    }
}
