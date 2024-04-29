class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) {
                throw new CustomException("You are not eligible to vote.");
            }
            System.out.println("You are eligible to vote.");
        } catch (CustomException e) {
            System.out.println("Custom exception caught: " +
                    e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}