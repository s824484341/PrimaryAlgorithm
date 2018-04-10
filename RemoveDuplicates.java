/*����һ���������飬����Ҫԭ��ɾ�����е��ظ����ݣ�ʹÿ��Ԫ��ֻ����һ��,�������µĳ��ȡ�

��Ҫ���ⶨ��һ�����飬������ͨ���� O(1) �����ڴ�ԭ���޸������������������һ�㡣

ʾ����

��������: nums = [1,1,2],

��ĺ���Ӧ�÷����³��� 2, ����ԭ����nums��ǰ����Ԫ�ر�����1��2
����Ҫ����µ����鳤�Ⱥ����Ԫ��*/
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) 
			return 0;
		
        int index = 1;
        for(int i =1;i<nums.length;i++){
            
            if(nums[i] != nums[i-1]){
                nums[index++]=nums[i];
            }
            
        }
        return index;
    }
	
	public static void main(String[] args) {
		int[] a = new int[]{1,1,2};
		
		int index = removeDuplicates(a);
		
		System.out.println(index);//2
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);//[1,2,2]
		}
		
	}
	
}
