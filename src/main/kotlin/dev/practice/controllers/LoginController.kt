package dev.practice.controllers

import dev.practice.data.CustomName
import dev.practice.data.UserInfo
import dev.practice.entity.FinaDev
import dev.practice.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class LoginController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping("/info")
    fun info() :String  {
        var name = CustomName("Rajesh", "Sundaram")
        return "Welcome Mr.${name.firstName} ${name.lastName}"
    }

    @GetMapping("/user/{id}")
    fun userById(@PathVariable("id") id: String) :Any {
        var usr = userService.getUserDetails(id)
        if (usr.isEmpty()) {
//            return FinaDev(0, "","","")
            return userService.getAllUser()
        } else {
            return usr.get()
        }
    }

    @GetMapping("/users")
    fun getUsers() = userService.getAllUser()

    @GetMapping("/user/add/{firstName}/{lastName}/{country}")
    fun addUser(@PathVariable firstName: String, @PathVariable lastName: String, @PathVariable country: String) :Collection<FinaDev>{
        return userService.addUser(firstName, lastName, country)
    }

}