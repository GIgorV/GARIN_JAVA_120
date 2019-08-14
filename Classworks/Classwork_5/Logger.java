
// Применить паттерн Singleton и создать класс Logger.
// У Logger должен быть метод, который выводить сообщение на экран.
// Также Logger должен позволять программисту задавать префикс сообщения для вывода:
// Если у логгера префикс = 'MESSAGE' То значит при выводе сообщения на экран должно быть выведено:
// MESSAGE ТЕКСТ_СООБЩЕНИЯ
// logger.log("Hello")
// MESSAGE Hello

public class Logger {
    private static final Logger instance;

    private Logger() {
    }

	static {
        instance = new Logger();
    }

    public static Logger getLogger() {
        return instance;
    }

	private String prefix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void log(String message) {
        System.out.println(prefix + " " + message);
    }
}