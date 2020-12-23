package CSAAT;

public class App {
    public String getGreeting() {
        return "Hello World in sub project 1!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
