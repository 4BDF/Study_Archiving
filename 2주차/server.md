# 2. 스프링 웹 개발 기초


## 정적 컨텐츠
 - 서버에 resources에 static의 html파일을 전달, 원하는 파일을 static에 넣으면 그대로 반환됨.
 - 1. 웹브라우저에서 localhost:8080/hello-static.html을 입력하면 톰켓 서버가 요청을 받고 스프링에 넘김. 
   2. 스프링은 컨트롤러가 hello-static이 있는지 찾음(컨트롤러가 먼저 우선순위를 가지고 있음)
   3. hello-static이 없으므로 스프링 내부에서 resources/static에 hello-static.html파일을 찾음
   4. hello-static.html파일을 반환해줌

----------------------------------------------------

## MVC와 템플릿 엔진
- mvc(model,view,controller)
- view는 화면을 그리는데 집중해야함. controller는 비지니스 로직등 내부 처리에 집중함
- 유지보수가 어려움. 그래서 나누어졌음
```
@GetMapping("hello-mvc")
 public String helloMvc(@RequestParam("name") String name, Model model) {
  model.addAttribute("name", name);
  return "hello-template";
 }
```
->
1. localhost:8080/hello-mvc?name=spring!를 입력해 서버에 요청하면 스프링으로 전달하고 controller가    getmapping부분의 hello-mvc찾고 해당 메소드를 호출
2. model에 name키에 "spring!" 값을 넣어 hello-template에 넘기고 hello-template을 반환
3. viewresolver가 templates/hello-template.html을 찾아서 thymeleaf 템플릿 엔진에 처리 요청하면 템플릿 엔진이 렌더링을 해서 html로 변환해 웹브라우저에 넘겨줌  


----------------------------------------------------

## API

```
 @GetMapping("hello-api")
 @ResponseBody
 public Hello helloApi(@RequestParam("name") String name) {
  Hello hello = new Hello();
  hello.setName(name);
  return hello;
 }

 static class Hello {
  private String name;
  public String getName() {
  return name;}
  public void setName(String name) {
  this.name = name;}
 }

```
- @ResponseBody: http의 응답 body부에 직접 넣어주겠다 , 그대로 웹브라우저에 data를 반환해줌 
- json으로 반환되는것이 기본-> http://localhost:8080/hello-api?name=spring!을 입력하면 json {"name":"spring!"}이 반환됨
- return값이 문자면 StringHttpMessageConverter가 동작해  그대로 반환 , 객체면 MappingJackson2HttpMessageConverter가 동작해 json으로 만들어서 반환 




# 3. 회원 관리 예제 - 백엔드 개발

## 비즈니스 요구사항 정리

### 일반적인 웹 어플리케이션 계층 구조
- 컨트롤러: 웹 MVC의 컨트롤러 역할
- 서비스: 핵심 비즈니스 로직 구현
- 리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리
- 도메인: 비즈니스 도메인 객체, 예) 회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨

----------------------------------------------------

## 회원 리포지토리 테스트 케이스 작성
- junit 프레임워크로 테스트를 실행
- @Test를 붙이면 테스트를 실행할 수 있음
- @AfterEach: 메소드가 끝날때마다 정한 동작을 취함: 한꺼번에 test를할때 respository가 clear되지 않기때문에 생긴 문제를 해결하기 위해 test하나 끝날때마다 repository를 모두 지워주는 afterEach메소드 생성


