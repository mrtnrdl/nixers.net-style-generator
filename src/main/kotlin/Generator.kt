/**
 * Created by mrtn on 3/24/17.
 */
package net.nixers.mrtnrdl.stylegenerator.controller

class Generator {

    fun generateCss(color_1: String, color_2: String, color_3: String, color_4: String, color_5: String, color_6: String, color_7: String, color_8: String): String {

        return "empty template."
    }

    public fun main(args: Array<String>) {

        // create template
        val css = Generator().generateCss("", "", "", "", "", "", "", "")

        // print template
        println(css)
    }

}


