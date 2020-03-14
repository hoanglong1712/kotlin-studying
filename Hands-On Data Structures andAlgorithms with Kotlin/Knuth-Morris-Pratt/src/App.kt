fun main(){
    print(search("abxabcabcaby", "abcaby"))
}

fun search(text:String, p: String) : Int{
    val arr = prepare(p)
    val tLen = text.length
    val pLen = p.length

    var pIndex = 0
    var tIndex = 0

    while ((tIndex < tLen) and (pIndex < pLen)){
        if (p[pIndex] == text[tIndex]){
            tIndex++;
            pIndex++
        } else{
            if (pIndex != 0)
                pIndex = arr[pIndex - 1]
            else
                tIndex++
        }
        if (pIndex == pLen)
            return tIndex - pIndex
    }
    return -1
}

fun prepare(p: String): IntArray{
    var len = p.length
    val arr = IntArray(len)
    var index = 0
    var i = 1
    while (i < len){
        if (p[i] == p[index]){
            arr[i] = index + 1
            index++
            i++
        } else{
            if (index != 0)
                index = arr[index - 1]
            else{
                arr[i] = 0
                i++
            }
        }
    }
    return arr
}