package dev.tokoi

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: WesleyTime) = setTime(time.hours)
}

class WesleyTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time {
    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("Not yet implemented")
    }

}