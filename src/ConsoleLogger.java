public class ConsoleLogger extends AbstractLogger{
    
    private ConsoleLogger() {}


    private static class ConsoleLoggerHelper {
        private static final ConsoleLogger instance = new ConsoleLogger();
    }

    public static ConsoleLogger getInstance() {
        return ConsoleLoggerHelper.instance;
    }

    public void log(String message, Type type) {
        if(shouldLog(type)) {
            System.out.println(message);
        }
    }
}
