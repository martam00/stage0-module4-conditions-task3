package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        if ((int) symbol >= 1 && (int) symbol <= 127) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
