package org.bank.risk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Arrays;
import java.util.List;

public class App {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
       // MDC.put("logFileName","FileProcessor");
        LOGGER.info( "FileProcessing" );
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(int i : ints){
            LOGGER.info(String.valueOf(i));
        }
    }
}
