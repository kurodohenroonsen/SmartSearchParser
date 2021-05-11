package be.aktina.smartsearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import be.aktina.smartsearch.model.Context;
import be.aktina.smartsearch.model.ConvenienceLevelPercent;
import be.aktina.smartsearch.model.HasAllergen;
import be.aktina.smartsearch.model.LanguageValue;
import be.aktina.smartsearch.model.Mesure;
import be.aktina.smartsearch.model.NutrientBasis;
import be.aktina.smartsearch.model.RootObject;
import be.aktina.smartsearch.model.SchemaSValue;
import be.aktina.smartsearch.model.Simage;
import be.aktina.smartsearch.model.SimpleCode;
import be.aktina.smartsearch.model.organization.Organization;
import be.aktina.smartsearch.model.organization.ScontactPoint;
import be.aktina.smartsearch.model.organization.Sname;

public class JacksonGeneratorFromOpenFoodFact {
	private static final String sourceFile = "/Volumes/APPLE SSD SM2048L Media/Users/kurodo/Documents/en.openfoodfacts.org.products.csv";
	private static final String destinationDirectory = "/Volumes/APPLE SSD SM2048L Media/Users/kurodo/Documents/OpenFoodFactResult/";

	public static void main(String args[]) {
		try {
			File openfoodfactCSV = new File(sourceFile);
			FileReader fr = new FileReader(openfoodfactCSV); // reads the file
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
			StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
			String line;
			int cpt = 1;
			while ((line = br.readLine()) != null) {
				String[] offLine = line.split("	");
				if (cpt != 1 && offLine.length >= 178) {
					System.err.println(cpt + " offLine.length " +offLine.length);
					RootObject product = new RootObject();
					product.setContext(new Context());

			
					product.setGtin(offLine[0]);

					LanguageValue languageValue = new LanguageValue();
					languageValue.setValue(offLine[7]);
					product.setSname(new LanguageValue[1]);
					product.getSname()[0] = languageValue;
					


					languageValue = new LanguageValue();
					languageValue.setValue(offLine[9]);
					product.setFunctionalName(new LanguageValue[1]);
					product.getFunctionalName()[0] = languageValue;
					

					/*nList = doc.getElementsByTagName("netContent");
					for (int temp = 0; temp < nList.getLength(); temp++) {
						Node nNode = nList.item(temp);

						Mesure mesure = new Mesure();
						SchemaSValue sValue = new SchemaSValue();
						sValue.setValue(nNode.getTextContent());
						sValue.setType("xsd:float");
						mesure.setSvalue(sValue);

						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;

							mesure.setSunitCode(eElement.getAttribute("measurementUnitCode"));
						}
						mesure.setType(new String[] { "gs1:QuantitativeValue", "s:QuantitativeValue" });
						product.setNetContent(mesure);
					}*/

					
					languageValue = new LanguageValue();
					languageValue.setValue(offLine[37]);
					product.setIngredientStatement(new LanguageValue[1]);
					
					product.getIngredientStatement()[0] = languageValue;
					

					/*nList = doc.getElementsByTagName("consumerStorageInstruction");
					for (int temp = 0; temp < nList.getLength(); temp++) {
						Node nNode = nList.item(temp);
						LanguageValue languageValue = new LanguageValue();
						languageValue.setValue(nNode.getTextContent());
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;
							languageValue.setLanguage(eElement.getAttribute("languageCode"));
						}
						if (product.getConsumerStorageInstructions() == null) {
							product.setConsumerStorageInstructions(new LanguageValue[nList.getLength()]);
						}
						product.getConsumerStorageInstructions()[temp] = languageValue;
					}*/

					
					Simage simage = new Simage();

							
					simage.setType(new String[] { "gs1:ReferencedFileDetails", "s:ImageObject" });
					SimpleCode surl = new SimpleCode();
					surl.setId(offLine[69]);
					simage.setSurl(surl);
					product.setSimage(simage);
				



					NutrientBasis nutrientBasis = new NutrientBasis();
					//"ENER-
					ConvenienceLevelPercent convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[76]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("E14");
					product.setEnergyPerNutrientBasis(nutrientBasis);
					
					
					//"FAT"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[79]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setFatPerNutrientBasis(nutrientBasis);

					//"FASAT"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[80]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setSaturatedFatPerNutrientBasis(nutrientBasis);

					//"CHOAVL"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[115]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setCholesterolPerNutrientBasis(nutrientBasis);
					
					//"SUGAR-"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[116]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setSugarsPerNutrientBasis(nutrientBasis);

					//"PRO-"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[128]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setProteinPerNutrientBasis(nutrientBasis);

					//"FIBTG"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[125]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setFibrePerNutrientBasis(nutrientBasis);

					//"SALTEQ"
					nutrientBasis = new NutrientBasis();
					nutrientBasis.setType("gs1:NutritionMeasurementType");
					convenienceLevelPercent = new ConvenienceLevelPercent();
					convenienceLevelPercent.setValue(offLine[132]);
					nutrientBasis.setSvalue(convenienceLevelPercent);
					nutrientBasis.setSunitCode("GRM");
					product.setSaltPerNutrientBasis(nutrientBasis);


					if(!"".contentEquals(offLine[57])) {
						product.setPackagingMarkedLabelAccreditation(new SimpleCode[0]);
						SimpleCode nutriscore = new SimpleCode();
						nutriscore.setId(offLine[57]);
						product.getPackagingMarkedLabelAccreditation()[0] = nutriscore;
					}


									
								
								
					/*
					nList = doc.getElementsByTagName("allergen");
					if (nList.getLength() > 0) {
						product.setHasAllergen(new HasAllergen[nList.getLength()]);
					}

					for (int temp = 0; temp < nList.getLength(); temp++) {
						HasAllergen hasAllergen = new HasAllergen();
						hasAllergen.setType("gs1:AllergenDetails");

						Node nNode = nList.item(temp);
						Element eElement = (Element) nNode;
						NodeList nList2 = eElement.getChildNodes();
						for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
							Node nNode2 = nList2.item(temp2);
							if (nNode2 != null && "allergenTypeCode".contentEquals(nNode2.getNodeName())) {
								SimpleCode allergenTypeCode = new SimpleCode();
								allergenTypeCode.setId("gs1:AllergenTypeCode-" + nNode2.getTextContent());
								hasAllergen.setAllergenType(allergenTypeCode);
							}
							if (nNode2 != null && "levelOfContainmentCode".contentEquals(nNode2.getNodeName())) {
								SimpleCode allergenLevelOfContainmentCode = new SimpleCode();
								allergenLevelOfContainmentCode
										.setId("gs1:LevelOfContainmentCode-" + nNode2.getTextContent());
								hasAllergen.setAllergenLevelOfContainmentCode(allergenLevelOfContainmentCode);
							}

						}
						product.getHasAllergen()[temp] = hasAllergen;
					}
					nList = doc.getElementsByTagName("nutriscore");
					product.setPackagingMarkedLabelAccreditation(new SimpleCode[nList.getLength()]);
					for (int temp = 0; temp < nList.getLength(); temp++) {
						Node nNode = nList.item(temp);
						SimpleCode nutriscore = new SimpleCode();
						nutriscore.setId(nNode.getTextContent());
						product.getPackagingMarkedLabelAccreditation()[temp] = nutriscore;

					}
					nList = doc.getElementsByTagName("brandOwner");
					for (int temp = 0; temp < nList.getLength(); temp++) {
						Organization manufacturer = new Organization();
						manufacturer.setOrganizationRole("gs1:OrganizationRole-BRAND_OWNER");
						Node nNode = nList.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;
							NodeList nList2 = eElement.getChildNodes();

							for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
								Node nNode2 = nList2.item(temp2);
								if (nNode2 != null && "gln".equals(nNode2.getNodeName())) {
									manufacturer.setGlobalLocationNumber(nNode2.getTextContent());
								}
								if (nNode2 != null && "partyName".equals(nNode2.getNodeName())) {
									manufacturer.setSname(new Sname[1]);
									Sname sname = new Sname();
									sname.setValue(nNode2.getTextContent());
									manufacturer.getSname()[0] = sname;
								}
							}
						}

						product.setSmanufacturer(manufacturer);

					}

					nList = doc.getElementsByTagName("contactInformation");
					for (int temp = 0; temp < nList.getLength(); temp++) {
						ScontactPoint scontactPoint = new ScontactPoint();
						Node nNode = nList.item(temp);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {

							scontactPoint.setContactTitle(new Sname[1]);
							Element eElement = (Element) nNode;
							NodeList nList2 = eElement.getChildNodes();

							for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
								Node nNode2 = nList2.item(temp2);
								if (nNode2 != null && "contactAddress".equals(nNode2.getNodeName())) {
									Sname contactTitle = new Sname();
									contactTitle.setValue(nNode2.getTextContent());
									scontactPoint.getContactTitle()[0] = contactTitle;
								}

							}
						}
						if (product.getSmanufacturer() == null) {
							Organization manufacturer = new Organization();
							manufacturer.setOrganizationRole("gs1:OrganizationRole-BRAND_OWNER");
							product.setSmanufacturer(manufacturer);
						}
						product.getSmanufacturer().setScontactPoint(scontactPoint);

					}
*/
					JacksonGeneratorFromOpenFoodFact tester = new JacksonGeneratorFromOpenFoodFact();
					tester.writeJSON(product, product.getGtin() + ".json");

				}
				cpt++;
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private void writeJSON(RootObject product, String fileName)
			throws JsonGenerationException, JsonMappingException, IOException {
	
		File GLNDirectory = new File(destinationDirectory);
		GLNDirectory.mkdir();
		File SubGLNDirectory = new File(destinationDirectory+fileName.substring(0,3));
		SubGLNDirectory.mkdir();
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(SubGLNDirectory+"/" + fileName), product);
	}

}
