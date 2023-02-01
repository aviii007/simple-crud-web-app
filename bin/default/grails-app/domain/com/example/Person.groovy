package com.example

class Person {

    String name
    String email
    String address
    String city
    String country
    String contact

    static constraints = {
        email email: true
    }
}
