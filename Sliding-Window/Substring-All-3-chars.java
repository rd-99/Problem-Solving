//Number of Substrings Containing All Three Characters
//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
//Given a string s consisting only of characters a, b and c return the number of substrings containing at least one occurrence of all these characters a, b and c.

public int numberOfSubstrings(String s) {
    int idxA = -1,idxB = -1 , idxC = -1 , st = 0,count = 0;
    for(int end = 0;end < s.length(); ++end){

        if(s.charAt(end) == 'a') idxA = end;
        else if(s.charAt(end) == 'b') idxB = end;
        else idxC = end;

        if(idxA >= 0 && idxB >=0 && idxC >= 0){
            st = Math.min(Math.min(idxA,idxB) , idxC) ;
            count += st + 1;
        }
    }
    return count;
    
}
//Inefficient Solution - no extendable to k characters

//Propert Solution
//Time Complexity: O(n)
//Space Complexity: O(k) where k is the number of characters
//Look for the smallest window that contains all the characters and 
//count till the end of the string instead of start like above soln
class Solution {
    public int numberOfSubstrings(String s) {
        char[] ch=s.toCharArray();
        int[] arr=new int[3];

        int l=0, count=0, ans=0;
        
        for(int r=0;r<ch.length;r++){
            if(arr[ch[r]-'a']++==0)
            {
                count++;
            }
            while(count==3)
            {
                ans=ans+ch.length-r;
                if(arr[ch[l++]-'a']--==1)
                {
                    count--;
                }
            }
        }
        return ans;
    }
}