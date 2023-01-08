package main.java.tech.reliab.course.evdokimovnr.bank.service;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.User;


public interface PaymentAccountService {
    /**
     *
     * @param user - клиент
     * @param bankName - имя банка
     * @return - возвращает созданный объект платежный счет
     */
    PaymentAccount create(User user, String bankName);
    PaymentAccount read();
    void update(PaymentAccount paymentAccount);
    void delete(PaymentAccount paymentAccount);
}
