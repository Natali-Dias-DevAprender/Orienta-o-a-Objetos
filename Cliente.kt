class Cliente (
     var nome:String,
     var cpf:String,
     var endereco:String,
     var telefone:String,
     var email:String,
     var compras:String,
    ){
    fun nomeDoCliente(){
        println("Nome do cliente: $nome")


    }
    fun dadosDoCliente(){
        println("cpf do cliente: $cpf")


    }
    fun localizaoDoCliente(){
        println("enderço do cliente: $endereco")


    }
    fun contatoDoCliente(){
    println("contato do cliente: $telefone")


}
    fun emailDoCliente(){
    println("email do cliente: $email")


}
    fun comprasDoCliente(){
        println("compras efetuadas pelo cliente: $compras")
    }


    }