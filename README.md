# JPA_DATA

## 쿼리 메소드 기능 3가지
- 메소드 이름으로 쿼리 생성
- 메소드 이름으로 JPA NamedQuery 호출
- @Query 어노테이션을 사용해서 리파지토리 인터페이스에 쿼리 직접 정의

## 스프링 데이터 JPA 페이징과 정렬
정렬 기능 , 페이징 기능

## 벌크성 수정 쿼리
전체 업데이트 바로 DB방영 
업데이트 후 영속성 컨테스트 날려줘야 한다.   @Modifying(clearAutomatically = true)

## EntityGraph
패치조인 간단 하게 해준다.
