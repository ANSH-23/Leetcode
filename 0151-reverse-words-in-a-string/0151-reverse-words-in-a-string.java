class Solution {
    public String reverseWords(String s) {

        int i = 0;
        List<String> list = new ArrayList<>();

        while (i < s.length()) {
            StringBuilder sb = new StringBuilder();

            while (i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i++));
            }

            if (sb.length() != 0)
                list.add(sb.toString());

            i++;
        }

        StringBuilder ans = new StringBuilder();

        for (int j = list.size() - 1; j >= 0; j--) {
            ans.append(list.get(j)).append(" ");
        }

        ans.deleteCharAt(ans.length() - 1);

        return ans.toString();
    }
}