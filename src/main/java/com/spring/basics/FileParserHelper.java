package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by:
 * User: Ramesh Dhoju
 * Date: 2/4/2020
 * Time: 3:15 PM
 */
@Component
public class FileParserHelper {

    @Autowired
    private Parser parser;

    public FileParserHelper(Parser parser){
        super();
        this.parser =parser;
    }

    public File parseFile(File input){
        return parser.parse(input);
    }
}
