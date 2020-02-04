package com.spring.basics;

import java.io.File;

/**
 * Created by:
 * User: Ramesh Dhoju
 * Date: 2/4/2020
 * Time: 5:52 PM
 */
public class UsingHelperClassExample {
    public static void main(String[] args) {
        FileParserHelper fileParserHelper = new FileParserHelper(new EdiFileParser());
        fileParserHelper.parseFile(new File("edi_format.txt"));
    }
}