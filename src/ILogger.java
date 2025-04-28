public interface ILogger {

    public void log(String message, Type type);
    public void setLogLevel(Type type);
}