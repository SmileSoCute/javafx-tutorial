import java.util.Locale;

public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    public String getResponse(String input) {
        commandType = getCommandType(input);
        return "Duke heard: " + input;
    }

    /** Returns the visual category for a recognised task command. */
    public String getCommandType() {
        return commandType;
    }

    private String getCommandType(String input) {
        String command = input.trim().toLowerCase(Locale.ROOT);
        if (command.startsWith("todo") || command.startsWith("deadline") || command.startsWith("event")) {
            return "add";
        }
        if (command.startsWith("mark")) {
            return "mark";
        }
        if (command.startsWith("delete")) {
            return "delete";
        }
        return "";
    }
}
