package com.murat.gumusay.harcama;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
public class HarcamaHesaplayiciTest {
@Test
    void tekGiderSatirindaToplamGiderOSatirinTutaridir() {
        String csv = """
                tarih;aciklama;tutar
                2026-10-03;MIGROS KADIKOY;-412,50
                """;

                BigDecimal toplamGider = new HarcamaHesaplayici().toplamGider(csv);

        assertThat(toplamGider).isEqualByComparingTo("412.50");
    }
}
