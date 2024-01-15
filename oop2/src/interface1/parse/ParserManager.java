package interface1.parse;

import org.xml.sax.helpers.ParserAdapter;

class ParserManager {
    // 리턴타입: Parserable 인터페이스
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
            // return new HTMLParser();
        }
    }
}
