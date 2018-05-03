//문자열 다루기
package ex5

//문자열 표현
println "문자열 속에 '그냥 문자로 취급' 한다."
println '문자열 속에 "그냥 문자로 취급" 한다.'

// "", '' 모두 문자열 내에서 자유롭게 사용하고 싶은경우 : (/안에 표현/)
println (/double cotation""도 그냥 문자로 사용하고 싶고 single cotation''도 그냥 문자로 사용하고 싶다'/)

//Multi Line String(멀티라인문자열)
//=> 여러줄에 걸쳐 문자열을 작성하고 싶은 경우 """안에 둔다."""
println """
오호라!
이렇게
여러 줄에
걸쳐서
문자열을 작성할 수 있으니
이
얼마나 
좋을쏘냐
"""

//문자열 속에 변수값 넣기
//예전방식
name = "홍길동";
age = 20;

println name + "님의 나이는" + age + "입니다."
println "$name 님의 나이는 $age 입니다"

