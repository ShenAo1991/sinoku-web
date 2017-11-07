import org.apache.commons.codec.language.Soundex;
import org.apache.log4j.helpers.AbsoluteTimeDateFormat;
import org.junit.Test;

/**
 * Created by ao.shen on 2017/9/6.
 */
public class SortsExercise {

    /**
     * 冒泡排序算法 示例
     * @param tmpArray
     * @return
     */
    public int[] bubbleSort(int[] tmpArray){

        int length = tmpArray.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(tmpArray[j]>=tmpArray[j+1]){
                    int _tmp = tmpArray[j];
                    tmpArray[j] = tmpArray[j+1];
                    tmpArray[j+1] = _tmp;
                }
            }
        }
        return  tmpArray;
    }



    public void quickSort(int[] nums,int start,int end){

        int low = start;
        int high = end;
        int aver = nums[start];
        while (low<high){
            while(aver<nums[high]){
                high--;
            }
            if(low<high){
                int tmp = nums[low];
                nums[low] = nums[high];
                nums[high] = tmp;
                low++;
            }
            while (low<high&&nums[low]<aver){
                low++;
            }
            if(low<high){
                int tmp = nums[low];
                nums[low] = nums[high];
                nums[high] = tmp;
                high--;
            }
        }
        if(low>start){
            quickSort(nums,start,low-1);
        }
        if(high<end){
            quickSort(nums,low-1,end);
        }


    }



    @Test
    public void testBubbleSort(){
        int[] tmp = {3,7,3,4,5,66,333,11,3,888,999,777};
        //tmp = this.bubbleSort(tmp);
        this.quickSort(tmp,0,tmp.length-1);
        for(int i : tmp){
            System.out.println(i);
        }
    }

}
