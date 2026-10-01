1class Solution { 
2    public List<Integer> findValidElements(int[] nums) { 
3        List<Integer> list = new ArrayList<>(); 
4        for(int i = 0; i < nums.length; i++) { 
5            boolean validLeft = true;
6            boolean validRight = true;
7            int left = 0; 
8            while(left < i) { 
9                if (nums[left] >= nums[i]) {
10                    validLeft = false; 
11                    break;
12                }
13                left++; 
14            } 
15            int right = i + 1; 
16            while(right < nums.length) { 
17                if (nums[i] <= nums[right]) {
18                    validRight = false; 
19                    break;
20                }
21                right++; 
22            } 
23            if (validLeft || validRight) {
24                list.add(nums[i]);
25            }
26        } 
27        return list; 
28    } 
29}
30