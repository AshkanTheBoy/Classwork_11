package Classwork_25.log;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {

    private final static Logger logger = Logger.getLogger(LoggerDemo.class.getName());
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/files/holidays.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONArray holidays = new JSONArray(tokener);
            //System.out.println(holidays.get(0).toString());

            LogManager.getLogManager().reset();
            FileHandler fileHandler = new FileHandler("src/files/logfile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);


            for(Object holiday:holidays){
                String s = ((JSONObject)holiday).getString("name");
                logger.info(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
