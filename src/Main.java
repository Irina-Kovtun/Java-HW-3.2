public class Main {
    public static void main(String[] args) {
        //копейки отделяются от целого числа через нижнее подчеркивание
        int initialAmount = 2000_00;
        int transh = 1100_00;
        int bonusRate = transh / 100;
        int limit = 1000_00;
        int bonus;
        if (transh <= limit) {
            bonus = 0;
        } else {
            bonus = bonusRate;}
        int total = initialAmount + transh + bonus;
        System.out.println(total);
    }
}
