package ru.netology

fun main (){
    val result = agoToText (60)
    println("был(а) $result")
    val result1 = agoToText (240)
    println("был(а) $result1")
    val result2 = agoToText (1380)
    println("был(а) $result2")
    val result3= agoToText (3540)
    println("был(а) $result3")
    val result4= agoToText (720)
    println("был(а) $result4")

}

fun agoToText(seconds: Int): String {
    val timeAgo = when {
        seconds < 60 -> "только что"
        seconds >= 60 && seconds < (60*60) -> {
            val minutes = seconds/60
            val textResultMinutes = textMinutes (minutes)
            "$textResultMinutes назад"}
        seconds >= (60*60) && seconds < (24*60*60) -> {
            val hours = seconds/60/60
            "$hours часов назад"}
        seconds >= (24*60*60) && seconds < (2*24*60*60) -> "вчера"
        seconds >= (2*24*60*60) && seconds < (3*24*60*60) -> "позавчера"
        else -> "давно"
    }
    return timeAgo
}

fun textMinutes(minutes: Int): String {
    if (minutes == 11 || minutes == 12 || minutes == 13 || minutes == 14) return  "$minutes минут"
    when {
        minutes % 10 == 1 -> return "$minutes минуту"
        minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4 -> return "$minutes минуты"
        else -> return "$minutes минут"
    }
}
