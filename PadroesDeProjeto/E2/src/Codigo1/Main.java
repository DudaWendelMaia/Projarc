package Codigo1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Este é o primeiro log.");
        logger.log("Este é o segundo log.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Este é o terceiro log.");

        System.out.println(logger == anotherLogger);
    }
}
