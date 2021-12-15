//2. 실행결과를 쓰시오.
package com.codingtest;

public class FinallyClause {
    static int count = 0;

    public static void main(String[] args) {
        while (true){
            try {
                if (++count == 1) throw new Exception();
                if (count == 3) break;
                System.out.println(count+") No Exception");
            }
            catch (Exception e){
                System.out.println(count+") Exception thrown");
            }
            finally {
                System.out.println(count+") in finally clause");
            }
        }
        System.out.println("Main program ends");
    }
}
/*
1) Exception thrown
1) in finally clause
2) No Exception
2) in finally clause
3) in finally clause
Main program ends
 */
