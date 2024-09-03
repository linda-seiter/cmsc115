# CMSC 115 Week 1 Programming Projects

## Setup

TODO: ...

Expand the `week1_project/src/main` folders and `week1_project/src/test` folders
to list the Java classes and corresponding Junit test classes.

<img alt="expland week1_project, src, main folders" src="images/week1_project_files.png" width="200" >

## Task 1 - Poem.java

Click on `Poem.java` to open it in the editor:

```java
/**
 * Poem class demonstrates printing text to the console.
 * @author First Last
 */
public class Poem {
    public static void main(String[] args) {
        // TODO: Add statements to generate a poem

    }
}
```

1. Edit the JavaDoc to update the author tag with your name.
2. Edit the `main` method to add print statements to generate a poem with at
   least 10 lines of output. You may create your own poem or use an existing
   one. Include a title and author. Experiment with adding extra white space in
   between or within the lines of the poem. You can simply add extra spaces
   within a string, or try adding a tab character \t. A sample children's poem
   that uses white space is shown below.

```text
    I LIKE STARS

           Blue stars,
        Red stars,
  Green stars,too.

I like purple stars.
How about you?

           Orange stars,
        Pink stars,
  Yellow stars,too.

I like rainbow stars.
How about you?

        PAMELA JOHNSON
```

3.  Run `PoemTest` to confirm your solution passes the Junit test. The test is
    designed to count the number of lines of output.

## Task 2 - BillSplitter.java

Click on `BillSplitter.java` to open the file in the editor.

```java
/**
 * BillSplitter class demonstrates printing a math expression and order of
 * operations.
 *
 * @author First Last
 */
public class BillSplitter {
    public static void main(String[] args) {
        System.out.print("Each person owes: ");
        System.out.println("94.20 + 94.20 * 0.2 / 2"); // TODO: Fix the errors
    }
}
```

Assume 2 people are splitting a restaurant bill for $94.20 plus a 20% tip. The
program should calculate and print each person's share of the bill using the
formula shown below.

<img src="images/bill_split.png" width="200">

Run the program to view the output. The second print statement has a couple of
errors that prevent the program from producing the expected output.

| Expected Output                       | Actual Output                              |
| ------------------------------------- | ------------------------------------------ |
| Each person owes: 56.52 &nbsp; &nbsp; | Each person owes: 94.20 + 94.20 \* 0.2 / 2 |

1. Edit the `main` method to fix the errors.
2. Run `BillSplitter` to view the output.
3. Run `BillSplitterTest` to confirm your solution passes the Junit tests.

HINT: Recall operator precedence and the default order of operations:

1. Parentheses
2. Multiplication and Division
3. Addition and Subtraction

## Submit Your Solution

If there are any open files in the editor window, right-click on one of the tabs
and select "Close All". You will be prompted if there are unsaved changes.
**Save your changes before submitting.**

TODO: Instructions on submitting
