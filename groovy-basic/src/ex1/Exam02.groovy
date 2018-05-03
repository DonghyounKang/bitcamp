//변수선언
package ex1

//타입을 지정하지 않으면 동적타입 바인딩을 수행한다.
// 값을 넣을 때 변수의 타입이 결정된다.
def a = 20 //map.put("a",20);
println a

a = "hello" //map.put("a","Hello")
println a


b = 3.14
println b

int c = 20
println c // 
//다른 타입의 값을 넣으면 오류발생
//c = "hello"
//println c // 에러발생 


//문자열과 자동형변환
String d = "hello"
d = 20 //정수 값 20이 "20"이라는 문자열로 변환되어 d변수에 저장된다.

//자바변수선언 : 변수 선언 시 자바문법을 그대로 사용할 수 있다.
java.util.Date today = new java.util.Date()
println today
//groovy는 java.util package를 기본으로 import한다.

Date today2 = new Date()
println today2
