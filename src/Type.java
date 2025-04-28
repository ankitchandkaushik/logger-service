public enum Type {
    INFO(1),
    DEBUG(2),
    ERROR(3);

    public final int level;

    Type (int level) {
        this.level = level;
    }

    public int level() {
        return this.level;
    }
}
