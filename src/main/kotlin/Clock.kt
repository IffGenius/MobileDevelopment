fun main(){

   println("Enter time(hh mm)")
    val input = readln()
    var hours = 0
    var minute = 0
    var sum = ""

    if(input[2]==' ')
    {
        sum= (input[0].toString()+input[1].toString())
        hours=sum.toInt()
        sum= input[3].toString()+input[4].toString()
        minute=sum.toInt()

    }else{
        sum= (input[0].toString())
        hours=sum.toInt()
        sum= input[2].toString()+input[3].toString()
        minute=sum.toInt()
    }
    var trueHours = 12-hours
    if(trueHours==0){
        trueHours=12
    }

    var trueMinute = 60-minute
    if(trueMinute==60){
        println("true Time: $trueHours 00")
    }
    else {
        println("true Time: $trueHours $trueMinute")
    }


}