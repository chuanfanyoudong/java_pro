package java_algorithm;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max_s = (height.length - 1) * Math.min(height[height.length - 1], height[0]);
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int max_tmp = (j - i) * Math.min(height[j ], height[i]);
            max_s = Math.max(max_tmp, max_s);
            if (height[j ] < height[i]) {
                j--;
            } else {
                i++;
            }
        }
        return max_s;
    }


    public  static void main(String[] args) {
        ContainerWithMostWater long_1 = new ContainerWithMostWater();
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(long_1.maxArea(height));
    }
}
