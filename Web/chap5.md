# Chap5



## 5-1. HTML FORM 태그를 이용하여 사용자 입력 받기

![14](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/14.png)

- #### 사용자 입력 : form 요소

  사용자가 입력한 정보를 서버로 전송하는 요소

  - name : 폼을 구별하기 위한 속성
  - method : 데이터를 전달하는 방식 
    - GET : URL에 변수를 포함시켜 요청 
    - POST : 데이터가 본문에 포함되어 전달 
  - action : 데이터를 전송할 URL



- #### input 요소

![15](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/15.png)



- #### input type = "radio"

  여러 항목들 중에서 하나만 선택할 수 있도록 그룸으로 설정 - name 속성을 같게 설정

  - checked : 기본값으로 선택

    

- #### select 요소

  - 드롭다운의 목록 정의
  - 항목은 option요소로 작성
  - selected : 기본값 선택

  

- #### textarea 요소

  여러 줄의 텍스트 입력 가능



- #### label 요소

  - 입력 요소의 label

    - for 속성을 사용해서 해당 입력 요소와 연동
    - for속성의 값 = 입력 요소의 id값

  - radio와 checkbox의 레이블

    - 버튼이 아니라 글자를 선택해도 해당 항목 선택 가능

    

- #### 입력 요소 CSS

  - 속성 셀렉터 - 태그[속성]
    - 지정한 태그에 속성이 있는 요소 ex) label[for] {color : red;}
  - 태그[속성 = 값]
    - 지정한 태그에 속성값이 지정한 값과 같은 요소 ex) input[type=text] {height : 40px;}
