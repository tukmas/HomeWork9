public class
Main {
    public static void main(String[] args) {
// Задача 1
    System.out.println("Задача 1");
    int sum = 0;
    int[] paymentAmount = new int[30];
    for (int i = 0; i < paymentAmount.length; i++) {
        paymentAmount[i] = ((int)(Math.random() * 100_000) + 100_000);
        sum += paymentAmount[i];}
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