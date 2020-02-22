package com.example.drawablechat

import com.example.effectlib.ViewType

class MyModel {

    var message:String=""
    var viewType:ViewType

    constructor(message: String, viewType: ViewType) {
        this.message = message
        this.viewType = viewType
    }
}