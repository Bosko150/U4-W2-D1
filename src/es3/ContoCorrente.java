package es3;

import exceptions.BancaException;

public class ContoCorrente {
    final int maxMovimenti = 50;
    String titolare;
    int nMovimenti;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {


        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else {
            saldo = saldo - x - 0.5;
        }

        nMovimenti++;

        if (saldo < 0) {
            throw new BancaException("Saldo inferiore a 0");
        }


    }

    double restituisciSaldo() {
        return saldo;
    }
}
