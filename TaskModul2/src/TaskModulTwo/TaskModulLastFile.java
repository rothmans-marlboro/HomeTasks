package TaskModulTwo;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TaskModulLastFile {

	public static void main(String[] args) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer(new StreamSource("src/TaskModulTwo/TaskModulLastFile.xsl"));
			transformer.transform(new StreamSource("src/TaskModulTwo/TaskModulTwoFile.xml"), new StreamResult("src/TaskModulTwo/new_TaskModulLastFile.html"));
			System.out.println("Transform " + " complete");
		} catch (TransformerException e) {
			System.err.println("Impossible transform file " + " : " + e);
		}
	}
}