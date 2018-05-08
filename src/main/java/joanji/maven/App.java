package joanji.maven;

import java.util.ArrayList;
import java.util.List;
public class App{

    public void greet() {
    	List<String> gree = new  ArrayList<>();
	gree.add("Holaaaaaa");

	for (String greet : gree){
	   System.out.println("Saludos: " + greet);
	}
    }

    public App() {
        System.out.println ("Dins la aplicació!!");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Iniciant aplicació!!");
        App app = new App();
	app.greet();
    }
}
