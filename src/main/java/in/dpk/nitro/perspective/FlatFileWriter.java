package in.dpk.nitro.perspective;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.List;

public class FlatFileWriter {

    private String outFileName;
    private String mappingFileName;

    /**
     * @param mappingFileName BeanIO mapping file
     * @param outFileName     Output file full name including directory
     */
    public FlatFileWriter(String mappingFileName, String outFileName) {
        this.outFileName = outFileName;
        this.mappingFileName = mappingFileName;
    }

    public void doWrite(List<Object> objects, String streamName) {

        // create a BeanIO StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file from the working directory
        factory.load(mappingFileName);

        // create a BeanWriter to write to output file
        final BeanWriter out = factory.createWriter(streamName, new File(outFileName));


        for (Object o : objects) {
            System.out.println("Writing :: " + o.toString());
            out.write(o);
        }

        out.flush();
        out.close();

    }
}
