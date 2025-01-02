package org.example;

import org.example.documents.Document;
import org.example.factories.DocumentFactory;
import org.example.factories.HTMLDocumentFactory;
import org.example.factories.PDFDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfInvoice = pdfFactory.createInvoice();
        pdfInvoice.generate();

        DocumentFactory htmlFactory = new HTMLDocumentFactory();
        Document htmlReport = htmlFactory.createReport();
        htmlReport.generate();
    }
}