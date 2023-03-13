interface Parserable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴타입이 Paserable인터페이스이다.
    public static Parserable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
           /* Parserable p = new HTMLParser();
            return p; */
            return new HTMLParser();
        }
    }
}

class HTMLParser implements Parserable {
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}


class XMLParser implements Parserable {
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-XML parsing completed.");
    }
}

class ParserTest {
    public static void main(String[] args) {
        Parserable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}