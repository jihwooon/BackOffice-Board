# 백오피스 개발 프로젝트  
# 목차
- [개발 환경](#개발-환경)
- [사용 기술](#사용-기술)
    * [백엔드](#백엔드)
    * [기타 주요 라이브러리](#주요-라이브러리)
    * [프론트](#프론트)
- [프로젝트 목적](#프로젝트-목적)
- [요구사항](#요구사항)
- [핵심 기능](#핵심-기능)
    * [헥사고날 아키텍처로 리아키텍처링](#헥사고날-아키텍처로-리아키텍처링)
    * [테스트 코드를 세분화하기](#테스트-코드를-세분화하기)
- [프로젝트를 통해 느낀점](#프로젝트를-통해-느낀점)
- [프로젝트 관련 추가 포스팅](#프로젝트-관련-추가-포스팅)
## 개발 환경
- IntelliJ
- Postman
- GitHub
- DataGrip
- WebStorm

## 사용 기술
### 백엔드
- Java 11 openjdk
- SpringBoot 2.6.7
- SpringBoot Security
- Spring Data JPA
- QueryDSL 5.0
- Gradle
- MariaDB

### 주요 라이브러리
- Lombok
- Mockito
- Restdoc
- AssertJ
- p6spy

### 프론트(추후 개발 예정)
- TypeScript
- React 18

## 프로젝트 목적
### 백오피스 프로젝트를 기획한 이유?
회사 채용공고 중 백오피스를 개발하는 부서가 있다는 것을 알게 되었습니다.  
이전 백오피스가 어떤 일을 하고 있는지 머릿속에 떠오르지 않아서 백오피스를 알고 싶어 기획하게 되었습니다.  
앞으로 프로그래밍 공부를 하면 새롭게 배운 기술 접목을 시키고 포트폴리오를 위한 프로젝트가 아닌 지속해서 운영해가면서 개발할 예정입니다.

## 요구사항
* 관리자 페이지 CRUD API 설계
* 카테고리 이름 검색 색인 기능 구현
* QueryDsl 페이징 기능 구현
* Clean 아키텍처

## E-R 다이어그램
<img src="https://user-images.githubusercontent.com/68071599/214483854-0314334b-1286-435a-bd2b-0af71f8f07d8.png" width="50%" height="50%"/>  

## 시스템 아키텍쳐

## WAS 아키텍처

### 패키징 구조 예시
<img src="https://user-images.githubusercontent.com/68071599/215277127-ee460bbd-5412-40b8-9157-253da2c4b1a7.jpg" width="30%" height="30%"/>  

## 추후에 해볼 만 한 것

### 헥사고날 아키텍처로 리아키텍처링

최근 [만들면서 배우는 클린 아키텍처 책 스터디](https://codesoom.github.io/wiki/get-your-hands-dirty-on-clean-architecture/) 스터디를 진행했었습니다.  

<img src="https://user-images.githubusercontent.com/68071599/215652157-f9525306-388a-449f-ac60-6bdbef729963.png" width="50%" height="50%"/>  

[출처: [헥사고날(Hexagonal) 아키텍처 in 메쉬코리아](https://mesh.dev/20210910-dev-notes-007-hexagonal-architecture/)]

### 테스트 코드를 세분화하기

기존 테스트 코드는 SpringBoot 통합 테스트로만 이루어져 있었습니다. 테스트의 기본 전제는 만드는 비용이 적고 유지보수하기 쉽고, 빨리 실행되고, 안정적인 작은 크기의 테스트들에 대해 높은 커버리지를 유지해야 합니다. 통합테스트는 비용이 많이 들고 실행이 느려 테스트의 커버리지에 부합하지 않습니다. 따라서 비용이 적고 실행이 빠른 테스트를 위해 단위 테스트를 적용하기 위해서 테스트 코드 세분화 작업을 진행했습니다.  
<img src="https://martinfowler.com/articles/practical-test-pyramid/testPyramid.png" width="50%" height="50%"/>  

[출처: [The Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html)]

### OSIV의 활용하기
현재 로직은 osiv를 잘못된 활용 예제 중 하나입니다. 이를 잘 활용하기 위해서 osiv를 어떻게 사용해야 하고 맞는 로직으로 수정해야 하는 작업이 필요합니다.

## 프로젝트를 통해 느낀점



## 프로젝트 관련 추가 포스팅

- [만들면서 배우는 클린 아키텍처 책 스터디](https://codesoom.github.io/wiki/get-your-hands-dirty-on-clean-architecture/)
- [실용적인 테스트 피라미드](https://martinfowler.com/articles/practical-test-pyramid.html)

