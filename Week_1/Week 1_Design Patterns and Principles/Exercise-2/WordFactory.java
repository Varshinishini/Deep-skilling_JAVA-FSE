package FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {
    public  Document createDocument(){
        
        
        return new Word();
        
    }
    
}
