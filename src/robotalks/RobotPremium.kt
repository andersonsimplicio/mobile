package robotalks

interface acao{

    fun agir()
}

class RobotPremium(atividade:String?): RoboMath(),acao {
    var at:String? = null
    init{
        at = atividade
    }
    override fun agir() {
        println("É pra já")
    }

    override fun responda(text: String?,operado:String?,conta:String?) {
        if(!text.isNullOrEmpty()) {
                if("agir" in text){
                    agir()
                    println("${this.at}")
                }else {
                    if (!operado.isNullOrEmpty()) {
                        println("Essa eu sei ${conta} =  ${contaResp(operado, conta)}")
                    } else {
                        if (!contemEu(text)) {
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
                        } else {
                            println("A responsabilidade é sua!")
                        }
                    }
                }
        }else{
            println("Não me incomode!!!")
        }
    }
}