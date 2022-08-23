class Patinete (
    var marca:String,
    var luzDeLed:String,
    var rodas:String,
    var acelerador:String,
    var freio:String,
    var bateria:String,
    var campainha:String,

        ) {

    var cilindrada = false

    constructor(
        marca: String,
        luzDeLed: String,
        rodas: String,
        acelerador: String,
        freio: String,
        bateria: String,
        campainha: String,
        cilindrada:Boolean,

    ):this(marca,luzDeLed,
        rodas,
        acelerador,
        freio,
        bateria,
        campainha,
    ){this.cilindrada= cilindrada



    }

    fun componente0() {
        println("É da marca: $marca")
    }

    fun componente1() {
        println("Possui: $luzDeLed")


    }

    fun componente2() {
        println("possui: $rodas")


    }

    fun componente3() {
        println("possui: $acelerador")


    }

    fun componente4() {
        println("possui: $freio")


    }

    fun componente5() {
        println("possui: $bateria")


    }

    fun componente6() {
        println("possui: $campainha ")
    }
    fun componente7(){
        println("Cilindradas para essa categoria 40cc $cilindrada")

    }
}


