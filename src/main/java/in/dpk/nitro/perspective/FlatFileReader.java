package in.dpk.nitro.perspective;

import in.dpk.nitro.beans.Details;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.Map;

public class FlatFileReader {

    public void doRead() {
        // create a BeanIO StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file from the working directory
        factory.load("mapping.xml");

        // create a BeanReader to read from "input.csv"
        BeanReader in = factory.createReader("contacts", new File("input.csv"));

        Object record = null;

        // read records from "input.csv"
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
