// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField

class Outer {
    private companion object {
        val result = "OK"
    }

    class Nested {
        fun foo() = run { result }
    }

    fun test() = Nested().foo()
}

fun box() = Outer().test()