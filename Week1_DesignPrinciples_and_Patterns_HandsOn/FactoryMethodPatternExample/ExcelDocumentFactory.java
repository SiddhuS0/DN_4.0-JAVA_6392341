package FactoryMethodPatternExample;

public class ExcelDocumentFactory  extends DocumentFactory{
    public Document createDoc(){
        return new ExcelDocument();
    }
}
