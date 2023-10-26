package limpatudo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import limpatudo.ItemVenda;
import limpatudo.NotaVenda;
import limpatudo.Produto;

public class NotaVendaTest {

    @Test
    public void testGetValorTotal() {

        NotaVenda nv = obterNotaVendaParaTeste();

        Assert.assertEquals( new BigDecimal("49.5"), nv.getValorTotal());
    }

    private NotaVenda obterNotaVendaParaTeste() {
        Produto sabonete = new Produto(1L, BigDecimal.valueOf(5), "Sabonete");
        Produto shampoo = new Produto(2L, BigDecimal.valueOf(20), "Shampoo");
        Produto escova = new Produto(3L, BigDecimal.valueOf(7), "Escova");
        ItemVenda[] itens = { 
            new ItemVenda(1L, sabonete, BigDecimal.valueOf(4.5), 2),
            new ItemVenda(2L, shampoo, BigDecimal.valueOf(21), 1),
            new ItemVenda(3L, escova, BigDecimal.valueOf(6.5), 3)
        };
        NotaVenda nv = new NotaVenda(1L, LocalDateTime.of(2023, 10, 25, 8, 45, 1), itens);
        return nv;
    }

    @Test
    @Ignore
    public void gerarExtratoTeste() {
        NotaVenda nv = obterNotaVendaParaTeste();
        Assert.assertEquals(
            "01 Sabonete.....   4,50 x  2 =      9,00\n" +
            "02 Shampoo......  21,00 x  1 =     21,00\n" +
            "03 Escova.......   6,50 x  3 =     19,50\n" +
            "\n" +
            "Volumes=  6        Valor Total:    49,50",
            nv.gerarExtrato());
    }
}
