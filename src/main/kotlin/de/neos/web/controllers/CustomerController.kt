package de.neos.web.controllers

import de.neos.web.entities.customer.persistence.CustomerRepository
import de.neos.web.utility.randomize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/customer/{name}")
    fun findByLastName(@PathVariable name: String) = repository.findByLastName(name)

    @GetMapping("/customer/randomized")
    fun randomized() = repository.findAll().first().randomize()

}