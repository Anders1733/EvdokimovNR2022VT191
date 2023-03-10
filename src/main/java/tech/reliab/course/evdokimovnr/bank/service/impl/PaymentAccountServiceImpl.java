package main.java.tech.reliab.course.evdokimovnr.bank.service.impl;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.PaymentAccount;
import main.java.tech.reliab.course.evdokimovnr.bank.entity.User;
import main.java.tech.reliab.course.evdokimovnr.bank.service.PaymentAccountService;

/**
 *  Singleton
 */
public class PaymentAccountServiceImpl implements PaymentAccountService {
    private static  PaymentAccountServiceImpl INSTANCE;

    private PaymentAccountServiceImpl(){}

    public static PaymentAccountServiceImpl getInstance(){
        if (INSTANCE==null){
            INSTANCE = new PaymentAccountServiceImpl();
        }
        return INSTANCE;
    }

    private Long id = 0L;
    private PaymentAccount paymentAccount;

    @Override
    public PaymentAccount create(User user, String bankName){
        var paymentAccount = new PaymentAccount(
                ++id,
                user,
                bankName,
                0
        );
        return paymentAccount;
    }
    /**
     *
     * @return - возвращает платежный счет
     */
    @Override
    public PaymentAccount read(){
        return paymentAccount;
    }

    /**
     *
     * @param paymentAccount - новый платежный счет
     */
    @Override
    public void update(PaymentAccount paymentAccount){
        this.paymentAccount = paymentAccount;
    }

    /**
     *
     * @param paymentAccount - платежный счет для удаления
     */
    @Override
    public void delete(PaymentAccount paymentAccount){
        if(this.paymentAccount == paymentAccount){
            this.paymentAccount = null;
        }
    }
}
