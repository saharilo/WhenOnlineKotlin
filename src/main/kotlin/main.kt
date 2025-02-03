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
    val result4= agoToText (3600)
    println("был(а) $result4")
    val result5 = agoToText (7_201)
    println("был(а) $result5")
    val result6 = agoToText (18_000)
    println("был(а) $result6")
    val result7 = agoToText (172_000)
    println("был(а) $result7")
    val result8= agoToText (259_000)
    println("был(а) $result8")
    val result9= agoToText (400_000)
    println("был(а) $result9")

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
            val textResultHours = textHours (hours)
            "$textResultHours назад"}
        seconds >= (24*60*60) && seconds < (2*24*60*60) -> "вчера"
        seconds >= (2*24*60*60) && seconds < (3*24*60*60) -> "позавчера"
        else -> "давно"
    }
    return timeAgo
}

fun textMinutes(minutes: Int): String {
    when {
        minutes == 11 || minutes == 12 || minutes == 13 || minutes == 14 -> return  "$minutes минут"
        minutes % 10 == 1 -> return "$minutes минуту"
        minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4 -> return "$minutes минуты"
        else -> return "$minutes минут"
    }
}

fun textHours(hours: Int): String {
    when {
        hours == 1 || hours == 21 -> return  "$hours час"
        hours == 2 || hours == 22 || hours == 3 || hours == 23 || hours == 4 || hours == 24 -> return  "$hours часа"
        else -> return "$hours часов"
    }
}
