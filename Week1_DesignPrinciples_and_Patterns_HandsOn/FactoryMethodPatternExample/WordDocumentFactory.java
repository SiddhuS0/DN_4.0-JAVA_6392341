package FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{
    public Document createDoc(){
        return new WordDocument();
    }
}
