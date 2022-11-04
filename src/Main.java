public class
Main {
    public static void main(String[] args) {
// Не разобрался, как использовать метод из условий домашки
// Задача 1
    System.out.println("Задача 1");
    int sum = 0;
    int[] paymentAmount = {121_000, 122_000, 123_000, 124_000, 125_000, 126_000, 127_000, 128_000, 129_000, 120_000, 131_000, 132_000, 133_000, 134_000, 135_000, 136_000, 137_000, 138_000, 139_000, 130_000, 141_000, 142_000, 143_000, 144_000, 145_000, 146_000, 147_000, 148_000, 149_000, 140_000};
    for (int i = 0; i < paymentAmount.length; i++) {
    sum += paymentAmount[i];
    }
    System.out.println("Сумма трат за месяц составила " + sum + " рублей");
// Задача 2
System.out.println("Задача 2");
    int maxSum = 0;
    int minSum = paymentAmount[0];
    for (int i = 0; i < paymentAmount.length; i++) {
        if (paymentAmount[i] > maxSum) {
            maxSum = paymentAmount[i];
        }
        if (paymentAmount[i] < minSum) {
            minSum = paymentAmount[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
// Задача 3
System.out.println("Задача 3");
sum = 0;
for (int i = 0; i < paymentAmount.length; i++) {
     sum += paymentAmount[i];}
    double averageSum = sum / 30;
    System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
// Задача 4
        System.out.println("Задача 4");
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    for (int i = reverseFullName.length - 1; i >= 0; i--) {
    System.out.print(reverseFullName[i]);}
    }
}