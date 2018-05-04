//메서드 - closure
package ex3

//간단한 메서드 작성시 형식을 갖출 필요가 없다.

plus = {int a, int b ->
    return a + b
}
//화살표 왼쪽: 파라미터
//화상표 오른쪽: 코드 블록

plus2 = {a, b ->
    a + b // return 생략 시 마지막 문장의 실행 값이 리턴된다.
}

println plus
println plus2