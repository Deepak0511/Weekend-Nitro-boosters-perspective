package in.dpk.nitro.perspective;

import java.io.File;

/**
 * @author deepak
 * Read a CSV file and convert it to Fixed length format file.
 */
public interface CSVToFixedLengthConverter {

    void setCSVDataFile(File csvDataFile);

    void setFixedLengthOutDir(String fixedLengthOutDir);

    void setMapping(File mappingFile);

    void setCSVStreamName(String csvStreamName);

    void setFixedLengthStreamName(String fixedLengthStreamName);
}
