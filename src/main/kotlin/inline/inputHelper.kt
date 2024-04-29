package inline

inline fun input(prompt: String): String {
    println(prompt)
    return readln()
}
inline fun numCheck(num: String): Boolean {return num[0] == num[1] || num[0] == num[2] || num[2] == num[1]}