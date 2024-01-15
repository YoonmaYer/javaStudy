package poly.car;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe;에서 형변환이 생략된 상태
        //car.water();  <- 컴파일 에러, 부모는 자식의 메서드를 호출 못함
        fe2 = (FireEngine)car;  // 자손 타입 <- 조상 타입
        fe2.water();
    }


    }

