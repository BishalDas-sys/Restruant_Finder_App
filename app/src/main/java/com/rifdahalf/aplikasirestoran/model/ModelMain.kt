package com.rifdahalf.aplikasirestoran.model

import java.io.Serializable

class ModelMain : Serializable {
    var idResto: String? = null
    var nameResto: String? = null
    var thumbResto: String? = null
    var ratingText: String? = null
    var addressResto: String? = null
    var aggregateRating = 0.0
}