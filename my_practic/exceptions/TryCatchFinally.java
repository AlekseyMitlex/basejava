package exceptions;

public class TryCatchFinally {

    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("U nas est massiv");

        try {
            System.out.println(array[5]);
            System.out.println("Vdem horoshego dnya!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bil poiman Exception, potomu 4to kod krovoi((   :" + e);
        }

        finally {
            System.out.println("etot block vsrgda vivoditsya");
        }

        System.out.println("Dannyi kod ne imeet otnosheniya k zadache");
    }
}
