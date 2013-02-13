// Auto-generated by org.jetbrains.jet.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList
import java.lang as j

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in (1 + 2)..(10 - 1)) {
        list1.add(i)
    }
    if (list1 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1 + 2)..(10 - 1): $list1"
    }

    val list2 = ArrayList<Byte>()
    for (i in (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte()) {
        list2.add(i)
    }
    if (list2 != listOf<Byte>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte(): $list2"
    }

    val list3 = ArrayList<Short>()
    for (i in (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort()) {
        list3.add(i)
    }
    if (list3 != listOf<Short>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in (1.toLong() + 2.toLong())..(10.toLong() - 1.toLong())) {
        list4.add(i)
    }
    if (list4 != listOf<Long>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toLong() + 2.toLong())..(10.toLong() - 1.toLong()): $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in ("ace"[1])..("age"[1])) {
        list5.add(i)
    }
    if (list5 != listOf<Char>('c', 'd', 'e', 'f', 'g')) {
        return "Wrong elements for (\"ace\"[1])..(\"age\"[1]): $list5"
    }

    val list6 = ArrayList<Double>()
    for (i in (1.5 * 2)..(3.0 * 3.0)) {
        list6.add(i)
    }
    if (list6 != listOf<Double>(3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)) {
        return "Wrong elements for (1.5 * 2)..(3.0 * 3.0): $list6"
    }

    val list7 = ArrayList<Float>()
    for (i in (1.5.toFloat() * 2.toFloat())..(3.0.toFloat() * 3.0.toFloat())) {
        list7.add(i)
    }
    if (list7 != listOf<Float>(3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)) {
        return "Wrong elements for (1.5.toFloat() * 2.toFloat())..(3.0.toFloat() * 3.0.toFloat()): $list7"
    }

    return "OK"
}
