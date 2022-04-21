public class gfgfgfgfgfg<git> {
    public static void main(String[] args) {
        String x = null;
        printStringSize(x);
        printStringSize("Не представляю своей жизни без ветвлений...");
        printStringSize(null);
        printStringSize("Ифы это так захватывающе!");
    }

    static void printStringSize(String string) {
        if (string != null) {
            System.out.println("Кол-во символов в строке `" + string + "`=" + string.length());
        }
    }
}




