object Odd extends App{
    def isOdd(i:Int):Unit={
        if (i%2==0){
            println("Even")}
        else{
            println("Odd")
        }
        
    }
    isOdd(4)
    isOdd(5)
}