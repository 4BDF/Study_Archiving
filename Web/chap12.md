# Chap12



## 12-1. AJAX 통신을 이용하여 공공데이터 가져오기

- ### Asynchronous JavaScript and Xml(AJAX)

  - XML(eXtensible Markup Language)

    - 태그 등을 이용하여 데이터의 구조를 기술하는 언어

  - AJAX

    - 자바스크립트를 사용한 비동기 통신으로 클라이언트와 서버간에 XML 데이터를 주고받는 기술

    - JSON이나 일반 텍스트 파일과 같은 다른 데이터 오브젝트들도 사용 가능

    - 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법

    - html페이지 전체가 아닌 일부분만 갱신할 수 있도록  XMLHttpRequest객체를 통해 서버에 요청하고 Json이나 xml형태로 필요한 데이터만 받아 갱신하기 때문에 그만큼의 자원과 시간을 아낄 수 있음

      

- #### jQuery를 이용한 ajax

  ![24](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/24.png)

  ![25](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/25.png)



- #### 공공데이터

  - 공공데이터

    - 공공기관이 전자적으로 생성 또는 취득하여 관리하고 있는 모든 데이터베이서(DB), 전자화된 파일

  - 공공데이터 개방

    - 공공기관이 이용자에게 데이터를 자유롭게 재활용 할 수 있도록 제공하고, 제공받은 정보를 상업적, 비영리적으로 이용할 권한을 부여하는 것

  - https://www.data.go.kr

    

- #### 날짜 함수

  - 날짜 객체 생성
    - var newDate = new Date();
  - 년도 추출
    - newDate.getFullYear()
  - 월 추출
    - newData.getMonth()
    - 0(1월) 부터 11(12월) 까지의 정수를 반환
  - 일 추출
    - newDate.getDate()

