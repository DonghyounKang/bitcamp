# gradle 사용법

## gradle init 
gradle 설정파일 자동생성

- 이 명령 실행시 gradle 관련 폴더와 설정파일을  자동으로 생성

============ 목록 ==============
- .gradle 폴더
	- gradle 실행할 때 사용하는 관련 파일들을 모아둔 폴더

- gradle 폴더
	- gradle 실행 파일을 둔 폴더

- build.gradle
	- gradle 설정 파일

- gradlew(unix/linux용), gradlew.bat(window용)
	- 사용자 PC에 gradle을  자동으로 다운로드 받아 설치하고 실행
	- 즉 사용자 PC에 gradle이 설치되어 있지 않아도 실행할 수 있다.
	
- settings.gradle
	- gradle 실행할 때 참조하는 정보 포함
===============================

## gradle init --type[프로젝트 타입]
지정한 유형에 맞춰 프로젝트 폴더 및 기본파일들을 자동으로 생성

## gralde clean
build 폴더 제거

## gradle tasks --all
gradle로 작업할 수 있는 모든 기능목록 출력

## plugin
gradle로 실행할 수 있는 작업들을 모아둔 라이브러리

- 플러그인을 추가하는 방법 : build.gradle에 다음 설정 추가


> apply plugin : '플러그인 명'

or

> plugins {
	id : '플러그인 명'
	}

	
### 'java' plugin


> gradle compileJava


- build/classes/java/main폴더 생성
- src/main/java 폴더의 모든 자바소스를 컴파일하여 위의 폴더에 저장


> gradle processResources 

- buld/resources/main 폴더 생성
- src/main/resources 폴더의 모든 파일을 복사하여 위의 폴더에 넣는다.

> gradle classes

- compileJava + processResources 작업 수행

> gradle compileTestJava 

- gradle classes 작업을 먼저 수행
- build/classes/java/test폴더 생성
- src/test/java 폴더의 모든 자바소스를 컴파일하여 위의 폴더에 저장

> gradle processTestResources 

- buld/resources/test 폴더 생성
- src/test/resources 폴더의 모든 파일을 복사하여 위의 폴더에 넣는다.

> gradle testClasses

- gradle compileTestJava & gradle process Resources 작업 수행

> gradle test

- gradle testClasses 작업 수행
- build/classes/test 폴더에 있는 테스트 관련 클래스를 모두 실행
- build/test-results 폴더 생성
	- 실형결과를 test-results/binary/TEST-AppTest.xml 출력

> gradle jar	

- gradle classes 작업 수행
- java class파일과 기타 자원 파일을 .jar파일에 묶어 저장
- test 관련 파일은 제외하여 생성, build/libs폴더 아래에 .jar 파일 복사

> gradle build

- 전체 생성

### 'application' plugin
java 프로그램을 실행할 수 있는 작업이 들어있다.

> gradle run

- gradle classes 작업 수행
- build.gradle의 'mainClassName'에 지정된 자바 클래스를 실행

## 'eclipse' plugin


> gradle eclipseClasspath
eclipse IDE 관련 설정파일을 다루는 작업이 들어있다.

-.classpath 파일 생성

> gradle eclipseProject

- .project 파일 생성

> gradle eclipseJdt

- java jdt(JavaDevelopmentTool) 관련 설정 파일 및 폴더 생성(.settings폴더 및 파일)

> gradle eclipse

- eclipse 관련 모든 파일 생성
- eclipseClasspath + eclipseProject + eclipseJdt 작업 수행


> gradle cleanEclipseClasspath

- .classpath파일 제거

> gradle cleanEclipseProject

- .project파일 제거

> gradle cleanEclipseJdt

- .settings 폴더 하위 파일 삭제

> gradle cleanEclipse

- eclipse 관련 모든 파일 제거
- cleanEclipseClasspath + cleanEclipseProject + gradle cleanEclipseJdt 작업수행
