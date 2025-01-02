package org.example.factories;

import org.example.documents.Document;
import org.example.documents.HTMLInvoice;
import org.example.documents.HTMLReport;

public class HTMLDocumentFactory implements DocumentFactory {
    @Override
    public Document createInvoice() {
        return new HTMLInvoice();
    }

    @Override
    public Document createReport() {
        return new HTMLReport();
    }
}
