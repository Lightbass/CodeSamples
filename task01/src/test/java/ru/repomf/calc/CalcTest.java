package ru.repomf.calc;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by a.makarov on 29.06.2018.
 */
public class CalcTest {

    /**
     * Test.
     * Тестирование деления.
     */
    @Test
    public void whenDiv() {
        Calc c = new Calc();

        c.div(4, 2);
        assertThat(c.getResult(), is(2.0));
        c.div(5, 2);
        assertThat(c.getResult(), is(2.5));
    }

    /**
     * Test.
     * Тестирование умножения.
     */
    @Test
    public void whenMul() {
        Calc c = new Calc();

        c.mul(111, 9);
        assertThat(c.getResult(), is(999.0));
        c.mul(23, 10);
        assertThat(c.getResult(), is(230.0));
    }

    /**
     * Test.
     * Тестирование вычитания.
     */
    @Test
    public void whenSub() {
        Calc c = new Calc();

        c.sub(99, 9);
        assertThat(c.getResult(), is(90.0));
        c.sub(0, 9);
        assertThat(c.getResult(), is(-9.0));
    }

    /**
     * Test.
     * Тестирование сложение.
     */
    @Test
    public void whenAdd() {
        Calc c = new Calc();

        c.add(4, 9);
        assertThat(c.getResult(), is(13.0));
        c.add(55, 44);
        assertThat(c.getResult(), is(99.0));
    }

    /**
     * Test.
     * Тестирование метода операции чисел в строке.
     */
    @Test
    public void whenStringOp(){
        Calc c = new Calc();

        c.stringOp("600(sdasdas) /200(ghnfh)+300(hjfg)*    1000(ghfghf) -300(fghdfgd) + 600(dfgdfgd)");
        assertThat(c.getResult(), is(303300.0));
    }





}
