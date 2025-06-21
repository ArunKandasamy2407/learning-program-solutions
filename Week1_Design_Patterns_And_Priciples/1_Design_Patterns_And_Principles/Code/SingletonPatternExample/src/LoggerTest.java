public class LoggerTest {

    public void runTest() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logging from logger1.");
        logger2.log("Logging from logger2.");

        if (logger1 == logger2) {
            System.out.println("Singleton works: Both logger instances are the same.");
        } else {
            System.out.println("Singleton failed: Logger instances are different.");
        }
    }
}
