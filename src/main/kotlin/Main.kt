fun main() {
    print(solution("you'll n4v4r 6u4ss 8t: cdja"))
}

fun solution(note: String): String {
    var deciphered = ""
    for (i in note.indices) {
        if (note[i] in '0'..'9') {
            deciphered += ('a' + note[i].digitToInt())
            continue
        }
        if (note[i] in 'a'..'j') {
            deciphered += (note[i].code - 'a'.code)
            continue
        }
        deciphered+=note[i]
    }
    return deciphered
}
