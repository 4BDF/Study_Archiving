# Chap3



## 3-1. CSS 기본 사용법과 셀렉터 알아보기

- #### CSS 스타일 시트

  CSS(Cascading Style Sheet) : HTML 문서를 꾸며주는 언어

  CSS로 작성된 코드 : 스타일 시트(style sheet)					

  - https://www.w3schools.com/css

  

- #### HTML문서에 CSS 스타일 

  **방법 3가지**

  - 인라인 스타일(Inline style) : 태그의 속성으로 주는 방법 

    ![6](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/6.png)

  - 내부 스타일 시트(Internal style sheet) : 주로 head영역에 &lt;style&gt; ...&lt;/style&gt; 사용

    ![7](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/7.png)

  - 외부 스타일 시트(External style sheet) : 여러 문서에 스타일 시트를 적용해야 할때 css파일의 링크를 걸어주면 됨

    ![8](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/8.png)

  

  **적용 우선순위**

  인라인 스타일 - 내부 스타일 시트 - 외부 스타일 시트

  

- #### **CSS의 구성**

  **셀렉터(selector)** 

  스타일을 고칠 HTML요소

  반드시 {}로 묶여야함

  **선언(declaration)**

  :으로 구분 된 CSS 속성 이름과 값이 포함

  ;으로 끝남



- #### **셀렉터의 종류**

  문서에서 뭘 바꿀건지 찾는 방법

  **요소 셀렉터(Element Selector)** : HTML 태그 이름으로 찾음

  **클래스 셀렉터(Class Selector)** : 요소에 여러개를 그룹으로 묶어주는 클래스라는 속성을 줄 수가 있음. 이걸 찾음 (<span style="color:red">**.c1**</span> :  c1이라는 클래스를 찾으라는 기호)

  **아이디 셀렉터(ID Selector)** : 요소에 아이디를 지정한 후 그 아이디로 찾아줌 (<span style="color:red">**#s1**</span> : s1 아이디를 찾으라는 기호)



- #### **셀렉터 그룹화**

  하나의 스타일을 여러 요소, 클래스, 아이디에 적용할때는 ,(쉼표)로 구분

  

- #### **박스 모델(Box Model)**

  ![9](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/9.png)

  - 안쪽 여백 : padding

  - 바깥쪽 여백 : margin

    값 1개 : 4면

    값 2개 : 상단하단, 왼쪽 오른쪽값

    값 3개 : 상단, 왼쪽오른쪽, 하단

    값 4개 : 상단, 오른쪽, 하단, 왼쪽

    각각 지정 : padding/margin-top/right/bottom/left



- #### **배경 지정**

  - background-color : 색상 값;

    색상 값 : 색상 이름, RGB색상, RGBA색상(RGB에 +투명도), 16진수 값 사용

    https://www.w3schools.com/colors/colors_names.asp

    

- #### **테두리 지정**

  - border : 테두리 두께 지정

  - border-style : 테두리의 스타일 지정

    - dotted, dashed : 점선
    - solid : 단색
    - double : 이중
    - none : 없음

  - border-width : 테두리 너비

  - border-color : 테두리 색상

  - 테두리 스타일, 너비, 색상

    - 2개 값 : 위쪽 아래 / 왼쪽 오른쪽

    - 4개 값 : 위쪽, 오른쪽, 아래쪽, 왼쪽

      

- #### **너비와 높이 지정**

  - 너비 : width

  - 높이 : height

  - %, px, cm로 지정가능

    - % : 상위객체의 크기에 비함

      

- #### **텍스트**

  - 색상 : color

  - 정렬 방식 - text-align: center/left/right/justify(양쪽 정렬);

  - 크기 : font-size, px/em으로 표시 (em은 가변단위 : 현재 지정된 폰트의 크기)

    

- #### **목록 스타일**

  기본 목록의 모양을 바꾸고 싶을때 사용

  - ul 
    - list-style-type: circle;
    - list-style-type:square;
  - ol
    - list-style-type: upper-roman; (로마자 대문자)
    - list-style-type: lower-alpha; (소문자 알파벳)

