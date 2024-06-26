package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;
// ctrl + alt + o : 안쓰는 import 제거

@Data
public class Member2 {
    private String id;
    @NonNull // 필수 항목 → @RequiredArgsConstructor에 의해 생성자 추가됨
    private String name;
    private int age;
}
