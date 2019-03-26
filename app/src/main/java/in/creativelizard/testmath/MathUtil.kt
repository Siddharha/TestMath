package `in`.creativelizard.testmath

import java.util.*

class MathUtil {

        fun maxDiff(numbers: IntArray): Int {
            var diff = Math.abs(numbers[1] - numbers[0])
            for (i in 1 until numbers.size - 1) {
                if (Math.abs(numbers[i + 1] - numbers[i]) > diff)
                    diff = Math.abs(numbers[i + 1] - numbers[i])
            }
            return diff
        }

        fun minDiff(numbers: IntArray): Int {
            var diff = Math.abs(numbers[1] - numbers[0])
            for (i in 1 until numbers.size - 1) {
                if (Math.abs(numbers[i + 1] - numbers[i]) < diff)
                    diff = Math.abs(numbers[i + 1] - numbers[i])
            }
            return diff
        }

}