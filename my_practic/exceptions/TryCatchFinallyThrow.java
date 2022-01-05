package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchFinallyThrow {

    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Vdem horoshego dnya!");
    }

    void def() {
        System.out.println("privet");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Bil poiman Exception  :" + e);
        }
    }

    public static void main(String[] args) {
        TryCatchFinallyThrow t = new TryCatchFinallyThrow();
        t.def();
    }

}