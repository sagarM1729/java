public class speed {
    public static void main(String[] args) {
        final int speedLimit = 120;
        int currentSpeed = 110;
        if (currentSpeed > speedLimit) {
            System.out.println("Warning, your speed is exceeding " +
                    speedLimit + " km/h.");
            System.out.println("Please slow down and drive safely!");
        } else {
            System.out.println("You are within the speed limit.");
            System.out.println("Drive safely!");
        }
    }
}