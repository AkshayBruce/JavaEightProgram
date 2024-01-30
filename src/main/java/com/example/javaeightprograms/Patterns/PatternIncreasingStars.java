package com.example.javaeightprograms.Patterns;

public class PatternIncreasingStars {

    public static void main(String[] args){

        int n=5;

        for(int rows=1;rows<=n;rows++)
        {
            for(int columns=rows;columns<=n;columns++)
            {
                System.out.print("  ");
            }
            for (int columns=1;columns<=rows;columns++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

/**
 * Kotlin null safe
 * var a:String ? = "Interview"
 * a=null; No compilation error
 *
 * var a:String = "Interview"
 *  a=null; compilation error
 *
 *  Safe call operator ?.
 *  Elvis ?:
 *  Not null Assertion !!
 *
 *  name?.toLowerCase()
 *   defines
 *
 *   if(name!=null)
 *   {
 *       name.toLowerCase();
 *   }else
 *   return null;
 *
 * val result = option1?: option2
 *
 * fun main(args: Array<String>)
 * {
 *     var sample: String? = null
 *     str!!.length
 *
 *     Output: expection in thread "main" kotlin.kotlinNullpointerException
 *
 *  String Concatination
 *  $S1 $S2
 *
 *  s1+ s2
 *
 *  s1.plus(s2)
 *
 *  val s3 = StringBuilder()
 *  s3.append(s1).append(s2)
 *  val s4 = s3.toString()
 */