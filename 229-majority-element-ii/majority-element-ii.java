class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            if(list.size()==0 || list.get(0) != nums[i]){

            for(int j=0;j<n;j++){
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
            if(cnt > n/3){
                list.add(nums[i]);
            }

            }
            if(list.size()==2)
            {
                break;
            }
        }

        return list;
    }
}

