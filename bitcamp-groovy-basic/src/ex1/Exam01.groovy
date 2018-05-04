//Groovy 실행 원리
package ex1

// 블록 밖에 그냥 작성하는 코드는 Exam01의 run()메서드 안에 포함된다.
// => Exam01의 main()메서드에서 run()을 호출한다.

println "Hello!"


//Exam01 클래스의 메서드로 정의된다.
def plus(a, b) {
    a + b
}

sum = plus(10, 20)
println sum