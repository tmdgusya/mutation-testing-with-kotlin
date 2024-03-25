package com.example

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NConditionTest : FunSpec({

    context("fooIfIsNumberIsPositive") {
        test("should return foo if number is positive") {
            NCondition().fooIfIsNumberIsPositive(5) shouldBe "foo"
        }

        test("should return bar if number is not positive") {
            NCondition().fooIfIsNumberIsPositive(0) shouldBe "bar"
        }
    }
})
