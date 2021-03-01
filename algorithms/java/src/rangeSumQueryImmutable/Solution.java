package rangeSumQueryImmutable;
/*
303.
使用到前缀和算法
新建一个数组sums用来存储前n项和
 */
public class Solution {
    int[] sums;

    public Solution(int[] nums) {
        int n=nums.length;
        sums=new int[n+1];
        for(int i=0;i<n;i++){
            sums[i+1]=sums[i]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
//主函数
    public static void main(String[] args) {
        int[] nums={-2,0,3,-5,2,-1};

    }
}
