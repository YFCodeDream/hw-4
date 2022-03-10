/**
 * @author YFCodeDream
 * @version 1.0.0
 * @date 2022/3/10
 * @description test main
 */
public class Main {
    public static void main(String[] args) {
        LinkedSimpleList<Integer> integerLinkedSimpleList = new LinkedSimpleList<>();
        int[] testArr = {3, 2, 4, 1, 5};
        for (int i = 0; i < testArr.length; i++) {
            integerLinkedSimpleList.add(i, testArr[i]);
        }
        System.out.println(integerLinkedSimpleList);
        integerLinkedSimpleList.reverse();
        System.out.println(integerLinkedSimpleList);
    }
}
