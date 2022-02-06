public class TEST {
    public static void main(String[] args) {
        int first, second, third, result;
        first = 0; second = 0; third = 0;
        for (int i = 0; i < 100000000; i++) {
            result = (int) (Math.random() * 3 + 1);
            switch (result) {
                case 1: first++;
                        break;
                case 2: second++;
                        break;
                case 3: third++;
                        break;
            }
        }
        System.out.println(first+" "+second+" "+third);
    }
}