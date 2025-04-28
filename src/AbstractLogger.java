public abstract class AbstractLogger implements ILogger {
    protected Type type = Type.INFO;

    @Override
    public abstract void log(String message, Type type);
    
    @Override
    public void setLogLevel(Type type) {
        this.type = type;
    }


    public boolean shouldLog(Type type) {
        return this.type.level() <= type.level();
    }


}
