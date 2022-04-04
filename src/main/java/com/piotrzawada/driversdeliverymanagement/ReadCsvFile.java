
package com.piotrzawada.driversdeliverymanagement;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ReadCsvFile {


    public static CSVParser getCsvParser(String csvFile) throws IOException {
            Reader reader = Files.newBufferedReader(Paths.get(csvFile));
            CSVParser parser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
            return parser;
        }
    }
