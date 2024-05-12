package com.coding.meet.todo_app

sealed class Resources<T>(val status: Status, val data: T? = null, val message : String? = null) {

    class Success<T>(message: String,data: T?= null) : Resources<T>(Status.SUCCESS,data,message)
    class Error<T>(message: String,data: T? = null) : Resources<T>(Status.ERROR,data,message)
    class Loading<T> : Resources<T>(Status.LOADING)

}