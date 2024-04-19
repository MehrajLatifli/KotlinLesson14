package Task3

data class Human(var height: Double? = null, var gender: Gender? = null) {

    fun calculateWeight(): Double {
        val currentHeight = height ?: return 0.0

        return when (gender) {
            Gender.Male -> {
                48.0 + (currentHeight - 150.0) / 2.5 * 2.7
            }
            Gender.Female -> {
                45.0 + (currentHeight - 150.0) / 2.5 * 2.2
            }
            else -> 0.0
        }
    }
}

