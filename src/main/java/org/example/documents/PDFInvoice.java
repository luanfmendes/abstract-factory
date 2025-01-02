package org.example.documents;

public class PDFInvoice implements Document{
    @Override
    public void generate() {
        System.out.println("Gerando fatura em PDF...");
    }
}
