package robotalks

open class RoboMath: Robo() {
     fun contaResp(operador:String?,conta:String?): Float {
         var palavras:List<String>?;
         var ope:String? = operador?.uppercase()
         when(ope){
             "SOMA" -> {
                 val palavras=conta?.split('+')
                 var n1:String? = palavras?.get(0)?.replace(" ","")
                 var n2:String? = palavras?.get(1)?.replace(" ","")
                 var s1 = n1?.toFloat()
                 var s2 = n2?.toFloat()
                 if (s1 != null) {
                     return s1 + s2!!
                 }
             }
             "SUBTRAIA" -> {
                 val palavras=conta?.split('-')
                 var n1:String? = palavras?.get(0)?.replace(" ","")
                 var n2:String? = palavras?.get(1)?.replace(" ","")
                 var s1 = n1?.toFloat()
                 var s2 = n2?.toFloat()
                 if (s1 != null) {
                     return s1 - s2!!
                 }
             }
             "MULTIPLIQUE" -> {
                 val palavras=conta?.split('*')
                 var n1:String? = palavras?.get(0)?.replace(" ","")
                 var n2:String? = palavras?.get(1)?.replace(" ","")
                 var s1 = n1?.toFloat()
                 var s2 = n2?.toFloat()
                 if (s1 != null && s2!=null) {
                     return s1 * s2
                 }
             }
             "DIVIDA" ->{
                 val palavras=conta?.split('/')
                 var n1:String? = palavras?.get(0)?.replace(" ","")
                 var n2:String? = palavras?.get(1)?.replace(" ","")
                 var s1 = n1?.toFloat()
                 var s2 = n2?.toFloat()
                 if (s1 != null && s2!=null && s2.toInt() != 0) {
                     return s1 / s2
                 }
             }
         }

        return 0.toFloat()
     }
     override fun responda(text: String?,operado:String?,conta:String?) {
         if(!text.isNullOrEmpty()) {
               if(!operado.isNullOrEmpty()){
                   println("Essa eu sei ${conta} =  ${contaResp(operado,conta)}")
               }else{
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
         }else{
             println("Não me incomode!!!")
         }
     }
}