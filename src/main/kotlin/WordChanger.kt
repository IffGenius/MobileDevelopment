fun main(){
    var input = readln()
    var mod=false
    for (item in input){
        if(item.equals('-')||item.equals('_')){
            mod=true
        }else{
            if(mod==true){
                print(item.uppercaseChar())
                mod=false
            }else {
                print(item)
            }
        }
    }
}



