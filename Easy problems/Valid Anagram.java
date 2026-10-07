class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            System.out.println("Invalid input");
        }

        char[] m = s.toCharArray();
        char[] n = t.toCharArray();
        Arrays.sort(m);
        Arrays.sort(n);

        if (Arrays.equals(m,n)){
            return true;
        }
        return false;
    }

}