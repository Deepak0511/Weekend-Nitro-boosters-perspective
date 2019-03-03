package in.dpk.nitro.perspective;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import java.io.File;
import java.util.List;

public class FlatFileWriter {


    public void doWrite(List<Object> objects, String streamName) {

        // create a BeanIO StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file from the working directory
        factory.load("src/main/resources/mapping.xml");

        // create a BeanWriter to write to "output.csv"
        final BeanWriter out = factory.createWriter(streamName, new File("./target/output.flf"));


        for (Object o : objects) {
            System.out.println("Writing :: " + o.toString());
            out.write(o);
        }

        out.flush();
        out.close();

    }
}
