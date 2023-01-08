package main.java.tech.reliab.course.evdokimovnr;

import main.java.tech.reliab.course.evdokimovnr.bank.entity.Bank;
import main.java.tech.reliab.course.evdokimovnr.bank.service.*;
import main.java.tech.reliab.course.evdokimovnr.bank.service.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Сервисы
        BankService bankService = BankServiceImpl.getInstance();
        BankOfficeServiceImpl officeService = BankOfficeServiceImpl.getInstance();
        EmployeeService employeeService = EmployeeServiceImpl.getInstance();
        BankAtmService atmService = BankAtmServiceImpl.getInstance();
        UserService userService = UserServiceImpl.getInstance();
        PaymentAccountService paymentAccountService = PaymentAccountServiceImpl.getInstance();
        CreditAccountService creditAccountService = CreditAccountServiceImpl.getInstance();
        ArrayList <Bank> banks = new ArrayList<Bank>();
        //Создание сущностей
        for(int numBank=0; numBank<5; numBank++){
            var bank = bankService.create("Bank"+(numBank+1));
            for(int numOffice=0; numOffice<3; numOffice++){
                var office = officeService.create(
                        "Office"+(numOffice+1),
                        bank,
                        "Address",
                        1000.
                );

                for(int numEmpl=0; numEmpl<5; numEmpl++){
                    var employee = employeeService.create(
                            "Nikita",
                            "Evdokimov",
                            LocalDate.now(),
                            "cleaner",
                            bank,
                            office,
                            10000.
                    );

                }
            }
            for(int numAtm=0; numAtm<3; numAtm++){
                var atm = atmService.create(
                        "atm"+(numAtm+1),
                        bank,
                        bank.getListOfOffices().stream().findFirst().get(),
                        bank.getListOfEmployees().stream().findFirst().get(),
                        100.
                        );

            }
            for(int numUser=0; numUser<5; numUser++){
                var user = userService.create(
                        "Ivan " + "Bank #" + numBank + " User #" + numUser,
                        "Ivanov",
                        LocalDate.now(),
                        "job",
                        bank
                        );

                for(int numPay=0; numPay<2; numPay++){
                    var paymentAccount = paymentAccountService.create(
                            user,
                            bank.getName()
                    );
                    userService.addPaymentAccount(user, paymentAccount);
                    var credit = creditAccountService.create(
                            user,
                            bank,
                            LocalDate.now(),
                            LocalDate.now(),
                            12,
                            100000.,
                            1000.,
                            bank.getListOfEmployees().get(1),
                            paymentAccount
                    );
                    userService.addCreditAccount(user, credit);
                }
            }
            banks.add(bank);
        }
        //Вывод информации по всем банкам
        for(var bank : banks){
            bankService.outputBankInfo(bank);
        }
    }
}