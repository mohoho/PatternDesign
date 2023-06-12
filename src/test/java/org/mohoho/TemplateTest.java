package org.mohoho;

import org.junit.Test;
import org.mohoho.important.template.ProgramerWorker;
import org.mohoho.important.template.TesterWorker;

/**
 * @author qmruan
 * @date 2023/6/9 19:20
 */
public class TemplateTest {

    @Test
    public void test1() {
        ProgramerWorker xiaoruan = new ProgramerWorker("xiaoruan");
        xiaoruan.workOneDay();

        TesterWorker xiaoming = new TesterWorker("xiaoming");
        xiaoming.workOneDay();
    }
}
