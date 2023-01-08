package main.java.tech.reliab.course.evdokimovnr.bank.service;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.BankAtm;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.BankOffice;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.Employee;

public interface BankAtmService {
    /**
     *
     * @param name - назание банкомата
     * @param bank - банк
     * @param bankOffice - офис банка
     * @param employee - обслуживающий сотрудник
     * @param maintenance - стоимость обслуживания
     * @return - возвращает созданный объект банкомат
     */
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);

    BankAtm read();
    void update(BankAtm bankAtm);
    void delete(BankAtm bankAtm);

}
