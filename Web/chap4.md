# Chap4



## 4-1. DOM 개념을 익히고 셀렉터를 조합하여 접근하기

- #### DOM(문서 객체 모델; Document Object Model)

  문서의 구조화된 표현 제공

  트리형태의 구조를 얻어낼 수 있음 (셀렉터를 계층 구조를 이용해서 찾아낼 수 있음)

  ![11](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/11.png)

  

- #### 셀렉터 조합하기 - 계층 접근용 셀렉터

  **방법 2가지**

  - 조상/자손 셀렉터(Ancestor/Descendent selector)
    - 공백으로 표시
  - 부모/자식 셀렉터(Parent/Child selector)
    - '>'로 표시

  ![12](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/12.png)

  

  

- #### **가상 클래스(Pseudo-class)**

  눈에 보이지 않지만 가상으로 존재하는 클래스들

  **a태그**와 관련된 가상 클래스

  - a:link - 하이퍼링크 요소 중 아직 방문하지 않은 하이퍼링크에 적용
  - a:visited - 하이퍼링크 요소 중 한번 이상 방문한 하이퍼링크에 적용 
  - a:hover - 하이퍼링크 요소에 마우스를 올려 놓았을때 적용
  - a:active - 하이퍼링크 요소를 클릭했을 때 적용

  text-decoration : none - 요소의 밑줄이 사라짐



- #### **display 속성**

  HTML요소를 보여주는 방법 : 블록요소(줄바꿈) & 인라인 요소(줄바꿈X)

  **display 속성**을 이용해서 기본값 변경

  - display:none - 영역을 차지하지 않고 보이지 않음
  - display:block - 블록 영역으로 기본적으로 브라우저 전체 너비가 적용되고 줄바꿈 적용, 가로(width)/세로(height) 적용 가능
  - display:inline - 인라인 영역으로 요소의 내용만큼만 너비가 적용되고 줄바꿈 적용되지 않음, 가로(width)/세로(height) 지정 불가능
  - display:inline-block - 블록과 인라인 영역의 중간 형태로 크기를 변경할 수 있고 줄바꿈이 적용되지 않음, 가로(width)/세로(height) 지정 가능



- #### **box-sizing 속성**

  HTML 블록 요소들의 실제 너비와 높이는 너비와 높이 값 안쪽 여백, 바깥쪽 여백, 테두리 값을 모두 더해서 포시됨

  **box-sizing : border-box;**  - 실제 너비와 높이를 지정한 너비와 높이로 고정. 즉 안쪽 여백, 바깥쪽 여백, 테두리 값을 지정하더라도 지정한 너비와 높이만큼 표시되도록 함

  

- #### **float 속성/ clear 속성**

  - float 속성
    - 요소를 정렬하여 흐르듯이 배치
    - float:left  - 왼쪽으로 배치
    - float:right - 오른쪽으로 배치
  - clear 속성
    - float 속성 해제 + 줄바꿈

  ![13](https://raw.githubusercontent.com/EveKristinLee/save_img/main/img/13.png)



- #### **구글 아이콘 사용**

  1. head요소에 추가

     &lt;link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"&gt;

  2. i 태그

     &lt;i class="material-icons"&gt;cloud&lt;/i&gt;

     cloud = 아이콘의 이름

