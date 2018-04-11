package zgc.org.lib.template;

import java.util.Arrays;
import java.util.List;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/11 下午6:22
 * Description:
 **/
public class Main {
    public static void main(String[] args) {
        //对整型数组排序
        int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int operations = new IntBubbleSorter().sort(intArray);
        LogUtil.d("[Template Method] operations:" + operations + ", array:" + Arrays.toString(intArray));

        //对double数组排序
        double[] doubleArray = {9.9, 8.8, 7.7, 6.6, 5.5, 4.4, 3.3, 2.2, 1.1, 0.0};
        operations = new DoubleBubbleSorter().sort(doubleArray);
        LogUtil.d("[Template Method] operations:" + operations + ", array:" + Arrays.toString(doubleArray));

        //对List集合排序
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        operations = new IntegerListBubbleSorter().sort(list);
        LogUtil.d("[Template Method] operations:" + operations + ", list:" + list.toString());
    }
}
