package com.spring.basics;

import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by:
 * User: Ramesh Dhoju
 * Date: 2/4/2020
 * Time: 3:20 PM
 */
@Component
public class EdiFileParser implements Parser {
    public File parse(File inputFile){
        File output = new File("edi_to_CSV.csv");
        System.out.println("Parsing Edi file format to CSV");
        //implementation to parse file
        return output;
    }
}
