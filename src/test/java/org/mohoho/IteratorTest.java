package org.mohoho;

import org.junit.Test;
import org.mohoho.important.Iterator.Iterable;
import org.mohoho.important.Iterator.NameRepository;

/**
 * @author qmruan
 * @date 2023/6/12 18:47
 */
public class IteratorTest {
    @Test
    public void test1() {
        NameRepository nameRepository = new NameRepository();
        Iterable iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
