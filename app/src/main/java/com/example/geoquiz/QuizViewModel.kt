package com.example.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {

    var currentIndex = 0
    var isCheater = false
    private val questionBank = listOf(
        Question(R.string.question_1, false),
        Question(R.string.question_2, true),
        Question(R.string.question_3, false),
        Question(R.string.question_4, true),
        Question(R.string.question_5, true),
        Question(R.string.question_6, false),
        Question(R.string.question_7, false),
        Question(R.string.question_8, true),
        Question(R.string.question_9, true),
        Question(R.string.question_10, true)
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }

    fun moveToPrevious(){
        if (currentIndex == 0){
            currentIndex = 9
        }
        else{
            currentIndex = (currentIndex - 1) % questionBank.size
        }
    }


}