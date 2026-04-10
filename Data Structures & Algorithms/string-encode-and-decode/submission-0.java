class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();
        for(String s:strs)
        {
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();
    }

       public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            // Step 1: find '#'
            while (s.charAt(j) != '#') {
                j++;
            }

            // Step 2: extract length
            int len = Integer.parseInt(s.substring(i, j));

            // Step 3: extract string
            j++; // move past '#'
            String word = s.substring(j, j + len);

            res.add(word);

            // Step 4: move pointer
            i = j + len;
        }

        return res;
    }

}
