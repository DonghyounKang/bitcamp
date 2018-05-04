//메서드 - 파라미터 III : Closure 파라미터1
package ex3


compute = { m -> //파라미터 값으로 메서드를 받아 m에 저장
    m() //m에 저장된 메서드 호출
}

//compute를 호출할 때 파라미터로 메서드(closure)를 넘긴다.
compute ({println "안녕!"})
println"-------------------"

compute ({ //파라미터가 없는 클로저이다.
    println "오호라"
    println"반가비!"
    })
println"-------------------"

//메서드 호출시 () 생략 가능
compute { //파라미터가 없는 클로저이다.
    println "오호라"
    println"반가비!"
    }
println"-------------------"
