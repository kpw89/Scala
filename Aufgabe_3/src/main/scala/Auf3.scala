/**
  * Created by Kim on 09/05/2018.
  */
class Auf3 {


  //calculates sum of digits for 'number'
  def qs(number:Int):Int = if(number==0) 0 else (number%10) + qs(number/10)
  println(qs(235))




  //fibonacci number for x
  def fibo(x:Int, first:Int=0, second:Int=1):Int = {
    if(x<2) 1
    else first + fibo(x-1, second, second+first)
  }
  def fib(n:Int):Int = if(n<2) 1 else fib(n-1)+fib(n-2)
  fib(4)
  fibo(4)





  //tests if x can be divided with every number from 1-y
  def kl (x:Int, y:Int):Boolean = {
    if(y==1)true
    else if (x%y != 0) false
    else kl(x,y-1)
  }
  //searches for smallest that can be divided from 1- m
  def kl_ex (m:Int, i:Int=1):Int={
    if(kl(i,m))i
    else kl_ex(m,i+1)
  }
  kl_ex(10)




  //checks if if x is prime number
  def isPrim(x:Int, y:Int=2):Int={
    if(y==x)x
    else if(x%y==0)0
    else isPrim(x,y+1)
  }
  //add every primenumber up to 200
  def primSum(x:Int=1, y:Int=0):Int={
    if(x==200)y
    else y + primSum(x+1,isPrim(x))
  }

  primSum()

}
