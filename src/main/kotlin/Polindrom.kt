

fun main() {
    println("input String")
    val input = readln()
    var polindrom = "zzzzzz"
    for (i in 1..((input.length) - 2))
    {
        if(input[i]==input[i-1]){
            var newPolindrom = input.substring(i - 1, i + 1)
            if (newPolindrom.compareTo(polindrom) < 0)
            {
                polindrom = newPolindrom
            }
        }
        if (input[i - 1] == input[i + 1])
        {
            var newPolindrom = input.substring(i - 1, i + 2)

            if (newPolindrom.compareTo(polindrom) < 0)
            {
                polindrom = newPolindrom
             }
        }
    }
    if (polindrom == "zzzzzz")
    {
        println("-1")
    }
    else
    {
        println(polindrom)
    }
}