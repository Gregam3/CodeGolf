/**
 * My rules for convenience sake
 * 1. Only the method body counts
 * 2. The method the challenge is declared in cannot be used to complete the task, it simply isolates
 * isolates it and gives it the necessary inputs
 * 3. The method has no external dependencies
 * 4. No library can be used that is not native to scala
 */
object Main extends App {
  divisors

  /**
   * Must return the value of a factorial of n
   * rules: cannot use product
   *
   * @param n the number to calculate the factorial of
   */
  def factorial(n: Int) = {
    1.to(n)reduce(_*_)
  }

  /**
   * https://codegolf.stackexchange.com/questions/58615/1-2-fizz-4-buzz/196919#196919
   */
  def fizzbuzz = {
    1.to(100).map(n=>{print("\n"+n+(if(n%3==0)"fizz")+(if(n%5==0)"buzz"))})
  }

  def divisors = {
    val r=1.to(100);r.map(i=>println(i,r.filter(i%_==0).size))
  }
}