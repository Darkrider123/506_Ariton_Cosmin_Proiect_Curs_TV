/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 23 06:58:38 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Exam_ESTest extends Exam_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf((String) null);
      Integer integer0 = new Integer(20);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(2, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = new Boolean(false);
      Integer integer0 = new Integer(25);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(3, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf("v>B02");
      Integer integer0 = new Integer(35);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(4, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = new Boolean("");
      Integer integer0 = new Integer(45);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(5, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf("`_%.FPx]?2.sHpYbC");
      Integer integer0 = new Integer(55);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(6, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = new Boolean("gv`-%");
      Integer integer0 = new Integer(65);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(7, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = new Integer(75);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(8, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = new Boolean("");
      Integer integer0 = new Integer(85);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(9, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf("<&Iwf4k0;!W1");
      Integer integer0 = new Integer(95);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(10, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = new Boolean(true);
      Integer integer0 = new Integer(0);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf((String) null);
      Integer integer0 = new Integer(600);
      // Undeclared exception!
      try { 
        exam0.grade(boolean0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid points
         //
         verifyException("Exam", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf("v>B02");
      Integer integer0 = new Integer(0);
      Integer integer1 = exam0.grade(boolean0, integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Exam exam0 = new Exam();
      Boolean boolean0 = Boolean.valueOf(false);
      Integer integer0 = new Integer((-1280));
      // Undeclared exception!
      try { 
        exam0.grade(boolean0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid points
         //
         verifyException("Exam", e);
      }
  }
}
