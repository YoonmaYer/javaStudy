package interface1.parse;

class HTMLParser implements  Parseable {
    public void parse(String fileName) {
        // 구문 분석작업 수행 코드
        System.out.println(fileName + "-HTML parsing complete.");
    }
}
