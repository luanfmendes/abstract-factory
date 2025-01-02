package factories;

import org.example.documents.*;
import org.example.factories.DocumentFactory;
import org.example.factories.HTMLDocumentFactory;
import org.example.factories.PDFDocumentFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentFactoryTest {
    @Test
    void testPDFDocumentFactory() {
        DocumentFactory factory = new PDFDocumentFactory();

        Document invoice = factory.createInvoice();
        assertTrue(invoice instanceof PDFInvoice, "Deve criar uma fatura em PDF");
        invoice.generate();

        Document report = factory.createReport();
        assertTrue(report instanceof PDFReport, "Deve criar um relatório em PDF");
        report.generate();
    }

    @Test
    void testHTMLDocumentFactory() {
        DocumentFactory factory = new HTMLDocumentFactory();

        Document invoice = factory.createInvoice();
        assertTrue(invoice instanceof HTMLInvoice, "Deve criar uma fatura em HTML");
        invoice.generate();

        Document report = factory.createReport();
        assertTrue(report instanceof HTMLReport, "Deve criar um relatório em HTML");
        report.generate();
    }
}
