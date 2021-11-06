# Chap9



## 9-1. JQuery를 이용하여 이벤트 처리

- #### JQuery

  - HTML의 클라이언트 사이드 조작을 단순화 하도록 설계된 크로스 플랫폼의 자바스크립트 라이브러리
  
  - JQuery 특징
  
    - 가벼움 : 좋은 기능을 가지면서도 용량이 적을수록 가볍고 좋음
    - CSS 셀렉터 : CSS를 간단한 코드로 변경 가능하도록 적용해서 훨씬 쉽게 사용
    - 크로스 브라우저 : JQuery 코드로 이벤트를 구현하면 브라우저에 상관없이 지원
  
  - JQuery 연동하기
  
    - http://jquery.com/download/ = 라이브러리 다운로드 방식
    - 네트워크 전송방식(CDN) = &lt;script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"&gt;&lt;/script&gt;
  
    
  
- #### JQuery Syntax

  - $(selector).action()
    - $ : JQuery 정의 기호
    - (selector) : HTML요소 찾기, css 선택자와 동일
    - action() : 선택된 요소에 수행될 행위



- #### JQuery 이벤트 처리

  ![20](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/20.png)



- #### JQuery 효과

  - .show() : HTML 요소 보이기
  - .hide() : HTML 요소 숨기기
  - .toggle() : show()와 hide()의 전환

  

- #### JQuery css

  - css값 가져오기  
    - .css("속성명")
  - css값 설정하기
    - .css("속성명", "속성값")
    - .css({"속성명" : "속성값", "속성명" : "속성값"})



- ### HTML 요소

  ![21](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/21.png)

