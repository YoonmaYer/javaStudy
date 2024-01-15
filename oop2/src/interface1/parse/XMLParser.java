package interface1.parse;

class XMLParser implements Parseable {
    public void parse(String fileName) {
        // 구문 분석 작업
        System.out.println(fileName + "- XML parsing complete.");
    }
}
