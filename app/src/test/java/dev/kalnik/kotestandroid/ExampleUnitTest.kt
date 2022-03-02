package dev.kalnik.kotestandroid

import io.kotest.core.extensions.Extension
import io.kotest.core.spec.style.StringSpec
import io.kotest.koin.KoinExtension
import org.koin.test.KoinTest

class ExampleUnitTest : StringSpec(), KoinTest {

    override fun extensions(): List<Extension> = listOf(KoinExtension(listOf()))

    init {

        "test ViewModel" {
            MyViewModel()
        }
    }
}