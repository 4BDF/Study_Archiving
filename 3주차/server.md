# 4. 스프링 빈과 의존관계
 
 ### 스프링빈을 등록하는 방법1: 컴포넌트 스캔과 자동 의존관계
 - 생성자에 @Autowired 가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다(의존성주입:객체 의존관계를 외부에서 넣어주는 것)
    + ex) 스프링이 스프링컨테이너에서 스프링빈에 등록되어있는 memberservice객체를 가져와 controller와 연결시켜줌
   ```
    @Autowired
    public MemberController(MemberService memberService) {
      this.memberService = memberService;
    }
   ```  
 - @Component 애노테이션이 있으면 모두 객체를 생성해 스프링 빈으로 자동 등록됨-> @Controller 컨트롤러가 스프링 빈으로 자동 등록된 이유도 컴포넌트 스캔
    + @Component 를 포함하는 애노테이션도 스프링 빈으로 자동 등록됨: @Controller,@Service,@Repository 

  - memberController->memberService->memberRepository:  memberController가 memberService에 의존하고 memberService가 memberRepository에 의존하게 만들어야함
  =>memberController, memberService 생성자에 @Autowired를 붙여줌 

  - 컴포넌트 스캔 대상: hello.hellospring패키지를 포함한 하위패키지만 컴포넌트 스캔의 대상이됨 
  - 스프링은 스프링 컨테이너에 스프링 빈을 등록할 때, 기본으로 싱글톤으로 등록한다(유일하게 하나만 등록해서 공유함, 같은 스프링 빈이면 모두 같은 인스턴스)

 ### 스프링빈을 등록하는 방법2: 자바코드로 직접 스프링 빈 등록
 - @Configuration에서 @Bean 메소드를 호출해서 객체를 생성해 스프링빈에 등록
 ```@Bean
  public MemberService memberService() {
   return new MemberService(memberRepository());
  }
  ```
 - DI에는 필드 주입, setter 주입, 생성자 주입 이렇게 3가지 방법이 있음:
   + 필드주입: @Autowired private  MemberService memberServce;
   + setter 주입:
      ```@Autowired
      public void setMemberService(MemberService memberService){
        this.memberService=memberService;
      }                                                                        
     ```
    + 생성자 주입 

    -> 생성자 주입을 쓰는게 좋음

 ### 참고
 - 실무에서는 주로 정형화된 컨트롤러, 서비스, 리포지토리 같은 코드는 컴포넌트 스캔을 사용함
 - 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링 빈으로 등록
 - @Autowired 를 통한 DI는 helloConroller , memberService 등과 같이 스프링이 관리하는 객체에서만 동작함





# 5. 회원 관리 예제 - 웹 MVC 개발

