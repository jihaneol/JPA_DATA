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

## 확장 기능 
사용자 정의 리포지토리 구현

실무에서 주로 QueryDSL이나 SpringJdbcTemplate을 함께 사용할 때 사용자 정의 리포지토리 기능 자주 사용

**참고** 그냥 임의의 리포지토리를 만들어서 사용해도 된다..

1. 커맨드와 쿼리 분리 CQS
2. 핵심 과 단순 비즈니스로직 분리 
3. 라이프 사이클 따라 변경할 것 분리

## Auditing
엔티티를 생성, 변경할 때 변경한 사람과 시간을 추적하고 싶을때.

@EnableJpaAuditing

save() -> persist , merge

## 새로운 엔티티를 구별하는 방법
JPA 식별자 생성 전략이 GenerateValue면 save 호출시점에 식별자가 없으므로 새로운 엔티티로 인식해서 정상 동작

Id만 사용시 이미 식별자 값이 있는 상태면 merge가 호출 -> db를 보고 없으면 새로운 엔티티로 인지 비효율적

Persistable를 사용해서 새로운 엔티티 확인 여부를 직접 구현
 
