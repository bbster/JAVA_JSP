# JAVA-SPRING

## Setting
 1. java 1.8.0설치
 2. Path 경로 설정
 3. eclipse photon 설치
 4. Spring 
  - https://download.springsource.com/release/STS/3.9.3.RELEASE/dist/e4.8/spring-tool-suite-3.9.3.RELEASE-e4.8.0-win32-x86_64.zip
 5. Oracle Database Express Edition (XE) Release 11.2.0.2.0
  - https://www.oracle.com/database/technologies/xe-prior-releases.html
 
## Spring flow
 1. DB 
 2. Mapper
 3. mybatisconfig
 4. DTO/interface / getter, setter/ using field / (Alt,Shift,S)
 5. DAO/interface
 6. service
 7. controller
 

### server.context.xml -> WebContent.WEB-INF.WEb.xml -> servlet mapping(django url pattern 유사) -> 해당 경로(controller,view 등등 쓰기 나름)


### 컨트롤러는 매핑 역할(django urls 역할)만 해주는게 좋다.

## mysql 
 - sequence(ORACLE)/auto_increment - 데이터가 삽입 될때마다 1씩 증가 / django ORM의 경우 자동으로 세팅되어있다.
 - blob(Binary Large Object) - 데이터 타입을 알아내거나, 송수신을 위해 작은 객체로 나누는 등의 작업에 사용됨
 - varchar는 꼭 크기를 지정해줘야한다.

## PreparedStatement option executeUpdate/executeQuery
 - insert into 같이(DATA 변화 O) executeUpdate
 - select 같이(DATA 변화 X) executeQuery
 
## Interface(컴포넌트 명시 / django - import function)
 
## 다형성
## 오버라이드,오버로딩
## Form Tag 작동의 이해
## Spring Annotation
## SQL 관련 구문은 mapper에 xml파일로 정리
## Parameter Type, Result Type
 
## 과제 : 관리자 로그인 했을때 관리자페이지(링크)에서 회원목록 출력 (Admin page 작성)
