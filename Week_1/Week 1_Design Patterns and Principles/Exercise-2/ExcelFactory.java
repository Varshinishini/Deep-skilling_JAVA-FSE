package FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory{
    public  Document createDocument(){
        return new Excel();
    }
}
    

