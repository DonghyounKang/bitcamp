 //반복문
package ex2

def a = 10

while (a >0) {
    print a + ","
    a-- 
    }

        
//default
for (int i = 0; i < 10; i++)
    print i + ","

//범위 조건 지정
for(i in 0..9)
    print i + ","

    println ""

//배열 조건 지정
for (i in [100, 200, 300, 400,])
    print i + ","

//Map 이용 
for (e in ["홍길동":20, "임꺽정":30, "유관순":16])
    println e.key + "=" + e.value
    
//문자열 선택출력
for(c in "123abc가각간")
    print c + ","
    
    println"" 
    

    