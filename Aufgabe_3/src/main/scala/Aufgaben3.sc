import scala.util.Random
val r= scala.util.Random

def calculatePi(lst:List[Double]=Nil,i:Int=1000):List[Double]={
  if (i==0){
    lst
  }

  else{
    val x=r.nextDouble()
    calculatePi(x::lst,i-1)
  }
}

val ll= calculatePi()



def check(lst:List[Double],c:Int=0,i:Int=500,x:Int=0):Double={
  if (i==0) {
    println(c)
    println(lst.length)
    c.toDouble / lst.length.toDouble

  }
  else if (lst(x)*lst(x)+lst(x+1)*lst(x+1)<1)
    check(lst,c+1,i-1,x+2)
  else check(lst,c,i-1,x+2)

}

val result = check(calculatePi())