public class Logger {
    private final static Logger instance;
    static {
        instance = new Logger();
    }
    private Logger(){

    }

    public static Logger getLogger() {
        return instance;
    }

    public void log(String message){
        System.out.println(prefix + " " + message);}

    private String prefix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
