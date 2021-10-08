# 프로젝트 환경설정

## 프로젝트 생성
### Java 11 설치 , IDE: IntelliJ 설치
### 스프링 부트 스타터 사이트로 이동해서 스프링 프로젝트 생성
 - 프로젝트 선택
   + Project: Gradle Project
   + Spring Boot: 2.5.x 
   + Language: Java
   + Packaging: Jar
   + Java: 11
 - Project Metadata
   + groupId: hello
   + artifactId: hello-spring
 - Dependencies: Spring Web, Thymeleaf

 ### IntelliJ Gradle 대신에 자바 직접 실행
 - 실행속도가 더 빠름
 - File Setting -> Build Tools Gradle -> Build Tools Gradle로 변경
--------------------------------------------------------------------------------------------------------------------
## 라이브러리 살펴보기
 ### 스프링 부트 라이브러리
 - spring-boot-starter-web
   + spring-boot-starter-tomcat: 톰캣 (웹서버)
   + spring-webmvc: 스프링 웹 MVC
 - spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
 - spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
   + spring-boot -> spring-core
 - spring-boot-starter-logging
   + logback, slf4j

   ### 테스트 라이브러리
   - spring-boot-starter-test
     + junit: 테스트 프레임워크
     + mockito: 목 라이브러리
     + assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
     + spring-test: 스프링 통합 테스트 지원
--------------------------------------------------------------------------------------------------------------------
## View 환경설정

### 스프링 부트가 제공하는 Welcome Page 기능
- resources/static/index.html을 올려두면 Welcome page 기능을 제공

- web페이지 index.html을 가장 먼저 찾음

```
@Controller
public class HelloController {
 @GetMapping("hello")
 public String hello(Model model) {
 model.addAttribute("data", "hello!!");
 return "hello";
 }
}
```
### 동작 설명
- spring-boot를 돌리면 controller에 가장 먼저 진입
- 1. localhost:8080/hello를 톰캣 웹서버에 보냄
  2. controller에서 getmapping("hello")를 찾아 model("Data값")을 
hello.html(return "hello")에 넘겨줌
  3. resources/templates/ 에서 viewresolver가 기본적으로 렌더링하고 변환된 hello.html을 웹 브라우저에 보냄




--------------------------------------------------------------------------------------------------------------------
## 빌드하고 실행하기
- 콘솔로 이동 명령 프롬프트(cmd)로 이동
- ./gradlew gradlew.bat 를 실행하면 됩니다.
- 명령 프롬프트에서 gradlew.bat 를 실행하려면 gradlew 하고 엔터를 치면 됨
- gradlew build
- 폴더 목록 확인 ls dir
- 윈도우에서 Git bash 터미널 사용하기