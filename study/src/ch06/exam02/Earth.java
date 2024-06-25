package ch06.exam02;

public class Earth {
    //상수선언및초기화
    static final double EARTH_RADIUS = 6400;
    //상수선언
    static final double EARTH_SURFACE_AREA;
    //정적블록에서상수초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
