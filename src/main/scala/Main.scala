
/**
 * My rules for convenience sake
 * 1. Only the method body counts
 * 2. The method the challenge is declared in cannot be used to complete the task, it simply isolates
 *  isolates it and gives it the necessary inputs
 * 3. The method has no external dependencies
 * 4. No library can be used that is not native to scala
 */
object Main extends App {
  println(factorial(5))

  /**
   * Must return the value of a factorial of n
   * rules: cannot use product
   * @param n the number to calculate the factorial of
   */
  def factorial(n: Int) = {
    1.to(n)reduce(_*_)
  }
}