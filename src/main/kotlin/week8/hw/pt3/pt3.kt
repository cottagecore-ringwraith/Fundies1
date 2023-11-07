package week8.hw.pt3

import khoury.runEnabledTests
import khoury.EnabledTest
import khoury.testSame

// -----------------------------------------------------------------
// Homework 5, Problem 3
// -----------------------------------------------------------------

// In this problem you'll practice designing a data class that has
// methods, making your first upgrade to the project.

// TODO 1/1: Design the data type TaggedFlashCard to represent a
//           single flash card.
//
//           You should be able to represent the text prompt on
//           the front of the card, the text answer on the back,
//           as well as any number of textual tags (such as "hard"
//           or "science" -- this shouldn't come from any fixed
//           set of options, but truly open to however someone
//           wishes to categorize their cards).
//
//           Each card should have two convenience methods:
//           - isTagged, which determines if the card has a
//             supplied tag (e.g., has this card been tagged
//             as "hard"?)
//           - fileFormat, which produces a textual representation
//             of the card as "front|back|tag1,tag2,..."; that is
//             all three parts of the card separated with the pipe
//             ('|') character, and further separate any tags with
//             a comma (',')
//
//           Include *at least* 3 example cards, and make sure to
//           test the methods (in a single testTaggedFlashCard
//           function that has been annotated as @EnabledTest).
//

val sepCard = "|"
val sepTag = ","
// (just useful values for
// the separation characters)



fun main() {
    MyTestSuit.doTheTests()
}

private object MyTestSuit{
    // i have to do this because im doing a proper kotlin file, instead of a script
    // "this" in runEnabledTests isnt avalible in a proper kotlin file.
    // it does the same stuff that you would expect
    // kthxbye

    @EnabledTest
    fun testStartsWithY() {
        testSame(
            // the name of the function to test
            // its expected result
            // some text comment (with commmas)
        )
    }

    fun doTheTests() {
        runEnabledTests(this)
    }
}