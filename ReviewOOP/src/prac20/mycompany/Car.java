package prac20.mycompany;

import prac20.hankook.SnowTire;
import prac20.hyundai.Engine;
import prac20.kumho.BigWidthTire;


public class Car {
    //Field
    Engine engine = new Engine();
    SnowTire tire = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();

    // 컴파일러에게 정확히 명시해줘야 오류가 나지 않음
    prac20.hankook.Tire tire3 = new prac20.hankook.Tire();
    prac20.kumho.Tire tire4 = new prac20.kumho.Tire();
}
