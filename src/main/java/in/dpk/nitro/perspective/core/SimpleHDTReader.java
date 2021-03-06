package in.dpk.nitro.perspective.core;

import in.dpk.nitro.beans.Details;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.Map;

public class SimpleHDTReader {

    private File mappingFile;

    public SimpleHDTReader(File mappingFile) {
        this.mappingFile = mappingFile;
    }

    public void doRead(String stream, File inputFile) {
        // create a BeanIO StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file from the working directory
        factory.load(mappingFile);

        // create a BeanReader to read from input file
        BeanReader in = factory.createReader(stream, inputFile);

        Object record = null;

        // read records from "input"
        while ((record = in.read()) != null) {

            // process each record
            if ("header".equals(in.getRecordName())) {
                Map<String, Object> header = (Map<String, Object>) record;
                System.out.println(header.get("fileDate"));
            } else if ("details".equals(in.getRecordName())) {
                Details details = (Details) record;
                System.out.println(details.toString());
            } else if ("trailer".equals(in.getRecordName())) {
                Integer recordCount = (Integer) record;
                System.out.println(recordCount + " contacts processed");
            }

        }

        in.close();

    }
}
