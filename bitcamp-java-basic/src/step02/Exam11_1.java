//변수의 범위 - 종류
package step02;

public class Exam11_1{
    int a; //인스턴스 변수
    
    static int b; //클래스 변수
    
    public static void main(String[] args/* 로컬변수 = 파라미터 */){
        int c;//로컬변수
    }
    
}  

//인스턴스변수
//new 명령을 사용하여 인스턴스를 준비할 때 생성되는 변수

//클래스 변수(class(static) variable)
//클래스가 로딩될 때 생성되는 변수

//로컬변수(local variable)
//블록을 실행할 때 생성되는 변수
//로컬 변수 중에서 메서드의 argument를 받는 변수를 '파라미터(parameter)'라 부른다.
//ex) 