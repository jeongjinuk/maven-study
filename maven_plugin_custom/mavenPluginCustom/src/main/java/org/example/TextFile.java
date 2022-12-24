package org.example;

import java.io.*;

public class TextFile {



    public boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
