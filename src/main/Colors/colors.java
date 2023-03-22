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
    // Constructor that takes in the color and text to be printed and color prints it
    public static void colorText(String text, String color) {
        switch (color.toLowerCase()) {
            case "black" -> System.out.println(ANSI_BLACK + text + ANSI_RESET);
            case "red" -> System.out.println(ANSI_RED + text + ANSI_RESET);
            case "green" -> System.out.println(ANSI_GREEN + text + ANSI_RESET);
            case "yellow" -> System.out.println(ANSI_YELLOW + text + ANSI_RESET);
            case "blue" -> System.out.println(ANSI_BLUE + text + ANSI_RESET);
            case "purple" -> System.out.println(ANSI_PURPLE + text + ANSI_RESET);
            case "cyan" -> System.out.println(ANSI_CYAN + text + ANSI_RESET);
            default -> System.out.println(ANSI_RESET + text + ANSI_RESET);
        }
    }

}
