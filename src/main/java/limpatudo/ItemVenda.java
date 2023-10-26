package limpatudo;

import java.math.BigDecimal;

public class ItemVenda {

    private Long ordinal;

    private Produto produto;

    private BigDecimal precoNaDataDeVenda;

    private Integer quantidade;

    public ItemVenda(Long ordinal, Produto produto, BigDecimal precoNaDataDeVenda, Integer quantidade) {
        this.ordinal = ordinal;
        this.produto = produto;
        this.precoNaDataDeVenda = precoNaDataDeVenda;
        this.quantidade = quantidade;
    }

    public Long getOrdinal() {
        return ordinal;
    }

    public Produto getProduto() {
        return produto;
    }

    public BigDecimal getPrecoNaDataDeVenda() {
        return precoNaDataDeVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }    
}
