package zgc.org.lib.template;

/**
 * Author: zgc
 * Time: 2018/4/11 下午6:21
 * Description:
 **/
public class DoubleBubbleSorter extends BubbleSorter<double[]> {
    private double[] array;

    @Override
    protected void setArray(double[] array) {
        this.array = array;
    }

    @Override
    protected int getLength() {
        return array == null ? 0 : array.length;
    }

    @Override
    protected boolean needSwap(int index) {
        return array != null && (array[index] > array[index + 1]);
    }

    @Override
    protected void swap(int index) {
        double temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }
}
