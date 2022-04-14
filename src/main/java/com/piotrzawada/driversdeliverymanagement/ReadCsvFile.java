package com.piotrzawada.driversdeliverymanagement;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class ReadCsvFile {


    public static CSVParser getCsvParser(String dataType) throws IOException {
        JFileChooser chooser = new JFileChooser("data/",FileSystemView.getFileSystemView());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV File", "csv");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle(String.format("Choose file with %s data" , dataType));
        int r = chooser.showOpenDialog(null);

        if (r == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
            Reader reader = Files.newBufferedReader(Paths.get(selectedFile.getAbsolutePath()));
            return new CSVParser(reader, CSVFormat.DEFAULT);
        }
        return null;
    }
}
