class Solution {
    public boolean isAnagram(String s, String t) {
        // initial solution is to use a char to int hashmap to store instance of each letter in each string and then compare (should be O(n)) 
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        // edge case: not same number of characters

        if (sCharArray.length != tCharArray.length) {
            return false;
        }

        // hashmap of all chars and how often they appear
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (char sChar: sCharArray) {
            if (sMap.containsKey(sChar)) {
                sMap.put(sChar, sMap.get(sChar) + 1);
            } else {
                sMap.put(sChar, 1);
            }
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char tChar: tCharArray) {
            if (tMap.containsKey(tChar)) {
                tMap.put(tChar, tMap.get(tChar) + 1);
            } else {
                tMap.put(tChar, 1);
            }
        }

        // get list of keys from s hashmap
        Set<Character> sKeys = sMap.keySet();
        for (Character sChar: sKeys) {
            if (!(sMap.get(sChar).equals(tMap.get(sChar)))) {
                // gotta compare Integer with .equals()
                return false;
            }
        }

        return true;
    }
}
