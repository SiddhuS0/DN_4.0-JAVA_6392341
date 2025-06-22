package FactoryMethodPatternExample;
// testing 
public class Main {
    public static void main(String[] args){
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDoc();
        wordDoc.open();

        DocumentFactory pdfFactory = new WordDocumentFactory();
        Document pdfDoc = pdfFactory.createDoc();
        pdfDoc.open();

        DocumentFactory excelFactory = new WordDocumentFactory();
        Document excelDoc = excelFactory.createDoc();
        excelDoc.open();
    }
}
