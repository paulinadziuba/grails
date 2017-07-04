package myapp

class Trip {


    String name
    String city
    Date startDate
    Date endDate
    String purpose
    String notes

    static constraints = {
        name()
        city()
        startDate()
        endDate()
        purpose()
        notes()
    }
}
