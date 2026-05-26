package homeWork210426;

public class Main {
    public static void main(String[] args) {
        BoardingService service = new BoardingService();
        Passenger p = new Passenger(false, false, false);
        try {
            service.boardPassenger(p);
        } catch (ExpiredPassportException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (NoVisaException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (InvalidBoardingPassException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
class NoVisaException extends Exception {
    public NoVisaException(String message) {
        super(message);
    }
}

class InvalidBoardingPassException extends Exception {
    public InvalidBoardingPassException(String message) {
        super(message);
    }
}

class ExpiredPassportException extends Exception {
    public ExpiredPassportException(String message) {
        super(message);
    }
}
class Passenger {
    boolean hasVisa;
    boolean hasBoardingPass;
    boolean passportValid;

    public Passenger(boolean hasVisa, boolean hasBoardingPass, boolean passportValid) {
        this.hasVisa = hasVisa;
        this.hasBoardingPass = hasBoardingPass;
        this.passportValid = passportValid;
    }
}
class BoardingService {

    public void boardPassenger(Passenger p)
            throws ExpiredPassportException, NoVisaException, InvalidBoardingPassException {

        ExpiredPassportException passportError = null;
        NoVisaException visaError = null;
        InvalidBoardingPassException boardingError = null;
        if (!p.passportValid) {
            passportError = new ExpiredPassportException("Passport is expired");
        }

        if (!p.hasVisa) {
            visaError = new NoVisaException("Passenger has no visa");
        }

        if (!p.hasBoardingPass) {
            boardingError = new InvalidBoardingPassException("Invalid boarding pass");
        }

        if (passportError != null) {
            throw passportError;
        }

        if (visaError != null) {
            throw visaError;
        }

        if (boardingError != null) {
            throw boardingError;
        }

        System.out.println("Passenger boarded successfully");
    }
}

