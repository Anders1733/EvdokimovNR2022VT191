package main.java.tech.reliab.course.evdokimovnr.bank.service;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.CreditAccount;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.User;

import java.time.LocalDate;

public interface UserService {
    /**
     *
     * @param firstName - имя
     * @param lastName - фамилия
     * @param birthDate - дата рождения клиента
     * @param job - место работы
     * @param bank - банк
     * @return - возвращает созданный объект клиент
     */
    User create(String firstName, String lastName, LocalDate birthDate, String job, Bank bank);
    /**
     *
     * @param firstName - имя
     * @param lastName - фамилия
     * @param patronymic - отчество
     * @param birthDate - дата рождения клиента
     * @param job - место работы
     * @param bank - банк
     * @return - возвращает созданный объект клиент
     */
    User create(String firstName, String lastName, String patronymic, LocalDate birthDate, String job, Bank bank);

    void addCreditAccount(User user, CreditAccount credit);

    void delCreditAccount(User user, CreditAccount credit);

    void addPaymentAccount(User user, PaymentAccount paymentAccount);

    void delPaymentAccount(User user, PaymentAccount paymentAccount);

    void outputUserInfo(User user);

}
