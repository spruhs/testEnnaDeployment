package de.testenna.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.transaction.Transactional

@RestController
@RequestMapping("/testenna")
class DummyController {
    @Autowired
    private lateinit var dummytableRepository: DummytableRepository

    @GetMapping("/read")
    fun read(): List<JpaDummytable> {
        return dummytableRepository.findAll()
    }

    @Transactional
    @PostMapping("/update")
    fun update(@RequestBody dummytable: JpaDummytable)  {
        dummytableRepository.save(dummytable)
    }
}
