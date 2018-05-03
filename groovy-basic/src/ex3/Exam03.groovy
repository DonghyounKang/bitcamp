//메서드 - closure 파라미터와  it 배열
package ex3

//배열 값을 받을 때 파라미터를 선언하지 않으면 
//내장변수 it에 저장된다.
plus = {
    it[0] + it[1]
}

//배열 선언시
plus2 = {arr ->
    arr[0] + arr[1]
}

println plus([100, 200]) //파라미터 형식: 배열, 결과 : 300
println plus2([100, 200]) //결과는 같다