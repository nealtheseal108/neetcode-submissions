class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //     HashMap<HashMap<Character, Integer>, List<Integer>> hashMapOfHashMaps = new HashMap<HashMap<Character, Integer>, List<Integer>>();
    //     for (int i = 0; i < strs.length; i++)  // amount of strings
    //     {
    //         String str = strs[i];
    //         HashMap<Character, Integer> charFreq = new HashMap<>();
    //         char[] charArray = str.toCharArray();
    //         // for each character, count frequency
    //         for (char c: charArray) {
    //             if (charFreq.get(c) != null) {
    //                 charFreq.put(c, charFreq.get(c) + 1);
    //             } else {
    //                 charFreq.put(c, 1);
    //             }
    //         }
    //         if (hashMapOfHashMaps.get(charFreq) != null) {
    //             hashMapOfHashMaps.get(charFreq).add(i);
    //             hashMapOfHashMaps.put(charFreq, hashMapOfHashMaps.get(charFreq));
    //         } else { 
    //             ArrayList<Integer> list = new ArrayList<Integer>();
    //             list.add(i);
    //             hashMapOfHashMaps.put(charFreq, list);
    //         }

    //     }
    //     // list of 
    //     List<List<String>> anagramGroups = new ArrayList<List<String>>();
    //     for (Map.Entry<HashMap<Character, Integer>, List<Integer>> entry: hashMapOfHashMaps.entrySet()) {
    //         // Map.Entry is a key value pair
    //         List stringList = new ArrayList<String>();
    //         for (Integer integer: entry.getValue()) {
    //             stringList.add(strs[integer]);
    //         }
    //         anagramGroups.add(stringList);
    //     }
    //     return (List<List<String>>) anagramGroups;
     // // for each string in given array, create hashmap of key-value (letter-frequency) pairs
    // // make a list of these hashmaps and their indicies (values being a list)  
    // // add values to each List
    // // return list
        HashMap<String, List<String>> countToListOfAnagrams = new HashMap<String, List<String>>();
        for (String str: strs) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[(int) c - (int)'a']++; // cast as int to make each letter numerical and enable adding of frequency of letters
            }
            if (countToListOfAnagrams.get(Arrays.toString(count)) != null) {
                countToListOfAnagrams.get(Arrays.toString(count)).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                countToListOfAnagrams.put(Arrays.toString(count), list); // make sure to typecast
            }
        }

        // two different int[] arrays have differnet hashcodes and so will count as different arrays in hashmap - Strings are content-based however
        // use Arrays.toString() 

        List<List<String>> listOfAnagramLists = new ArrayList<List<String>>();
        for (Map.Entry<String, List<String>> entry: countToListOfAnagrams.entrySet()) {
            listOfAnagramLists.add(entry.getValue());
        }

        return listOfAnagramLists;
    }
    // we can also sort each string to show up in alpha order (n log n per string where n is number of chars) - do this m times
    // we can count the frequncy of each letter -> hashmap
    // key will be frequncy of each letter and value will be list of the anagrams
    // TC will be O(mn) where m is number of input strings and n is average length of each string
    // need to go through every single character in every single string
    // we'll use a count array of length 26 as well
    // O(mn)

   

}
