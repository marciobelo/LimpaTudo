package limpatudo;

import java.math.BigDecimal;

public class Produto {

    private Long id;

    private BigDecimal precoAtual;

    private String descricao;

    public Produto(Long id, BigDecimal precoAtual, String descricao) {
        this.id = id;
        this.precoAtual = precoAtual;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrecoAtual() {
        return precoAtual;
    }

    public String getDescricao() {
        return descricao;
    }
}
