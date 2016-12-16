package TaskModulTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class TaskModulTwo {

	public static void main(String[] args) {
		boolean isName = false;
		boolean isSoil = false;
		boolean isOrigin = false;
		boolean isColour = false;
		boolean isLength = false;
		boolean isTemperature = false;
		boolean isWatering = false;
		boolean isMultiplying = false;
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/TaskModulTwo/TaskModulTwoFile.xml"));
			System.out.println("Galery");
			System.out.println();
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("name"))
						isName = true;
					else if (reader.getLocalName().equals("soil"))
						isSoil = true;
					else if (reader.getLocalName().equals("origin"))
						isOrigin = true;
					else if (reader.getLocalName().equals("colour"))
						isColour = true;
					else if (reader.getLocalName().equals("length"))
						isLength = true;
					else if (reader.getLocalName().equals("temperature"))
						isTemperature = true;
					else if (reader.getLocalName().equals("watering"))
						isWatering = true;
					else if (reader.getLocalName().equals("multiplying"))
						isMultiplying = true;
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (isName) {
						System.out.print("Name: " + reader.getText());
						System.out.println();
						isName = false;
					} else if (isSoil) {
						System.out.print("Soil: " + reader.getText());
						System.out.println();
						isSoil = false;
					} else if (isOrigin) {
						System.out.print("Origin: " + reader.getText());
						System.out.println();
						isOrigin = false;
					} else if (isColour) {
						System.out.print("Colour: " + reader.getText());
						System.out.println();
						isColour = false;
					} else if (isLength) {
						System.out.print("Length: " + reader.getText()+"sm");
						System.out.println();
						isLength = false;
					} else if (isTemperature) {
						System.out.print("Temperature: " + reader.getText()+"C");
						System.out.println();
						isTemperature = false;
					} else if (isWatering) {
						System.out.print("Watering: " + reader.getText()+"ml");
						System.out.println();
						isWatering = false;
					} else if (isMultiplying) {
						System.out.print("Multiplying: " + reader.getText());
						System.out.println();
						System.out.println();
						isMultiplying = false;
					}
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}