package com.example.ex00.dependency;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class Coding {
//    필드 주입
//    사용 방법이 매우 편하다는 장점이 있다.
//    주입된 객체를 불면(immutable)상태로 만들 수 없기 때문에 외부에서 수정될 위험이 있다.
/*    순환 참조 발생 시 Application 동작 시점과 Runtime 시점 중 Runtime 시점에 해당하기 때문에
      메모리에 계속 할당되고 StackOverFlow가 발생했다. 하지만 2.6버전 이상부터는 Application 동작 시점에서 잡힌다.*/
//    Spring이 아니면 해당 필드에 주입할 수 있는 방법이 없다.
//    생성 후 주입, 생성 시점에서는 순환 참조 발생 여부를 알 수 없다.

//    @Autowired
//    불변성(Immutablility)
//    개방 폐쇄 원칙(OCP, Open-Colosed Principle)
//    private Computer computer;

//    Setter 주입
//    필드 주입과 동일하다.
//    주입받는 객체가 변경될 가능성이 있는 경우에 사용된다.
//    OCP(Open-Colosed Principle, 개방 폐쇄 원칙)를 위반하기 때문에 변경 가능성을 배제하고 불변성을 보장하는 것이 좋다.
//    생성 후 주입, 생성 시점에서는 순환 참조 발생 여부를 알 수 없다.
//    private Computer computer;
//    @Autowired
//    public void setComputer(Computer computer){
//        this.computer = computer;
//    }

//    생성자 주입
//    불변성이 생기기 때문에 해당 필드에 final 키워드를 작성할 수 있다.
//    컴파일 시점에서 주입 문제 발생을 확인할 수 있으며,
//    객체를 생성하는 시점에서 Bean 객체를 필수로 초기화하기 때문에 NPE(Null Point Exception)를 방어할 수 있다.
//    순환 참조 발생 시 Runtime 시점 이전에 감지가 되기 때문에 안전하다.
//    주입 후 생성, 생성 시 순환참조 발생 여부를 알 수 있기 때문에 Application 실행 시점에서 순환참조 오류를 발견할 수 있다.

    private final Computer computer;

//    @Autowired
//    public Coding(Computer computer){
//        this.computer = computer;
//    }

}
