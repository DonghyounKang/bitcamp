//맵 
package ex1

//맵 만들기
map1 = ["홍길동":20,"임꺽정":30,"유관순":16]
println map1["홍길동"]
println map1.홍길동

//map1의 클래스 알아내기
println map1.getClass()//class java.util.LinkedHashMap

//map의 값 변경
map1.홍길동 = 40
println map1.홍길동

//빈맵 만들기
emptyMap = [:]
println emptyMap
println emptyMap.getClass()