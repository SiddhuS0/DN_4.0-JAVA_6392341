package FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
    public Document createDoc(){
        return new PdfDocument();
    }
}
