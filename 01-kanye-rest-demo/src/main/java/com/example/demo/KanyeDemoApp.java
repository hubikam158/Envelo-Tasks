package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.example.demo.entity.KanyeEntity;
import com.example.demo.webclient.kanye.KanyeClient;

public class KanyeDemoApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(KanyeDemoApp.class.getName());
    private static KanyeClient kanyeClient = new KanyeClient();
    private static KanyeEntity kanyeEntity;
    private static List<KanyeEntity> entities = new ArrayList<KanyeEntity>();
	
	public static void main(String[] args) {
		
		printQuote();
	}

    private static void printQuote() {

        boolean end = false;
    	while (!end) {
            switch (scanner.nextLine()) {
                case "next":
                	kanyeEntity = kanyeClient.getKanyeQuote();
                	if (!findEntityByQuote(kanyeEntity.getQuote())) {
                		entities.add(kanyeEntity);
                		logger.info(kanyeEntity.getQuote());
                	} else {
                		logger.info("Quote already exist");
                	}
                    break;
                case "exit":
                	end = true;
                	logger.info("Closing the program...");
                    break;
                default:
                    logger.info("Wrong input, try again");
                    break;
            }
        }
    }
    
    private static boolean findEntityByQuote(String quote) {
    	
    	for (KanyeEntity tempEntity : entities) {
    		if (tempEntity.getQuote().equals(quote)) {
    			return true;
    		}
    	}
    	return false;
    }
}
