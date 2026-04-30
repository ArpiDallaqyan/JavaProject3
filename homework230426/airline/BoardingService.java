package homework230426.airline;

public class BoardingService {

    public void boardPassenger(Passenger p)throws NoVisaException, InvalidBoardingPassException, ExpiredPassportException{
        if(!p.isHasVisa() & !p.isHasExpiredPassport()) {
            throw new ExpiredPassportException();

        }
        if (!p.isHasVisa() && !p.isHasBoardingPass()){
            throw new NoVisaException();

        }
        if (!p.isHasExpiredPassport() & p.isHasBoardingPass()){
            throw new ExpiredPassportException();
        }
        if (!p.isHasVisa()){
            throw new NoVisaException();
        }
        if (!p.isHasBoardingPass()){
            throw new InvalidBoardingPassException();
        }
        if (!p.isHasExpiredPassport()){
            throw new ExpiredPassportException();
        }

    }
}
