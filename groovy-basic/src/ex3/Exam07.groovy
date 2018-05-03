//메서드 - 파라미터 IV : 
package ex3


compute = { m -> //m 변수에 파라미터 값으로 메서드를 받아 m에 저장
    m 10, 20 //m에 저장된 메서드 호출
}

compute { a, b -> 
    println a + b
} 

compute { a, b ->
    println a + " - " + b + " = " + (a - b) 
    
}
