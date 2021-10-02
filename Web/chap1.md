# Chap1



## 1-1. HTML 태그 알아보기

- #### 웹 페이지 구성

  HTML : 웹 페이지상에서 문단, 제목, 표, 이미지, 동영상등을 정의하고 그 구조와 의미를 부여하는 마크업 언어

  CSS : 배경색, 폰트, 컨텐츠의 레이아웃등을 지정하여, HTML 컨텐츠를 꾸며주는 스타일 규칙 언어

  JAVA Script : 동적으로 콘텐츠를 변경할 수 있도록 하는 프로그래밍 언어



- #### HTML(HyperText Markup Language)

  **HTML 태그** : <태그> 내용 </태그> 

  **HTML 속성** :  1. 시작태그에 추가 

  ​						2. 속성이름="속성값" or  '속성값'

  ​						ex) 내용을 누르면 해당 사이트로 넘어가기

  **HTML 요소** : 시작태그와 종료태그 사이의 모든 내용

  

## 1-2. 해결문제: HTML 기본 태그를 이용한 자유소프트웨어 설명 페이지 작성

+web01.html

![1](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/1.png)

1. 제일 첫번째 줄에는 이 문서가 어떤 버전을 사용하는지에 대한 문서 정의 (대소문자의 구분은 없지만 대부분 DOCTYPE은 대문자)

2. html태그는 문서의 시작과 끝을 나타냄. 이 밖으로는 다른 태그를 사용하지 말것

3. html태그 안은 head태그와 body태그로 나누어짐

   | 태그 |             기능              |
   | :--- | :---------------------------: |
   | h    |          제목(body)           |
   | p    |             단락              |
   | br   |      줄바꿈(종료태그 X)       |
   | ul   |           목록표현            |
   | li   |      ul안에서의 목록표현      |
   | img  | 이미지 넣기(+src), 종료태그 X |
   | a    |       하이퍼링크(+href)       |

   

## 1-3. 응용문제: 자기 소개 페이지 작성

+web02.html

![2](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/2.png)

- html5에서는 div태그 대신 section이라는 태그가 존재. 하지만 div태그는 문서의 레이아웃을 잡을때 많이 사용하는 태그

