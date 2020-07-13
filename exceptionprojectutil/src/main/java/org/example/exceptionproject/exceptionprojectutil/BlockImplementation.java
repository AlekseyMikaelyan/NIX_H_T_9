package org.example.exceptionproject.exceptionprojectutil;

import java.util.ArrayList;
import java.util.List;

public class BlockImplementation implements Block {

    @Override
    public void run() throws Exception {
        int number = (int) (Math.random() * 10);
        if(number < 5) {
            System.out.print(number);
        } else {
            throw new Exception();
        }
    }
}
