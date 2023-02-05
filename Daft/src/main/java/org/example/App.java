package org.example;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );

        System.out.println("Hello world!");
        ScriptPython s = new ScriptPython();
        ArrayList<Apartments> list = new ArrayList<>();
        s.runScript(list);

        Daft7Test d = new Daft7Test();
        ArrayList<String> errors = new ArrayList<>();
        for(Apartments link : list){
            System.out.println(link.getLink());
            try {
                d.daft7(link.getLink());
            }catch (Exception e){
                errors.add(link.getLink());
            }
        }

        for(String e : errors){
            System.out.println(e);
        }

    }
}
