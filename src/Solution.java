class Solution {
    public static int translate(char c) {

        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }

    public static int romanToInt(String s){
            int sum = 0;
            int current = translate(s.charAt(0));

            for (int i = 1; i < s.length(); i++){
                int next = translate(s.charAt(i));

                if (current < next){
                    sum -= current;
                }
                else {
                    sum += current;
                }

                current = next;
        }
            sum += current;
            return sum;
    }



    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("VXL"));
        System.out.println(romanToInt("XCC"));
        System.out.println(romanToInt("DMM"));

    }
}