class Fruit{
    var name: String = ""
    var color: String = ""
    var size: Int = 0

    constructor(name: String){
        println("Name: $name")
    }
    constructor(name: String, color: String) {
        println("Name: $name, Color: $color")

    }

    constructor(name: String, color: String, size: Int) {
        println("Name: $name, Color: $color, Size: $size")
    }

}