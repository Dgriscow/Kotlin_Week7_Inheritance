//Classes are Private by Defauly, they have to be TOLD
open class Person (firstName:String,
    lastName:String){

    var firstName:String = ""
        get() = field
    var lastName:String = ""

    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun setFullName():String{
        return "$firstName $lastName"
    }


}