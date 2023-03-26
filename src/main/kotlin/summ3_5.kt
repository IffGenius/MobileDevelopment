fun main(){
    println("Please enter number")
    var input = readln().toInt()
    var summ = 0
    for (i in 0..input-1){
        if(i%3==0||i%5==0){
            summ+=i



        }
    }
    println("Summ: $summ ")
}

