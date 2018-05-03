//메서드 - 파라미터I
package ex3

//배열 값을 받을 때 파라미터를 선언하지 않으면 
//내장변수 it에 저장된다.
plus = {a,b ->
    a + b
}

sum = plus(100,200)
println sum

sum = plus 101, 102
println sum
