package lesson5.credit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardTest {


    @Test
    void deposit() {
        /*
        TODO:
            При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
            Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
            В первую очередь зачисление покрывает задолженность по кредиту;
            Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;
         */
        CreditCard creditCard = new CreditCard("1253-4561-8469-7561",1111);
        creditCard.deposit(500);
        int actualResult = 500;
        int expectedResult = creditCard.getBalance();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void withdraw() {
        CreditCard creditCard = new CreditCard("1253-4561-8469-7561",1111);
        creditCard.setBalance(500);
        creditCard.withdraw(500);
        int actualResult = 0;
        int expectedResult = creditCard.getBalance();
        assertEquals(expectedResult, actualResult);
    }
}