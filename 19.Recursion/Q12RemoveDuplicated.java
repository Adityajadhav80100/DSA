public class Q12RemoveDuplicated {
   
   public static String removeDuplicates(String str, StringBuilder newStr, int idx, boolean map[]){
        // base case
        if(idx == str.length()){
            return newStr.toString();
        }
        // recursive case
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            return removeDuplicates(str, newStr, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            return removeDuplicates(str, newStr, idx + 1, map);
        }
    }


    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        System.out.println(removeDuplicates(str, newStr, 0, map)); 
    }
}
