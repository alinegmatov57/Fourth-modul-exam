import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FourthTask {
    private static final Logger log=Logger.getLogger(FourthTask.class.getName());

    public static void main(String[] args) {
        log.info("Info message");
        try {
            FileHandler fileHandler=new FileHandler("src/main/logger.txt",true);
            fileHandler.setLevel(Level.FINE);
            SimpleFormatter simpleFormatter=new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            log.addHandler(fileHandler);
            log.setLevel(Level.FINE);
            log.fine("This is fine");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
