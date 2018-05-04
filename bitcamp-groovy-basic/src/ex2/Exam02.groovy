//분기문 : switch
package ex2

switch ("500") {
    case "aaa" : println "aaa입니다."; break
    case 50 : println "50입니다"; break
    // 배열로 선언하여 배열 내 있는 값에 해당하는 경우 실행
    case [2, 3, 5, 7] : println "소수입니다."; break 
    // 정수만 허용
    case 100..200 : println "100 ~ 200사이의 값"; break 
    // 숫자인 경우 
    case Number : println "숫자입니다."; break
    // 문자열인 경우
    case String : println "문자열입니다."; break
    default : println "기타입니다."
    
}
