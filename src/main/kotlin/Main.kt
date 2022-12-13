package robotalks.robo
import robotalks.RobotPremium

fun possuiMath(text:String?):Boolean{
    var palavras:List<String>?;
    palavras = text?.split(" ")
    palavras?.forEach {
        var operador:String? = it.uppercase()
        when (operador) {
            "SOMA" -> return true
            "SUBTRAIA" -> return true
            "MULTIPLIQUE" -> return true
            "DIVIDA" -> return true
        }
    }
    return false
}

fun operadorConta(text:String?):String{
    var palavras:List<String>?;
    palavras = text?.split(" ")
    palavras?.forEach {
       return it
    }
    return ""
}


fun main(args: Array<String>) {
    //var c3po = Robo()//versão Comun
   // var c3po = RoboMath()//versão Matemática
    var c3po: RobotPremium = RobotPremium("Escrever em livro")//versão Matemática
    var texto:String?=""

    while(texto!="FIM"){
        c3po.welcome()
        texto = readLine()
        // Para operação matemática digite: Soma 2 + 3
        if(texto!="FIM") {
            if(possuiMath(texto)){
                var operador:String= operadorConta(texto)
                var conta:List<String>? = texto?.split(operador)
                c3po.responda(texto,operador,conta?.get(1))
            }else {
                c3po.responda(texto,null,null)
            }
        }
    }
    println("Adeus!!!")


}