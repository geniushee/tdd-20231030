package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalcTest {
    Calc Calc = new Calc();
    @Test
    @DisplayName("Calc의 run메소드는 int를 리턴한다.")
    void t1(){
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2(){
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t3() {
        int rs = Calc.run("10 + 20");
        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("10 * 30 = 300")
    void t4() {
        int rs = Calc.run("10 * 30");
        assertThat(rs).isEqualTo(300);
    }

    @Test
    @DisplayName("30 - 10 = 310")
    void t5() {
        int rs = Calc.run("30 - 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("30 / 10 = 3")
    void t6() {
        int rs = Calc.run("30 / 10");
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("10 + 30 * 10  = 3")
    void t7() {
        int rs = Calc.run("10 + 30 / 10");
        assertThat(rs).isEqualTo(13);
    }
}
