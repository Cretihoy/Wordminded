package com.cretihoy.wordminded.card

import com.cretihoy.wordminded.R.string

object CardFactory {

    fun getLetter(): List<CardModel> {
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

    fun getTask(): List<CardModel> {
        return listOf(
            CardModel(content = string.task_1),
            CardModel(content = string.task_2),
            CardModel(content = string.task_3),
            CardModel(content = string.task_4),
            CardModel(content = string.task_5),
            CardModel(content = string.task_6),
            CardModel(content = string.task_7),
            CardModel(content = string.task_8),
            CardModel(content = string.task_9),
            CardModel(content = string.task_10),
            CardModel(content = string.task_11),
            CardModel(content = string.task_12),
            CardModel(content = string.task_13),
            CardModel(content = string.task_14),
            CardModel(content = string.task_15),
            CardModel(content = string.task_16),
            CardModel(content = string.task_17),
            CardModel(content = string.task_18),
            CardModel(content = string.task_19),
            CardModel(content = string.task_20),
            CardModel(content = string.task_21),
            CardModel(content = string.task_22),
            CardModel(content = string.task_23),
            CardModel(content = string.task_24),
            CardModel(content = string.task_25),
            CardModel(content = string.task_26),
            CardModel(content = string.task_27),
            CardModel(content = string.task_28),
            CardModel(content = string.task_29),
            CardModel(content = string.task_30),
            CardModel(content = string.task_31),
            CardModel(content = string.task_32),
            CardModel(content = string.task_33),
            CardModel(content = string.task_34),
            CardModel(content = string.task_35),
            CardModel(content = string.task_36),
            CardModel(content = string.task_37),
            CardModel(content = string.task_38),
            CardModel(content = string.task_39),
            CardModel(content = string.task_40),
            CardModel(content = string.task_41),
            CardModel(content = string.task_42),
            CardModel(content = string.task_43),
            CardModel(content = string.task_44),
            CardModel(content = string.task_45),
            CardModel(content = string.task_46),
            CardModel(content = string.task_47),
            CardModel(content = string.task_48),
            CardModel(content = string.task_49),
            CardModel(content = string.task_50),
            CardModel(content = string.task_51),
            CardModel(content = string.task_52),
        )
    }
    fun getRandomLetter(): CardModel {
        val list = getLetter()
        list.shuffled()
        return list.random()
    }

    fun getRandomTask(): CardModel {
        val list = getTask()
        list.shuffled()
        return list.random()
    }
}