package joanji.maven;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class App{

    public int contarLletres(String paraula) {
    	String[] seperarParaules = StringUtils.split(paraula, ' ');
	return (seperarParaules == null) ? 0 : seperarParaules.length;
    }

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
	int contar = app.contarLletres("Tenc quatre paraules guays");
	System.out.println("Compta de paraules: " + contar);
    }
}
