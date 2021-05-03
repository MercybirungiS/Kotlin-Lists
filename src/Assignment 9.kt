fun main() {

    println(listString(mutableListOf("Mercy","Angellah","Florence","Yvonne","Olga","Hesed","Birungi","Ssozi","Nambooze","Kisakye")))
    var height= listOf<Float>(23.7f,70.7f,90.34f,56f,80f,67f)
    var avgAndTotal=avgTotal(height)
    println(avgAndTotal)
    val person= listOf(Person("Kisakye",14,5.2,45.0f),
                             Person("Liam",5,3.1,32f),
                                Person("Purity",20,6.1,60f),
                                Person("Edmund",25,6.2,72f))
    var descAge=person.sortedByDescending { Person->Person.age }
    println(descAge)
    peopleList()
    var car= listOf(Car("UFT 666T",14000),Car("UFT 789T",13000),Car("UPG 889T",12000))
    println(cars(listOf(14000,13000,12000)))
}
fun listString(strings:MutableList<String>):MutableList<String>{
    var t= mutableListOf<String>()
    for ( string in strings){
        if (strings.indexOf(string)%2==0){
            t.add(string)
        }
    }
    return t
}
data class ListAvgTotal(var average:Double,var total:Float)
   fun avgTotal  (height:List<Float>):ListAvgTotal{
       var total=height.sum()
       var average=height.average()
       var avgTotal=ListAvgTotal(average,total)
       return avgTotal
   }
data class Person(val name:String,var age:Int, var height:Double,var weight :Float)
data class People(val name:String,var age: Int,var height: Double,var weight: Float)
     fun peopleList (){
         val people= mutableListOf(Person("Kisakye",14,5.2,45.0f),
             People("Liam",5,3.1,32f),
             People("Purity",20,6.1,60f),
             People("Edmund",25,6.2,72f))
         people.addAll(listOf(People("Faith",19,5.5,63f),People("Hope",27,5.7,80f)))
         println(people)
     }
data class Car(var registration :String,var mileage:Int)
fun cars(mileage: List<Int>): Int {
    return mileage.average().toInt()
}










