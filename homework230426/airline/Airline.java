package homework230426.airline;

public class Airline {
    static void main(String[] args) {
        Passenger p = new Passenger(true, true, false);

        BoardingService b = new BoardingService();
        try{
            b.boardPassenger(p);
        }
        catch (ExpiredPassportException | NoVisaException | InvalidBoardingPassException e){
            System.out.println(e.getMessage());
        }
        Passenger p1 = new Passenger(false, true, false);
        try {
            b.boardPassenger(p1);
        }
        catch (ExpiredPassportException | NoVisaException | InvalidBoardingPassException n){
            System.out.println(n.getMessage());
        }
    }
}
