package main.java.tech.reliab.course.evdokimovnr.bank.service.impl;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.BankOffice;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.Employee;
import main.java.tech.reliab.course.evdokimovnr.bank.service.EmployeeService;

import java.time.LocalDate;

/**
 *  Singleton
 */
public class EmployeeServiceImpl implements EmployeeService {
    private static  EmployeeServiceImpl INSTANCE;

    private EmployeeServiceImpl(){}

    public static EmployeeServiceImpl getInstance(){
        if (INSTANCE==null){
            INSTANCE = new EmployeeServiceImpl();
        }
        return INSTANCE;
    }

    private Long id = 0L;
    private Employee employee;

    @Override
    public Employee create(String firstName, String lastName, LocalDate birthDate,
            String job, Bank bank, BankOffice bankOffice, double salary){
        var employee = new Employee(
                ++id,
                firstName,
                lastName,
                birthDate,
                job,
                bank,
                true,
                bankOffice,
                true,
                salary
        );
        bank.getListOfEmployees().add(employee);
        return employee;
    }

    @Override
    public Employee create(String firstName, String lastName, String patronymic, LocalDate birthDate,
            String job, Bank bank, BankOffice bankOffice, double salary){
        var employee = new Employee(
                ++id,
                firstName,
                lastName,
                patronymic,
                birthDate,
                job,
                bank,
                true,
                bankOffice,
                true,
                salary
        );
        bank.getListOfEmployees().add(employee);
        return employee;
    }

    /**
     *
     * @return - возвращает объект сотрудник
     */
    @Override
    public Employee read(){
        return employee;
    }

    /**
     *
     * @param employee - новый сотрудник
     */
    @Override
    public void update(Employee employee){
        this.employee = employee;
    }

    /**
     *
     * @param employee - сотрудник для удаления
     */
    @Override
    public void delete(Employee employee){
        if(this.employee == employee){
            this.employee = null;
        }
    }
}
