package dev.practice.entity

import javax.persistence.*

@Entity(name = "fina_devs")
class FinaDev(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id") val id: Long = 0,
              @Column(name="first_name")val firstName: String,
              @Column(name="last_name")val lastName: String,
              @Column(name="country")val country: String)