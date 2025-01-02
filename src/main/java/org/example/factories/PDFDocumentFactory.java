package org.example.factories;

import org.example.documents.Document;
import org.example.documents.PDFInvoice;
import org.example.documents.PDFReport;

public class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createInvoice() {
        return new PDFInvoice();
    }

    @Override
    public Document createReport() {
        return new PDFReport();
    }
}

