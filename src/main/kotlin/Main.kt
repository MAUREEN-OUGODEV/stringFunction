fun main(){

    school()
   println( nameAndAge("maureen",23))
    println(words("Have a nice day"))

    conditions("diana")
    conditions("Maureen")


}
//question one answer
fun school(){
    var schoolName ="akirachix"
    println(schoolName[0])
    println(schoolName[3])
    println(schoolName[4])

}
//question two answer
fun nameAndAge(name: String,age:Int):String{
    return "Hi, my name is $name and i am $age years old"

}
//question Three answer
fun words( sentence:String) :String{

    return "The length : " + sentence.length

}
//Question four answer
fun conditions( name:String){
    var fame = "Maureen"

    if(name.equals(fame)){
        println("Thats me")
    }else{
        println("I dont know who that is")
    }
}