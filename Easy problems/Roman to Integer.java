//(Logic) : If previous value is less,,then subtract symbol is used...
//And if previous value is greater than the current value,,then add both...


class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int total = 0;
        int prev = 0;

        for(int i =s.length() - 1; i >= 0; i--){
            int curr = m.get(s.charAt(i));
            total += curr<prev ? - curr:curr;
            prev = curr;
        }
        return total;



    }
}