import spock.lang.Specification
import spock.lang.Unroll

class EmployeeSpec extends Specification{


    @Unroll
    def "checking if the salary is valid or not"(){

        setup:
        Employee employee = new Employee("ANIL",age,sal)
        when:
        boolean valid = employee.check()
        then:
        valid == resultvalid

        where:
        age|sal|resultvalid
        17|30000|false
        20|40000|true
        20|70000|false
    }
}
