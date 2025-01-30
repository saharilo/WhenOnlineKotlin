package ru.netology

fun main (){
    val seconds = 173_000
    val result = agoToText (seconds)
    println("был(а) $result")
}

fun agoToText(seconds: Int): String {
    val timeAgo = when {
        seconds < 60 -> "только что"
        seconds >= 60 && seconds < (60*60) -> {
            val minutes = seconds/60
            "$minutes минут назад"}
        seconds >= (60*60) && seconds < (24*60*60) -> {
            val hours = seconds/60/60
            "$hours часов назад"}
        seconds >= (24*60*60) && seconds < (2*24*60*60) -> "вчера"
        seconds >= (2*24*60*60) && seconds < (3*24*60*60) -> "позавчера"
        else -> "давно"
    }
    return timeAgo
}
