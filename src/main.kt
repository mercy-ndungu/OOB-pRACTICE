fun main(){
    var person = Human("", 20,51)
    person.eat(30)
    println(person.weight)
    person.speak("I a woman.")
    println(person)
    person.birthday()
    println(person)
    var identity= User("Mercy", "Kirigo", "kirigom10@gmail.com","0712345678")
println(identity)
    println(identity.firstName)
    println(identity.email)
    }


class Human(var name: String,var age:Int, var weight: Int) {


    fun eat(foodWeight: Int): Int {
        weight += foodWeight
        println("I am eating $foodWeight kgs of food ")
        return weight
    }

    fun speak(speech: String) {
        println(speech)

    }

    fun birthday() {
        println(age++)


    }
}
data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String)

