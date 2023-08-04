package com.adalmando.motivation.infra

// private constructor impede da classe ser instanciada, ela vai funcionar apenas
// para fornecer os valores de KEY:
class MotivationConstants private constructor(){
    object KEY {
        const val USER_NAME = "USER_NAME"
    }
    object FILTER {
        const val ALL = 1
        const val EMOJI = 2
        const val SUNNY = 3
    }
}