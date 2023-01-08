package main.java.tech.reliab.course.evdokimovnr.bank.service;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.BankOffice;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    /**
     * @param firstName  - имя
     * @param lastName   - фамилия
     * @param birthDate  - дата рождения сотрудника
     * @param job        - должность
     * @param bank       - банк
     * @param bankOffice - офис банка
     * @param salary     - зарплата
     * @return - возвращает созданный объект сотрудника
     */
    Employee create(String firstName, String lastName, LocalDate birthDate, String job,
                    Bank bank, BankOffice bankOffice, double salary
    );

    /**
     * @param firstName  - имя
     * @param lastName   - фамилия
     * @param patronymic - отчество
     * @param birthDate  - дата рождения сотрудника
     * @param job        - должность
     * @param bank       - банк
     * @param bankOffice - офис банка
     * @param salary     - зарплата
     * @return - возвращает созданный объект сотрудника
     */
    Employee create(String firstName, String lastName, String patronymic, LocalDate birthDate,
                    String job, Bank bank, BankOffice bankOffice, double salary
    );

    Employee read();
    void update(Employee employee);
    void delete(Employee employee);
}


