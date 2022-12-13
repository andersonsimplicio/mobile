package robotalks


open class Robo{
    var nome:String

    init{
        this.nome="Marciano"
    }
    open fun welcome(){
        println("Ola sou $nome em que posso ajudar?")
    }
    fun isQuest(texto:String?):Boolean{
        var letra = texto?.filter { letra -> letra=='?' }
        return if (letra=="?") true else false;
    }

    fun contemEu(texto:String?):Boolean{
        var palavras:List<String>?;
        palavras = texto?.split(" ",",",".")
        palavras?.forEach {
            if(it=="eu" || it=="EU" || it=="Eu" || it=="eU"){
                return true
            }
        }
        return false
    }

    fun isEducado(texto:String?):Boolean{
        var palavras:List<String>? = texto?.split(" ",",",".")
        palavras?.forEach {
            val (upperCases, notUpperCases) = it.partition{ it.isUpperCase() }
            if(upperCases.isNullOrEmpty())
                return true
        }
        return false
    }

    open fun responda(text:String?,operador:String?,conta:String?){

        if(!text.isNullOrEmpty()) {
            if(!contemEu(text)) {
                if (isEducado(text)) {
                    if (isQuest(text))
                        println("Certamente!")//Apenas Pergunta
                    else
                        println("Tudo bem, como quiser.")//fale qualquer outra coisa
                } else {
                    if (isQuest(text))
                        println("Relaxa, eu sei o que estou fazendo!")//gritar com ele em uma pergunta.
                    else
                        println("Opa! Calma aí!")//Apenas gritar
                }
            }else{
                println("A responsabilidade é sua!")
            }
        }else{
            println("Não me incomode!!!")
        }


    }
}