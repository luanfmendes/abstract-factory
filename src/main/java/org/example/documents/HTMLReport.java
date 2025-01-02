package org.example.documents;

public class HTMLReport implements Document {
    @Override
    public void generate() {
        System.out.println("Gerando relatório em HTML...");
    }
}
