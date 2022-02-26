/**
 * @author YFCodeDream
 * @version 1.0.0
 * @date 2022/2/26
 * @description move-to-front启发式
 */
public class MTFSimpleUSet<T> implements SimpleUSet<T> {
    private final LinkedSimpleList<T> elements;

    public MTFSimpleUSet() {
        elements = new LinkedSimpleList<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * 集合的添加元素方法
     * 对底层链表进行遍历，若检索到相等元素，则返回false，并将该节点移动至底层链表头部
     * 若未检索到，则在底层链表尾部添加元素
     * @param x the element to be added to the set
     * @return 是否添加成功
     */
    @Override
    public boolean add(T x) {
        int index = 0;
        for (T element : elements) {
            if (element.equals(x)) {
                elements.removeToFirst(index);
                return false;
            }
            index += 1;
        }
        elements.add(elements.size(), x);
        return true;
    }

    /**
     * 集合的删除元素方法
     * 若检索到对应元素，则将其对应节点删除并将值返回
     * 若未检索到，则返回null
     * @param x the element to be removed from the set (if present)
     * @return 已删除的元素
     */
    @Override
    public T remove(T x) {
        int index = 0;
        for (T element : elements) {
            if (element.equals(x)) {
                return elements.remove(index);
            }
            index += 1;
        }
        return null;
    }

    /**
     * 集合的查找元素方法
     * 若检索到对应元素，则将其返回，并将该节点移动至底层链表头部
     * 若未检索到，则返回null
     * @param x the element to be found in the set
     * @return 待查找的元素
     */
    @Override
    public T find(T x) {
        int index = 0;
        for (T element : elements) {
            if (element.equals(x)) {
                elements.removeToFirst(index);
                return x;
            }
            index += 1;
        }
        return null;
    }
}
