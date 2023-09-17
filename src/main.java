public class main {
    public static void main(String[] args) {

        int incomingAmount = 300;
        int depositAmount = 1300;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }

        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Итоговая сумма на счете: " + account + " ₽");
        System.out.println("В том числе бонус за пополнение: " + bonusAmount + " ₽");
    }
}
