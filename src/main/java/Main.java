public class Main {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        for (Integer numR : new Randoms(min,max)) {
            System.out.println(numR);
            if (numR == max) {
                System.out.println("Выпало число "+max+", давайте на этом закончим");
                break;
            }
        }
    }
}
