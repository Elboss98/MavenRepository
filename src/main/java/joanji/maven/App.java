package joanji.maven;

public class App{

    public App() {
        System.out.println ("Dins la aplicació!!");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Iniciant aplicació!!");
        App app = new App();
    }
}