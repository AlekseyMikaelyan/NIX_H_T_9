package org.example.exceptionproject.exceptionprojectutil;

import java.util.List;

public class Retry {

    public static void tryToLunchMethodRun(int attempt, Block block) throws Exception {
        int count = 0;
        for(int i = 0; i < attempt; i++) {
            Thread.sleep(1000 * count);
            count++;
            try{
                block.run();
                System.out.println(" - Попытка отработать код прошла успешно!");
            } catch (Exception e) {
                System.out.println("Исключение поймано!");
                if(count == attempt) {
                    throw new Exception();
                }
            }
        }

    }
}
