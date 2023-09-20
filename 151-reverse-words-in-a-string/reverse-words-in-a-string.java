class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        String result="";

        while(i>=0)
    {
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        if(i<0)
        {
            break;
        }
        int j=i;
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
        }

        if(result.isEmpty())
        {
            result=result.concat(s.substring(i+1,j+1));
        }
        else
        {
            result=result.concat(" "+s.substring(i+1,j+1));
        }

    }

        return result;
    }
}
