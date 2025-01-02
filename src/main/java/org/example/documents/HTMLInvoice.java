package org.example.documents;

public class HTMLInvoice implements Document{
    @Override
    public void generate() {
        System.out.println("Gerando fatura em HTML...");
    }
}
