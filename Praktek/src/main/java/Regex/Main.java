package Regex;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "%s %s".formatted("Heelo", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("Using string's formatted method : " + helloWorld);
        System.out.println("Using string's formatted method : " + helloWorld2);
        System.out.println("Using Main.Format : " + format("%s %s ", "Hello", "World"));
    }

    public static String format(String regexp, String... args) {
        int index = 0;
        while (regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[index++]);
        }
        return regexp;
    }
}
