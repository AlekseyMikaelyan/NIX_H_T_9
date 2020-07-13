package org.example.exceptionproject.exceptionprojectmain;

import org.example.exceptionproject.exceptionprojectutil.BlockImplementation;
import org.example.exceptionproject.exceptionprojectutil.Retry;

public class Main {
    public static void main(String[] args) {
        try {
            Retry.tryToLunchMethodRun(5, new BlockImplementation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
