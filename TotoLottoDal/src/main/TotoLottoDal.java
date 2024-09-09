package main;

import modell.MindentTudoGep;

public class TotoLottoDal {

    
    public static void main(String[] args) {
        MindentTudoGep gep = new MindentTudoGep();
        System.out.println("lottó szelvény:\n" + gep.kerLottoSzelveny());
        System.out.println("totó szelvény:\n" + gep.kerTotoSzelveny());
        System.out.println("dal:\n" + gep.kerDal());
    }
    
}
