fun main(args: Array<String>) {
    var m: Meeting? = null
    var newMeeting: Meeting = Meeting()

    newMeeting = m ?: Meeting()

    closeMeeting(m)
    closeMeeting(newMeeting)

    m?.let {
        closeMeetingNonNull(m)
    }
}

fun closeMeetingNonNull(m: Meeting): Boolean? {
    return if (m.canClose == true) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean? {
    return if (m?.canClose == true) m?.close()
    else false
}

fun closeMeetingAssert(m: Meeting?): Boolean? {
    return if (m!!.canClose) m.close()
    else false
}

class Meeting {
    val canClose: Boolean = false

    fun close(): Boolean {
        return true
    }

    fun save(o: Any) {
        val saveable = o as? ISavable
        saveable?.save()
    }
}

interface ISavable {
    fun save()
}