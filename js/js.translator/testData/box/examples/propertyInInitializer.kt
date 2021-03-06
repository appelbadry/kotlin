// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1119
class Outer() {
    val s = "xyzzy"

    open inner class InnerBase(public val name: String) {
    }

    inner class InnerDerived() : InnerBase(s) {
    }

    val x = InnerDerived()
}

fun box(): String {
    val o = Outer()
    return if (o.x.name != "xyzzy") "fail" else "OK"
}
