package ru.repomf.word;

import org.junit.Test;

/**
 * Created by a.makarov on 11.07.2018.
 */
public class TestWordIndex {
    @Test
    public void testIndexOfMethod(){
        WordIndex wi = new WordIndex("Hello, world. Hello.");
        System.out.println(wi.indexOf("Hello"));

        wi = new WordIndex("2.\tJS – все программисты указали, что есть рад задач, в которых нужно применения этого языка. \n" +
                "Java программист начинает использовать JS, когда дошел до JEE. Такой человек понял, что он хочет стать профессиональным программистом. Поэтому я советую рассмотреть вот этот курс - ссылка \n" +
                "3.\tSQL – используется опять же везде. SQL JDBC Hibernate Spring Data подробно рассматриваются в курсе - ссылка \n" +
                "4.\tLinux – основные команды. Все что нужно для Java программиста собрано в открытом курсе тут - ссылка \n" +
                "5.\tДебаг и отладка приложения – посмотрите видео - ссылка \n" +
                "6.\tАнглийский – Мы готовим серию статей – «Английский для программиста». ");
        System.out.println(wi.indexOf("программист"));
    }
}
