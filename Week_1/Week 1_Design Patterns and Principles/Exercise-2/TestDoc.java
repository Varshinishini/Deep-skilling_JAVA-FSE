package FactoryMethodPatternExample;



public class TestDoc {
    public static void main(String[] args) {
        DocumentFactory d=new WordFactory();
        Document d1=d.createDocument();
        d1.open();

        DocumentFactory p=new PdfFactory();
        Document p1=p.createDocument();
        p1.open();

        DocumentFactory e=new ExcelFactory();
        Document e1=e.createDocument();
        e1.open();


            
        
    }
}
