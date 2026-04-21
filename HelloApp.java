public class HelloApp {

    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String names = "";

        // Enhanced for loop
        for (String name : args) {
            names += name + ", ";
        }

        // Remove trailing comma and space using substring
        names = names.substring(0, names.length() - 2);

        System.out.println("Hello, " + names);
    }
}