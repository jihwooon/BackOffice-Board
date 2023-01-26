# 백오피스 개발 프로젝트  
[![Guide Documents](https://img.shields.io/badge/wiki-documentation-forestgreen)](https://github.com/jihwooon/core-java/wiki)
[![Version](https://img.shields.io/badge/version-2022.06.03-red.svg)](./CHANGELOG)

# 목차
- [개발 환경](#개발-환경)
- [사용 기술](#사용-기술)
    * [백엔드](#백엔드)
    * [기타 주요 라이브러리](#주요-라이브러리)
- [요구 사항](#요구사항)
## 개발 환경
- IntelliJ
- Postman
- GitHub
- DataGrip

## 사용 기술
### 백엔드
#### 주요 프레임워크 / 라이브러리
- Java 11 openjdk
- SpringBoot 2.6.7
- SpringBoot Security
- Spring Data JPA
- QueryDSL 5.0

#### Build tool
- Gradle

#### Database
- MariaDB

### 주요 라이브러리
- Lombok
- Mockito
- Restdoc
- AssertJ
- Restdoc
- p6spy

### 프론트
#### 주요 프레임워크 / 라이브러리
- TypeScript
- React 18

## 요구사항
* 관리자 페이지 CRUD API 설계
* 카테고리 이름 검색 색인 기능 구현
* QueryDsl 페이징 기능 구현
* Clean 아키텍처


## E-R 다이어그램
![diagram](https://user-images.githubusercontent.com/68071599/214483854-0314334b-1286-435a-bd2b-0af71f8f07d8.png)




### 프로젝트 목적
공통화 된 질문은 FAQ 카테고리 게시판에 관리자가 등록 할 수 있습니다.  
 

### 목표가 아닌 것 (Non-goals)
사용자 질문 게시판과 FAQ 카테고리 게시판은 혼동 되어서는 안됩니다.  
한 가지 질문 사항에 FAQ 카테고리 게시판에 등록을 해서는 안됩니다.   
공통 질문 사항과 자주 묻는 질문 사항은 엄격하게 구분 해야 합니다. 

### 이외 고려사항들 (Other Considerations)
검색 기능에 대해서 검토를 진행 했었으나, 아직 검색이 필요한 만큼 데이터가 충분 하지 않을꺼 같고 페이징으로 충분 한다고 판단이 되어 검색 기능은 추가 하지 않기로 함.
