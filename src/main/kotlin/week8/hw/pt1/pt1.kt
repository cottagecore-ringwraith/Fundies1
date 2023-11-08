package week8.hw.pt1

import khoury.*


// -----------------------------------------------------------------
// Homework 5, Problem 1
// -----------------------------------------------------------------

// In this problem, you'll practice selecting a loop type (either
// for, while, or do-while) for a task.

// TODO 1/1: Finish designing the function affirmTillDone that
//           outputs a supplied affirmation to the screen; after
//           each such output, prompt the user to type something
//           and end the program if they type a particular phrase,
//           otherwise output the affirmation again!
//
//           You have been supplied tests that should pass once the
//           function has been completed.
//
//           Note: since we are practicing with loops, you should
//                 NOT use either reactConsole or list abstractions
//                 (as a reminder, the input function in the Khoury
//                 library can help you get keyboard input).
//
val exitResponse = "exit"
val promptPhrase = "Press '$exitResponse' to indicate you are done :)" // renamed from just prompt
val finished = "Have a good day!"

fun affirmTillDone(affirmation: String){
    do {
        println(affirmation)
        println(promptPhrase)
    } while (input() != exitResponse)
    println(finished)
}



fun main() {
    MyTestSuit.doTheTests()
}

object MyTestSuit {
    // i have to do this because im doing a proper kotlin file, instead of a script
    // "this" in runEnabledTests isnt avalible in a proper kotlin file.
    // it does the same stuff that you would expect
    // kthxbye

    @EnabledTest
    fun testAffirmTillDone() {
        // Brené Brown
        val affirmation1 = "Courage starts with showing up and letting ourselves be seen."
        val helpTest1 = { affirmTillDone(affirmation1) }

        // Michelle Obama
        val affirmation2 = "Am I good enough? Yes I am."
        val helpTest2 = { affirmTillDone(affirmation2) }

        testSame(
            captureResults(
                helpTest1,
                "again",
                "AGAIN",
                exitResponse,
            ),
            CapturedResult(
                Unit,
                affirmation1, "", promptPhrase,
                affirmation1, "", promptPhrase,
                affirmation1, "", promptPhrase,
                finished,
            ),
            "one",
        )

        testSame(
            captureResults(
                helpTest2,
                "MORE",
                exitResponse,
            ),
            CapturedResult(
                Unit,
                affirmation2,
                "",
                promptPhrase,
                affirmation2,
                "",
                promptPhrase,
                finished,
            ),
            "two",
        )
    }

    fun doTheTests() {
        runEnabledTests(this)
    }
}




