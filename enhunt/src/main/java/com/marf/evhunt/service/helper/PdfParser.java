/**
 * 
 */
package com.marf.evhunt.service.helper;

/**
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 * Convert Pdf to Text
 * 
 * @author ahmeddammak
 *
 */
public class PdfParser {

	private final static Logger LOGGER = Logger.getLogger(PdfParser.class);

	public static Optional<String> getTextFromPdf(String pdfFilePath) {
		System.out.println(pdfFilePath);
		String result = null;
		try (PDDocument document = PDDocument.load(new File(pdfFilePath))) {
			// document.getClass();
			if (!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				String pdfFileInText = tStripper.getText(document);
				// split by whitespace
				String lines[] = pdfFileInText.split("\\r?\\n");
				result = String.join("\n", Arrays.asList(lines));
			}
		} catch (InvalidPasswordException e) {
			LOGGER.error("Invalid Password", e);
		} catch (IOException e) {
			LOGGER.error("IO Exception", e);
		}
		return Optional.ofNullable(result);
	}
}
