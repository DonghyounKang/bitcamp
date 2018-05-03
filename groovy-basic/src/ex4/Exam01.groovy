//클래스 정의
package ex4
//groovy는 기본적으로 다음의 패키지를 자동으로 import한다.
// => 따라서 다음 패키지의 클래스 사용시 별도의 import가 필요없다.

/*
 * import java.util.*;
 * import java.math.*;
 * import java.io.*;
 * import java.net.*;
 * import groovy.lang.*;
 * import groovy.util.*;
 */


//클래스를 정의했을 때 자동으로 groovy.lang.GroovyObject 인터페이스를 구현한다.
class Exam01{
    void hello() {
        println "안녕하세요!"
    }
}

