package com.capensis.chapter00Specification.test;

/**
 * @author capensis
 */
//我们可以理解scala 在运行时，做了一个包装.
@SuppressWarnings({"AlibabaCommentsMustBeJavadocFormat", "AlibabaRemoveCommentedCode"})
public class TestScala {

    public static void main(String[] paramArrayOfString) {
        //TestScala..MODULE$.main(paramArrayOfString);
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}

@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
final class TestScala$ {
    static final TestScala$ MODULE$;

    static {
        MODULE$ = new TestScala$();
    }

    public void main(String[] args) {
        System.out.println("hello,scala, idea...");
    }
    //private TestScala$() { MODULE$ = this; }

}