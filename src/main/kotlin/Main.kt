import java.math.BigInteger

fun main(args: Array<String>) {
    println("Hello World!")
    //On part de la case 1 et on associe une valeur à chaque case
    var nbGrRiz = BigInteger.ONE
    val nbCases = 64
    var totalRiz =nbGrRiz;
    println("Case numéro 1 : $nbGrRiz grains")
    for(i in 2..nbCases){
        nbGrRiz*=BigInteger.TWO;
        totalRiz +=nbGrRiz;
        println("Case numéro $i : $nbGrRiz grains")
    }
    //2^ 64  = 18,446,744,073,709,551,616 (20 digits)
    println("Fortune en riz de Sissa Dahir : $totalRiz grains")

}