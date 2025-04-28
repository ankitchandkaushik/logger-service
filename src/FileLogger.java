import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileLogger extends AbstractLogger {

    private FileLogger () {}

    private static class FileLoggerHalper {
        private static FileLogger instance = new FileLogger();
    }

    public static FileLogger getInstance() {
        return FileLoggerHalper.instance;
    }

    @Override
    public void log(String message, Type type) {
        if(shouldLog(type)) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
                writer.write(message);
                writer.write("\n");
            } catch (Exception e) {
               System.out.println("Exception occured while logging using file logger");
            }
        }
    }
    
}
