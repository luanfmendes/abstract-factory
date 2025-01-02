package org.example.factories;

import org.example.documents.Document;

public interface DocumentFactory {
    Document createInvoice();
    Document createReport();
}
