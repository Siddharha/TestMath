package `in`.creativelizard.testmath


class MathUtil {

        fun minDiff(numbers: IntArray): Int {
            var diff = Math.abs(numbers[1] - numbers[0])
            for (i in 1 until numbers.size - 1) {
                if (Math.abs(numbers[i + 1] - numbers[i]) < diff)
                    diff = Math.abs(numbers[i + 1] - numbers[i])
            }
            return diff
        }

}