package de.testenna.server

import org.hibernate.annotations.Type
import java.time.LocalDate
import javax.persistence.*

@Entity(name="dummytable")
class JpaDummytable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var pid: Long? = null
    var dummytableId: String = ""
    var mandatorId: String? = ""
    var info: String = ""
    var intValue: Int? = null
    var dateValue: LocalDate? = null
    @Type(type="yes_no")
    var booleanValue: Boolean? = null
    @Version
    var version: Long = 0L
}
