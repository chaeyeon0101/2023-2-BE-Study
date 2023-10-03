spring bean이란
스프링 IoC 컨테이너에 의해 관리되는 자바 객체
스프링 IoC 컨테이너란 빈을 관리하는 객체. 대표적으로 ApplicationContext (빈 조회, 이벤트 발행, 환경변수 조회 등 구현 가능)

spring bean을 등록하는 방법
@Bean
@Configuration : 빈을 싱글톤으로 관리
@ComponentScan : 검색할 패키지의 범위 설정 (기본적으로 @ComponentScan이 붙은 성정 정보 클래스의 패키지가 시작 위치)
@Component : 자동으로 스프링 빈을 등록 (싱글톤으로)

![asdf](https://github.com/chaeyeon0101/2023-2-BE-Study/assets/87770634/9c2c31b5-f4c7-4542-8125-af7fcf2ad0b3)
![sdfg](https://github.com/chaeyeon0101/2023-2-BE-Study/assets/87770634/66deff4e-2fc9-4f3c-a9d0-9e22f102b03d)
