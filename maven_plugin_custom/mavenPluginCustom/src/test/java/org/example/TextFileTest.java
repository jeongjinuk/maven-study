package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TextFileTest {

    @Test
    @DisplayName("텍스트 파일의 내용이 숫자 인지 아닌지 판별")
    void isNumber() {
        TextFile textFile = new TextFile();
        String path = Paths.get("").toAbsolutePath().toString();
        path += "\\src\\test\\resources\\test.txt";
        System.out.println(path);
        String s = verifyString(path);
        boolean number = textFile.isNumber(s);
        assertFalse(number);
    }

    public String verifyString(String FilePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath)))){
            String s = reader.readLine();
            System.out.println(s +"!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return reader.readLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}