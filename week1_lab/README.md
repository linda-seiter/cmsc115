# CMSC 115 Week 1 Lab

## Learning Objectives

- Run a Java application
- Run a Junit test
- Modify a Java class
- Use comments to document code
- Comment out code to prevent execution
- Apply rules of operator precedence
- Fix common syntax errors

## Setup

TODO: Instruction on starting VS Code, opening workspace, opening README.md.

## Task 1 - CourseWelcome.java

The Package Explorer displays a lab project for each week.

![Package Explorer](images/package_explorer.png)

Expand the `week1_lab > src > default package` folders to view the files in the
default package:

![Expand week1_lab, src, default package](images/expand_project_folders.png)

Double click on `CourseWelcome.java` to open the file in the editor window.

![open file from Package Explorer](images/open_file.png)

A Java class with a `main` method represents an executable program. The `main`
method is automatically called when you run the program.

```java
public class CourseWelcome {

    public static void main(String[] args) {
        System.out.println("Welcome to CMCS 115.");
        System.out.println("Let's learn Java!");
    }
}
```

When the `main` method executes, the two print statements produce the following
output:

```text
 Welcome to CMSC 115
 Let's learn Java!
```

Let's execute the program and view the output.

1. Click `CourseWelcome.java` in the Package Explorer to select the file.
2. Click the green triangular run button on the workbench toolbar, or select
   _Run > Run As > Java Application_ from the menubar.
   ![click run button on workbench toolbar](images/run_java.png)
3. The program output is displayed in the console window.
   ![console output](images/console.png)

Sometimes a program has an error and fails to produce the expected output. It is
important to thoroughly test every Java class to find and fix bugs.
[Junit](https://junit.org/junit5/) is a popular Java testing framework. For each
regular Java class, we use a separate Junit class to test the functionality.

- Java class `CourseWelcome`
- Junit test class `CourseWelcomeTest`

Don't worry about understanding the code in `CourseWelcomeTest`. We'll learn how
to write Junit tests in a later lesson.

Let's practice running a Junit test:

1. Click on `CourseWelcomeTest.java`, then click the run button.
   ![console output](images/run_test.png)
2. The test runs the `main` method in `CourseWelcome`, then compares the actual
   output to the expected output. The Junit window appears with a green bar to
   indicate the test was successful. The Junit window also indicates 1 test ran
   with 0 errors and 0 failures. ![console output](images/test1_passed.png)
3. You can close the Junit view after verifying the test passed.

<img src="images/close_junit.png" alt="close junit view" width=200>

### Java Perspective

An Eclipse perspective contains an arrangement of views and an editor area. We
will primarily work with two Eclipse perspectives:

- **Java perspective**: For editing and running a Java class.
- **Debug perspective**: For debugging a Java class.

The **Java perspective** is the default perspective and displays the Package
Explorer, Task List, Outline, and Problems view.

If you accidentally close a view such as the Package Explorer, you can restore
it from the main menu by selecting _Window > Perspective > Reset Perspective_:

<img src="images/reset_perspective.png" alt="reset java perspective" width=300>

Try closing the Package Explorer view, then get it back by restoring the Java
perspective.

NOTE: Occasionally you might find yourself in a different perspective such as
Debug or Java Browsing (which is different than the Java perpective). You can
restore the layout to the Java perspective by selecting _Window > Perspective >
Open Perspective > Java_.

<img src="images/open_java_perspective.png" alt="open java perspective" width=300>

## Task 2 - JavaFacts.java

Double click on `JavaFacts.java` in the Package Explorer to open the file in the
editor.

```java
public class JavaFacts {

    public static void main(String[] args) {
        System.out.println("Java was initially named Oak.");
        System.out.println("Java is a language.");
    }

}
```

`JavaFacts` should produce the expected output displayed below. However, the
actual output produced by the current code differs from the expected output.

| Expected Output                                                       | Actual Output                                        |
| --------------------------------------------------------------------- | ---------------------------------------------------- |
| Java was initially named Oak.<br>Java is an object-oriented language. | Java was initially named Oak.<br>Java is a language. |

1. Click on `JavaFacts.java`, then click the run button to view the output.
   Notice the actual output does not match the expected output.
2. Click on the Junit class `JavaFactsTest.java`, then click the run button to
   run the test. The red bar indicates a test failed. Junit also displays the
   failure count to indicate the number of test methods that failed.

![task 2 test fails](images/test2_failed.png)

Junit provides a popup window to compare the actual and expected test results:

1. Expand and click on the failed test.
2. Click the "Compare Actual With Expected Test Result" icon.
3. The difference is displayed in the popup window.
   ![task 2 compare results](images/test2_result_comparison.png)

Let's fix `JavaFacts` to produce the expected output.

1. Edit the second statement in the `main` method to print the character string
   "Java is an object-oriented language". Save your changes by selecting
   `File > Save` from the menu bar, or type `Ctrl-S` (Windows/Linux) or
   `Command-S` (Mac).
2. Run `JavaFacts` and view the output in the console.
3. Run `JavaFactsTest` and confirm your solution passes the test.

Close any open files by clicking the `X` on the editor window tab.

![close file in editor window](images/close.png)

## Task 3 - Comments.java

Java comments can be used to help explain the code. A comment can also prevent
one or more lines of code from executing.

- Line comment: Text following `//` is ignored.
- Block or multi-line comment: Text between `/*` and `*/` is ignored.

Double click on `Comments.java` in the Package Explorer to open the file in the
editor, then run the program to view the output.

```java
public class Comments {

    public static void main(String[] args) {

        System.out.println("apple");

        //System.out.println("orange");

        System.out.println("pear");  //End of line comment

        /*
        System.out.println("lemon");
        System.out.println("banana");
         */

        System.out.println("watermelon");

        System.out.println("peach");
    }
}

```

<table>
<tr>
<th>Expected Output</th>
<th>Actual Output</th>
</tr>
<tr>
<td>apple<br>pear<br>watermelon<br><br></td>
<td>apple<br>pear<br>watermelon<br>peach</td>
</tr>
</table>

- The print statements for "orange", "lemon", and "banana" are commented out and
  do not execute.
- The print statement for "pear" executes since `//` is placed _after_ the
  statement.

Notice the expected output does not include "peach". Let's fix the program to
produce the expected output:

1. Add `//` to comment out the last print statement (don't delete it!).
2. Run `Comments` to view the output.
3. Run `CommentsTest` to confirm your solution passes the Junit test.

Save and close any open files.

## Task 4 - Fixit.java

Double click on `Fixit.java` in the Package Explorer to open the file in the
editor.

```java
public class Fixit {

   public static void main(String[] args) {
      System.out.println("ship");
      //System.out.println("airplane")
      System.out.println("tank");
   }

}
```

<table>
<tr>
<th>Expected Output</th>
<th>Actual Output</th>
</tr>
<tr>
<td>ship<br>airplane<br>tank</td>
<td>ship<br>tank<br><br></td>
</tr>
</table>

Run the program to view the output. The second print statement is commented out
so the program does not produce the expected output.

1. Remove the comment characters `//` from the second print statement.
2. Try to run the program. A warning message appears indicating an error in the
   code. Click "Proceed" to try to execute it anyway.<br>
   ![run warning](images/run_warning.png)
3. The program fails to run. The error message indicates line 5 is missing a
   semicolon. <br>
   ![compilation error message in console](images/console_error_message.png)
4. Notice the editor window also displays red warning symbols on line 5. Hover
   the mouse over either warning symbol to view the error message. <br>
   ![compiler displays warning symbol near syntax error](images/compiler_warning.png)

Every statement in the `main` method must end with a semicolon. Let's fix the
syntax error so the program can execute.

1. Add a semicolon to the end of line 5.
2. Run `Fixit` to view the output.
3. Run `FixitTest` to confirm your solution passes the Junit test.

Save and close any open files.

## Task 5 - Printing.java

Double click on `Printing.java` in the Package Explorer to open the file in the
editor.

```java
public class Printing {

    public static void main(String[] args) {
        System.out.println("red ");
        System.out.print("green ");
        System.out.println("blue ");
        System.out.print("pink ");
        System.out.println("yellow");
    }

}
```

- `System.out.println`: Appends a newline character. Subsequent output appears
  on the next line.
- `System.out.print` : Does not append a newline character. Subsequent output
  appears on the same line.

<table>
<tr>
<th>Expected Output</th>
<th>Actual Output</th>
</tr>
<tr>
<td>red <br>green blue <br>pink <br>yellow</td>
<td>red <br>green blue <br>pink yellow<br><br></td>
</tr>
</table>

Run the program to view the output. In the expected output, "yellow" appears on
a separate line from "pink". Let's fix the program to produce the expected
output:

1. Adjust the statement `System.out.print("pink ");` so a newline character is
   appended after printing "pink".
2. Run `Printing` to view the output.
3. Run `PrintingTest` to confirm your solution passes the Junit test.

Save and close any open files.

## Task 6 - MathematicalExpression.java

Double click on `MathematicalExpression.java` in the Package Explorer to open
the file in the editor.

```java
public class MathematicalExpression {

    public static void main(String[] args) {
        System.out.print("2 + 3 * 8 = ");
        System.out.println(2 + 3 * 8);
    }

}
```

Run the program and confirm the output as shown below:

```text
2 + 3 * 8 = 26
```

A `String` is a sequence of characters surrounded by double quotes. An unquoted
arithmetic expression evaluates to a numeric value.

<table>
<tr>
<td>Expression</td><td>Value</td>
</tr>
<tr>
<td>"2 + 3 * 8 = "</td><td>"2 + 3 * 8 = "</td>
</tr>
<tr>
<td>2 + 3 * 8</td><td>26</td>
</tr>
</table>

<br>

<table>
<tr>
<th>Expected Output</th>
<th>Actual Output</th>
</tr>
<tr>
<td>(2 + 3) * 8 = 40</td>
<td>2 + 3 * 8 = 26</td>
</tr>
</table>

1. Adjust the 2 print statements to produce the expected output, adding
   parenthesis to both the string and the mathematical expression to force `+`
   to be performed before `*`.
2. Run `MathematicalExpression` to view the output.
3. Run `MathematicalExpressionTest` to confirm your solution passes the Junit
   test.

Save and close any open files.

## Task 7 - SelfIntroduction.java

In this task, you will create a new Java class named `SelfIntroduction` and add
print statements to the `main` method to introduce yourself.

NOTE: The Junit test class `SelfIntroductionTest` already exists for testing
your new class `SelfIntroduction`.

In the Project Explorer, right-click on `week1_lab>src>(default package)` and
then select `New > Class` from the popup menu.

<img src="images/new_class.png" alt="create new class" width=400>

Confirm the source folder and package are as shown in the form below (press
Cancel if there is an error). Enter the class name `SelfIntroduction` and check
the box to generate a `main` method. Press "Finish" to create the class.

<img src="images/new_class_form.png" alt="new class form" width=400>

You should see `SelfIntroduction.java` in the Package Explorer. The code editor
view will contain the new Java class with a `main` method.

<img src="images/new_class_editor.png" alt="new class in editor view" width=400>

1. Edit the code as shown below to add the sample block comment before the class
   header (replace First and Last with your name). This is a JavaDoc comment,
   which is used to generate documentation in HTML format from Java source code.
   We'll learn more about JavaDoc in a later lesson.
2. Edit the `main` method to add print statements to introduce yourself. The
   program should produce at least 4 lines of output.
3. Run `SelfIntroductionTest` to confirm your solution passes the Junit test.
   The test is designed to count the number of lines of output.

```java
/**
 * SelfIntroduction class demonstrates at least 4 print statements.
 * @author First Last
 */
public class SelfIntroduction {

    public static void main(String[] args) {
        System.out.println("My name is ...");
    }

}
```

NOTE: The Junit test will fail if you did not name your class
"SelfIntroduction". Spelling and case matter in Java. You can't just change the
class name in the code editor, you also need to change the file name to match
exactly in the Project Explorer.

If you need to rename a class:

1. Right-click on the class file in the Package Explorer.
2. Select _Refactor > Rename_.
3. Type in the new class name and press Finish.

Save and close any open files.

## Submit Your Solution

If there are any open files in the editor window, right-click on one of the tabs
and select "Close All". You will be prompted if there are unsaved changes.
**Save your changes before submitting.**

![close all and save](images/close_all.png)

TODO: Instructions on submitting
