package com.example.gymapp

class Exercise {
    private var exerciseName: String? = null
    private var sets: Int = 0
    private var reps: Int = 0

    // Getters
    fun getExerciseName(): String? {
        return exerciseName
    }

    fun getSets(): Int {
        return sets
    }

    fun getReps(): Int {
        return reps
    }

    // Setters
    fun setExerciseName(name: String?) {
        this.exerciseName = name
    }

    fun setSets(sets: Int) {
        this.sets = sets
    }

    fun setReps(reps: Int) {
        this.reps = reps
    }

    override fun toString(): String {
        return "Exercise(exerciseName=$exerciseName, sets=$sets, reps=$reps)"
    }
}
