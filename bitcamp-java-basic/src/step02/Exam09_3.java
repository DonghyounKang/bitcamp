//18.03.06(2주차)
// 배열 - 배열 레퍼런스와 배열 인스턴스(배열의 비밀)
package step02;

public class Exam09_3{
    public static void main(String[] args){
         
        int[] arr1;//레퍼런스 변수: 메모리에 주소를 담는 변수 / 배열 레퍼런스

        
        
        //new명령은 메모리를 확보하는 명령이다(메모리를 생성한다(=만든다, 준비시킨다))
        //=>확보된 메모리는 연속적이어야 한다
        //리턴 값은 확보된 메모리의 시작 주소
        //배열은 반드시 연속된 메모리 
        //이렇게 값을 저장하기 위해 확보된 메모리를 "인스턴스"라고 한다.
        
        arr1 = new int[5];  //배열 인스턴스 

        arr1[0] = 100; // arr1에 저장된 주소로 찾아가서 0번째 항목에 값을 넣어라
        arr1[1] = 200; // arr1에 저장된 주소로 찾아가서 1번째 항목에 값을 넣어라

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        
        // 단 한번이라도 메모리에 값을 넣지 않은 상태에서 
        //그 메모리의 값을 사용하려 하면 컴파일 오류가 발생한다.
        int a;
        //System.out.println(a); //컴파일오류

        //하지만 new 명령으로 확보된 메모리는 종류에 상관없이
        //자동으로 0으로 초기화
        //따라서 값을 넣지 않고 바로 사용할 수 있다.
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);


        /* 

        */
    }
}

/*

레퍼런스(reference)
-값이 아닌 메모리의 주소를 담는 변수

인스턴스(instance)(=object)
-값을 저장하고 있는 메모리(실제적인 예)

*/