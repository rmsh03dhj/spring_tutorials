package com.spring.basics;

import java.io.File;

/**
 * Created by:
 * User: Ramesh Dhoju
 * Date: 2/4/2020
 * Time: 5:49 PM
 */
public class DirectCallingExample {
    public static void main(String[] args) {
        Parser parser = new EdiFileParser();
        parser.parse(new File("edi_format.txt"));
    }
}
