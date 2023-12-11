class RiceCooker : Cooker {
    override var powerOn: Boolean = false
    override var cooking: Boolean = false
    override var warmMode: Boolean = false
    override var steamMode: Boolean = false
    override var cookingTime: Int = 0
    override var warmTime: Int = 0
    override var steamTime: Int = 0
    override var pluggedIn: Boolean = false

    fun plugIn() {
        pluggedIn = true
        println("The rice cooker is plugged in.")
    }

    fun unplug() {
        pluggedIn = false
        powerOn = false
        println("The rice cooker is unplugged.")
    }

    fun powerOn() {
        if (pluggedIn) {
            powerOn = true
            println("The rice cooker is turned on.")
        } else {
            println("Please plug in the rice cooker before turning it on.")
        }
    }

    fun setCookingMode(time: Int) {
        if (!powerOn) {
            throw IllegalStateException("The rice cooker must be turned on before setting the cooking mode.")
        }

        cooking = true
        cookingTime = time
        println("The rice cooker is in automatic cooking mode for $time minutes.")
    }

     fun setWarmMode(time: Int) {
        if (!powerOn) {
            throw IllegalStateException("The rice cooker must be turned on before setting the warm mode.")
        }

        warmMode = true
        warmTime = time
        println("The rice cooker is in warm mode for $time minutes.")
    }

     fun setSteamMode(time: Int, steamLevel: Int) {
        if (!powerOn) {
            throw IllegalStateException("The rice cooker must be turned on before setting the steam cooking mode.")
        }

        steamMode = true
        steamTime = time
        println("The rice cooker is in steam cooking mode at level $steamLevel for $time minutes.")
    }

    fun cancel() {
        cooking = false
        warmMode = false
        steamMode = false
        cookingTime = 0
        warmTime = 0
        steamTime = 0
        println("All operations have been canceled.")
    }
}

interface Cooker {
    var powerOn: Boolean
    var cooking: Boolean
    var warmMode: Boolean
    var steamMode: Boolean
    var cookingTime: Int
    var warmTime: Int
    var steamTime: Int
    var pluggedIn: Boolean
}

fun main() {
        val riceCooker = RiceCooker()
        riceCooker.plugIn()
        riceCooker.powerOn()
        riceCooker.setCookingMode(20)
        riceCooker.setWarmMode(10)
        riceCooker.setSteamMode(15, 3)
        riceCooker.cancel()
        riceCooker.unplug()
}