class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<Integer>> hashMapOfHashMaps = new HashMap<HashMap<Character, Integer>, List<Integer>>();
        for (int i = 0; i < strs.length; i++)  // amount of strings
        {
            String str = strs[i];
            HashMap<Character, Integer> charFreq = new HashMap<>();
            char[] charArray = str.toCharArray();
            // for each character, count frequency
            for (char c: charArray) {
                if (charFreq.get(c) != null) {
                    charFreq.put(c, charFreq.get(c) + 1);
                } else {
                    charFreq.put(c, 1);
                }
            }
            if (hashMapOfHashMaps.get(charFreq) != null) {
                hashMapOfHashMaps.get(charFreq).add(i);
                hashMapOfHashMaps.put(charFreq, hashMapOfHashMaps.get(charFreq));
            } else { 
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                hashMapOfHashMaps.put(charFreq, list);
            }

        }
        // list of 
        List<List<String>> anagramGroups = new ArrayList<List<String>>();
        for (Map.Entry<HashMap<Character, Integer>, List<Integer>> entry: hashMapOfHashMaps.entrySet()) {
            // Map.Entry is a key value pair
            List stringList = new ArrayList<String>();
            for (Integer integer: entry.getValue()) {
                stringList.add(strs[integer]);
            }
            anagramGroups.add(stringList);
        }
        return (List<List<String>>) anagramGroups;
    }

    // for each string in given array, create hashmap of key-value (letter-frequency) pairs
    // make a list of these hashmaps and their indicies (values being a list)  
}
