class BlockTest {
    static {
        System.out.println("static { }");       // 클래스 초기화 블럭, 한 번만 실행됨
    }
    {
        System.out.println(" { } ");            // 인스턴스 초기화 블럭, 생성자와 같이 인스턴스가 생성될 때마다 실행됨
    }

    public BlockTest(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest(); // 인스턴스 생성1

        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest(); // 인스턴스 생성2
    }
}
