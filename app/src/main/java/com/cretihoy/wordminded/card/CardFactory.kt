package com.cretihoy.wordminded.card

import com.cretihoy.wordminded.R.string

object CardFactory {

    fun getLetters(): List<CardModel> {
        return listOf(
            CardModel(content = string.letter_1),
            CardModel(content = string.letter_2),
            CardModel(content = string.letter_3),
            CardModel(content = string.letter_4),
            CardModel(content = string.letter_5),
            CardModel(content = string.letter_6),
            CardModel(content = string.letter_7),
            CardModel(content = string.letter_8),
            CardModel(content = string.letter_9),
            CardModel(content = string.letter_10),
            CardModel(content = string.letter_11),
            CardModel(content = string.letter_12),
            CardModel(content = string.letter_13),
            CardModel(content = string.letter_14),
            CardModel(content = string.letter_15),
            CardModel(content = string.letter_16),
            CardModel(content = string.letter_17),
            CardModel(content = string.letter_18),
            CardModel(content = string.letter_19),
            CardModel(content = string.letter_20),
            CardModel(content = string.letter_21),
            CardModel(content = string.letter_22),
            CardModel(content = string.letter_23),
            CardModel(content = string.letter_24),
            CardModel(content = string.letter_25),
            CardModel(content = string.letter_26)
        )
    }
}