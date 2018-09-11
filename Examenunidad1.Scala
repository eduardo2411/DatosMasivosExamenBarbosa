//1
def isPar (num: Int): Boolean={
    if(num % 2 == 0){
      return true
    }
  return false
}
print("Ingrese un numero para saber si es par o impar: ")
val input = readIntprintln("1 - Verificacion de numeros pares")
def isPar (num: Int): Boolean={
    if(num % 2 == 0){
      return true
    }
  return false
}
print("Ingrese un numero para saber si es par o impar: ")
val input = readInt
print("El valor es: ")
println(isPar(input))
println("")
readLine
print("El valor es: ")
println(isPar(input))
println("")
readLine

//2
println("2 - Verificacion de numeros pares de una lista")
def pares (numeros: Int): Boolean={
    if (numeros % 2 == 0) {
      return true
    }
  return false
}
val listas = List(12,15,20,21,16)
var a = 0
for(a <- listas){
  if (a <= a) {
    print("El valor " + a + " es: ")
    println(pares(a))
  }
}
println("")
readLine


//3
println(" Afortunado")
val fortuna = List(7,7)
def afortunado (siete: List[Int]): Int={
  var sumando = 0
  for (n <- fortuna){
    if(n == 7){
      sumando += n*2
    }else {
      sumando += n
    }
  }
  return sumando
  }
println(afortunado(fortuna))
println("")
readLine
//4
println("4 - Balanceo")
val listona = List(5,1,4,2)
def balanceo (balancear: List[Int]): Boolean={
  val (a,b) = balancear.splitAt(balancear.length/2)
  if (a.sum == b.sum){ return true }
  else return false
}
println(balanceo(listona))
println("")
readLine
//5
def palindromo(s : String): Boolean = s match {
  case s
  if s.length > 1 => (s.head == s.last) && palindromo(s.slice(1, s.length-1))
  case x => true
}
println()
var palabra1 = readLine
print("Escribir Palabra")
palindromo(palabra1)
println()
