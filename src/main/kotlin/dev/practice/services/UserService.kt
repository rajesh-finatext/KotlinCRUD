package dev.practice.services

import dev.practice.entity.FinaDev
import dev.practice.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.validation.constraints.Null

@Service
class UserService {

    @Autowired
    lateinit var usrRepo: UserRepo

    fun getUserDetails(id: String) = usrRepo.findById(id.toLong())

    fun getAllUser() = usrRepo.findAll()
    fun addUser(firstName: String, lastName: String, country: String) :Collection<FinaDev> {
        usrRepo.save(FinaDev( (getAllUser().count()+1).toLong(), firstName, lastName, country))
        return getAllUser()
    }
//        FinaDev(34,"Rajesh", "Sundaram", "India")

//    fun getAllUsers(): Any {
//    usrRepo.getAll()
//    }
}