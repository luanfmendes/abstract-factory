# Abstract Factory Pattern - Exemplo em Java

Este repositório apresenta um exemplo do uso do padrão **Abstract Factory** em Java para criar diferentes tipos de documentos (como Faturas e Relatórios) em diferentes formatos (PDF e HTML).

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Document**: Interface comum para todos os documentos.
- **PDFInvoice e PDFReport**: Implementações concretas de documentos PDF.
- **HTMLInvoice e HTMLReport**: Implementações concretas de documentos HTML.
- **DocumentFactory**: Interface para as fábricas abstratas.
- **PDFDocumentFactory e HTMLDocumentFactory**: Fábricas concretas para criação de documentos em PDF e HTML, respectivamente.

## Tecnologias Utilizadas

- **Java 11** ou superior
- **JUnit 5** para testes unitários

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/luanfmendes/abstract-factory.git
   ```
2. Compile o projeto:
   ```bash
   javac -d bin src/**/*.java
   ```
3. Execute o projeto:
   ```bash
   java -cp bin com.exemplo.documentfactory.Main
   ```
4. Execute os testes:
   ```bash
   java -cp bin:lib/junit-jupiter-api-5.x.x.jar:lib/junit-jupiter-engine-5.x.x.jar org.junit.platform.console.ConsoleLauncher --select-class com.exemplo.documentfactory.test.DocumentFactoryTest
   ```

## Estrutura de Pastas

```
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   ├── exemplo/
│   │   │   │   ├── documentfactory/
│   │   │   │   │   ├── documents/
│   │   │   │   │   │   ├── Document.java
│   │   │   │   │   │   ├── PDFInvoice.java
│   │   │   │   │   │   ├── PDFReport.java
│   │   │   │   │   │   ├── HTMLInvoice.java
│   │   │   │   │   │   ├── HTMLReport.java
│   │   │   │   │   ├── factories/
│   │   │   │   │   │   ├── DocumentFactory.java
│   │   │   │   │   │   ├── PDFDocumentFactory.java
│   │   │   │   │   │   ├── HTMLDocumentFactory.java
│   │   │   │   │   ├── Main.java
├── test/
│   ├── java/
│   │   ├── com/
│   │   │   ├── exemplo/
│   │   │   │   ├── documentfactory/
│   │   │   │   │   ├── test/
│   │   │   │   │   │   ├── DocumentFactoryTest.java
```
## Exemplo de Uso

```java
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

## Testes Unitários

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentFactoryTest {

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
```

---

## Licença

Este projeto está licenciado sob os termos da [MIT License](LICENSE).
