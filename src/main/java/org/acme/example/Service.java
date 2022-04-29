package org.acme.example;

import java.util.HashMap;

public class Service {
    public static String useful(HashMap<String,Object> complex) {
        return "useful method " + complex.values();
    }
}
