package org.example.documents;

public class PDFReport implements Document{
    @Override
    public void generate() {
        System.out.println("Gerando relatório em PDF...");
    }
}
