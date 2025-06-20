//package Assignment.Design_Pattern.FactoryMethodPatternExample;

interface doctype {
    void createDocument();
}

class WordDocument implements doctype {
    public void createDocument() {
        System.out.println("Word Document Created");
    }
}

class PdfDocument implements doctype {
    public void createDocument() {
        System.out.println("PDF Document Created");
    }
}

class ExcelDocument implements doctype {
    public void createDocument() {
        System.out.println("Excel Document Created");
    }
}

class DocumentFactory {
    public static doctype getdocument(String doctype) {
        if (doctype == null) {
            return null;
        } else if (doctype.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (doctype.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (doctype.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        } else {
            return null;
        }
    }
}


public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        doctype doc = DocumentFactory.getdocument("word");
        doctype pdf = DocumentFactory.getdocument("pdf");
        doctype excl = DocumentFactory.getdocument("excel");

        doc.createDocument();
        pdf.createDocument();
        excl.createDocument();
    }
}
