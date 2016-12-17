package ClassWork21;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {

	public static void main(String[] args) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer(new StreamSource("src/ClassWork21/NewFile.xsl"));
			transformer.transform(new StreamSource("src/ClassWork21/pointList.xml"), new StreamResult("new_TaskModulLastFile.html"));
			System.out.println("Transform " + " complete");
		} catch (TransformerException e) {
			System.err.println("Impossible transform file " + " : " + e);
		}
	}
}