fun main(){
    val input = readln()
    var mod=false
    for (item in input){
        if(item == '-' || item == '_'){
            mod=true
        }else{
            if(mod){
                print(item.uppercaseChar())
                mod=false
            }else {
                print(item)
            }
        }
    }
}



