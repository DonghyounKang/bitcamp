//메서드
package ex3

int plus(int a, int b) {
    return a+b;
}

def plus2(a, b) {
    a + b
    
}

println plus(100,200)
println plus2(100,200)

//메서드 호출 시 괄호없이 파라미터 전달 가능하다
sum = plus 100, 200
println sum

sum2 = plus2 100, 200
println sum
