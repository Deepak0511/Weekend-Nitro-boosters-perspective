package in.dpk.nitro.perspective.core;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.List;

public class FlatFileWriter {

    private File outFile;
    private File mappingFile;

    /**
     * @param mappingFile BeanIO mapping file
     * @param outFile     Output file
     */
    public FlatFileWriter(File mappingFile, File outFile) {
        this.outFile = outFile;
        this.mappingFile = mappingFile;
    }

    public void doWrite(List<Object> objects, String streamName) {

        // create a BeanIO StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file from the working directory
        factory.load(mappingFile);

        // create a BeanWriter to write to output file
        final BeanWriter out = factory.createWriter(streamName, outFile);


        for (Object o : objects) {
            System.out.println("Writing :: " + o.toString());
            out.write(o);
        }

        out.flush();
        out.close();

    }
}
