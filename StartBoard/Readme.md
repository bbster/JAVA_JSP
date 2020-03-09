JAVA-SPRING

server.context.xml -> WebContent.WEB-INF.WEb.xml -> servlet mapping(django url pattern 유사) -> 해당 경로(controller,view 등등 쓰기 나름)


컨트롤러는 매핑 역할(django urls 역할)만 해주는게 좋다.

mysql 
 - sequence(ORACLE)/auto_increment - 데이터가 삽입 될때마다 1씩 증가 / django ORM의 경우 자동으로 세팅되어있다.
 - blob(Binary Large Object) - 데이터 타입을 알아내거나, 송수신을 위해 작은 객체로 나누는 등의 작업에 사용됨
 - varchar는 꼭 크기를 지정해줘야한다.

PreparedStatement executeUpdate/executeQuery
 - insert into 같이(DATA 변화 O) executeUpdate
 - select 같이(DATA 변화 X) executeQuery