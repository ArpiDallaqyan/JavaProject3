public class Homework {
    static void main(String[] args) {
        String light = "YELLOW";

        String action = switch (light) {
            case "RED" -> "Stop";
            case "YELLOW" -> {
                System.out.println("Get ready");
                yield "Slow down";
            }
            case "GREEN" -> "Go";
            default -> "Invalid signal";
        };

        System.out.println(action);
    }

}
