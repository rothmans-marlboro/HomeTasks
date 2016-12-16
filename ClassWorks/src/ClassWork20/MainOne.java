package ClassWork20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class MainOne {
	public static void main(String args[]) {
		boolean coordX = false;
		boolean coordY = false;
		boolean unitD = false;
		String x = null;
		String y = null;
		String unit = null;
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/ClassWork20/pointList.xml"));
			System.out.println("pointList");
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("x"))
						coordX = true;
					else if (reader.getLocalName().equals("y"))
						coordY = true;
					else if (reader.getLocalName().equals("unit"))
						unitD = true;
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (coordX) {
						x = reader.getText();
						coordX = false;
					} else if (coordY) {
						y = reader.getText();
						coordY = false;
					} else if (unitD) {
						unit = reader.getText();
						unitD = false;
					}
				} else if (res == XMLStreamConstants.END_ELEMENT && "point".equals(reader.getLocalName())) {
					System.out.print("point: " + x + unit);
					System.out.print(", " + y);
					System.out.println(unit);
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}