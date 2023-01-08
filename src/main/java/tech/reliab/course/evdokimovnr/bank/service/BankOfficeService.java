package main.java.tech.reliab.course.evdokimovnr.bank.service;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.BankOffice;

public interface BankOfficeService {
    /**
     *
     * @param name - имя офиса
     * @param bank - банк офиса
     * @param address - адрес офиса
     * @param rent - стоимость аренды офиса
     * @return - возвращает созданный объект офис
     */
    BankOffice create(String name, Bank bank, String address, double rent);
    BankOffice read();
    void update(BankOffice bankOffice);
    void delete(BankOffice bankOffice);
}
