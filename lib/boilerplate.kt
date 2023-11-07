import khoury.runEnabledTests
import khoury.EnabledTest
import khoury.testSame

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