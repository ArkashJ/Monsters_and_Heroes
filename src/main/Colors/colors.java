package main.Colors;

/*
    * This class is used to print out text in different colors
    * I have used ANSI codes available on the internet to print text in different colors
 */
public class colors {
    //reset code to prevent entire shell from being colored
    public static final String ANSI_RESET = "\u001B[0m";
    // list of colors
    //--------------------------------------------------------------------------------
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    //--------------------------------------------------------------------------------
    // Static method that takes in the color and text to be printed and color and returns the colored string
    public static String colorText(String text, String color) {
        switch (color.toLowerCase()) {
            case "black" -> {
                return (ANSI_BLACK + text + ANSI_RESET);
            }
            case "red" -> {
                return (ANSI_RED + text + ANSI_RESET);
            }
            case "green" -> {
                return (ANSI_GREEN + text + ANSI_RESET);
            }
            case "yellow" -> {
                return (ANSI_YELLOW + text + ANSI_RESET);
            }
            case "blue" -> {
                return (ANSI_BLUE + text + ANSI_RESET);
            }
            case "purple" -> {
                return (ANSI_PURPLE + text + ANSI_RESET);
            }
            case "cyan"-> {
                return (ANSI_CYAN + text + ANSI_RESET);
            }
            default -> {
                return (ANSI_RESET + text + ANSI_RESET);
            }
        }
    }

}
