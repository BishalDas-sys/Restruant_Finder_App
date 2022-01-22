package com.rifdahalf.aplikasirestoran.model

import java.io.Serializable

class ModelReview : Serializable {
    var reviewText: String? = null
    var reviewTime: String? = null
    var nameUser: String? = null
    var profileImage: String? = null
    var ratingReview = 0.0
}