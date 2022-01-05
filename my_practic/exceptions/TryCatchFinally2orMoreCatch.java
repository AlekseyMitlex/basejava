package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally2orMoreCatch {

    public static void main(String[] args) {
        File f = new File("test8.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("Vdem horoshego dnya!");
        } catch (FileNotFoundException e) {
            System.out.println("Bil poiman Exception  :" + e);
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Bil poiman NullPointerException  :" + e);
        } catch (IOException e) {
            System.out.println("Bil poiman IOException  :" + e);
        } finally {
            System.out.println("etot block vsrgda vivoditsya");
        }

        System.out.println("Dannyi kod ne imeet otnosheniya k zadache");
    }
}
