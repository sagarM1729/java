class SpeedLimitExceededException extends Exception {
    public SpeedLimitExceededException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int speed = 180;
        try {
            if (speed > 150) {
                throw new SpeedLimitExceededException("Speed Limit is Exceeded: " + speed + " km/hr");
            } else {
                System.out.println("The speed is within the limit.");
            }
        } catch (SpeedLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
