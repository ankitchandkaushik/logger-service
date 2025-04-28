public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ILogger consoleLogger = ConsoleLogger.getInstance();
        consoleLogger.setLogLevel(Type.ERROR);

        ILogger fileLogger = FileLogger.getInstance();
        fileLogger.setLogLevel(Type.DEBUG);

        consoleLogger.log("Writing to console info", Type.INFO);
        consoleLogger.log("Writing to console debug", Type.DEBUG);
        consoleLogger.log("Writing to console error", Type.ERROR);

        fileLogger.log("Writing to file info", Type.INFO);
        fileLogger.log("Writing to file debug", Type.DEBUG);
        fileLogger.log("Writing to file error", Type.ERROR);

    }
}
