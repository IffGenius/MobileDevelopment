fun main(){
    println("Please enter number")
    val input = readln().toInt()
    var summ = 0
    for (i in 0 until input){
        if(i%3==0||i%5==0){
            summ+=i



        }
    }
    println("Summ: $summ ")
}

