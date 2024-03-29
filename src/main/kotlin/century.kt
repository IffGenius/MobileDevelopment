import kotlin.math.absoluteValue



fun main() {
    var year: Int
    var century: Int
    var input: String

    for(i in 1..100) {
        println("Enter Year")

        input  = readlnOrNull().toString()
        if(input=="0" || input==""){
            println("Error: invalid value, try again ")

        }else {
            year = input.toInt()


            if ((year > 0) && (year % 100 != 0)) {
                century = ((year-1) / 100)+1
                println("$year is $century century AD")

            } else {
                if ((year > 0) && (year % 100 == 0)) {
                    century = ((year-1) / 100)+1
                    println("$year is $century century AD")
                }
            }
            if ((year < 0) && (year % 100 != 0)) {
                century = ((year-1) / 100)+1
                println("$year is $century century BC")
            } else {
                if ((year < 0) && (year % 100 == 0)) {
                    century = (year.absoluteValue) / 100
                    println("$year is $century century BC")
                }
            }
            println("Do you want more(y/n)")
            val repeat = readlnOrNull()
            if (repeat == "n") {
                break
            }
        }
    }
    println("Bye Bye")

}
