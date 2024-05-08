object sample{
  def main(args:Array[String]){
    var ch:String=""
    var num1:Int=0
    var num2:Int=0
    var result:Int=0
    
    print("Enter operations +,-,*,/,%")
    ch=scala.io.StdIn.readLine()
    
    print("Enter num1")
    num1=scala.io.StdIn.readInt()
    
    print("Enter num2")
    num2=scala.io.StdIn.readInt()
    
    ch match{
      case "+"=>result=num1+num2
      case "-"=>result=num1-num2
      case "*"=>result=num1*num2
      case "/"=>result=num1/num2
      case "%"=>result=num1%num2
      case _=>println("nah mate shoo")
    }
    
    println("Result is:"+result)
  }
}